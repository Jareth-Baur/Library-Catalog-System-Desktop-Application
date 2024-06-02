package com.library.util;

import com.library.objects.Book;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author Jareth Baur
 * @since March 22, 2024
 */
public class DatabaseAccess {

    private static final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private static final String SQLUSERNAME = "Jareth";
    private static final String SQLPASSWORD = "Jareth0223";

    public static void addLog(String action, String logType) {
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Prepare the INSERT statement
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO logs (action, timestamp, logType) VALUES (?, ?, ?)");

            // Set the parameters
            preparedStatement.setString(1, action);
            preparedStatement.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            preparedStatement.setString(3, logType);

            // Execute the INSERT statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Log added successfully.");
            } else {
                System.out.println("Failed to add log.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * @param table
     * @return counts total count like books, overdue books, students and active
     * loans
     */
    public static int countTotals(String table) {
        int counter = 0;
        try (Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD); PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS total FROM " + table); ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                counter = resultSet.getInt("total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
        return counter;
    }

    public static int countOverdueLoans() {
        int counter = 0;
        try {
            String selectQuery = "SELECT dueDate FROM borrows";
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String dueDateString = resultSet.getString("dueDate");

                // Parse the due date string with custom formatter
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
                LocalDate dueDate = LocalDate.parse(dueDateString, formatter);

                // Use LocalDate object to check if the loan is overdue
                if (dueDate.isBefore(LocalDate.now())) {
                    counter++;
                }
            }
            connection.close();
            preparedStatement.close();
            resultSet.close();
            return counter;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
        return counter;
    }

    public static void renderSearchResults(DefaultTableModel model, boolean filterUnavailables, String genre, String searchWord) {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        if (searchWord.equals("Search by Title...")) {
            searchWord = "";
        }
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String selectQuery = "SELECT * FROM books";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("bookID"),
                    resultSet.getString("title"),
                    resultSet.getString("author"),
                    resultSet.getString("genre"),
                    resultSet.getString("publicationDate"),
                    resultSet.getString("status")
                };
                String s = row[0].toString() + row[1].toString() + row[2].toString() + row[3].toString() + row[4].toString() + row[5].toString();
                if (filterUnavailables) {
                    if (row[5].toString().equals("available")) {
                        if (genre.equalsIgnoreCase("all")) {
                            if (s.toLowerCase().contains(searchWord)) {
                                model.addRow(row);
                            }
                        } else if (genre.equalsIgnoreCase(row[3].toString())) {
                            if (s.toLowerCase().contains(searchWord)) {
                                model.addRow(row);
                            }
                        }
                    }
                } else {
                    if (genre.equalsIgnoreCase("all")) {
                        if (s.toLowerCase().contains(searchWord)) {
                            model.addRow(row);
                        }
                    } else if (genre.equalsIgnoreCase(row[3].toString())) {
                        if (s.toLowerCase().contains(searchWord)) {
                            model.addRow(row);
                        }
                    }
                }
            }
            connection.close();
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void addGenres(JComboBox jComboBox) {
        HashSet<String> genresSet = new HashSet<>();
        try (Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD); PreparedStatement preparedStatement = connection.prepareStatement("SELECT DISTINCT genre FROM books"); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                genresSet.add(resultSet.getString("genre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ArrayList<String> sortedGenresList = new ArrayList<>(genresSet);
        Collections.sort(sortedGenresList);

        for (String genre : sortedGenresList) {
            jComboBox.addItem(genre);
        }
    }

    public static void viewBorrowedBooks(DefaultTableModel model, String studentID) {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String selectQuery = "SELECT bookID, borrowDate, dueDate, returnedDate FROM borrows WHERE studentID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, studentID); // Set the studentID parameter
            ResultSet resultSet = preparedStatement.executeQuery();

            int rowCount = 0;
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("bookID"),
                    resultSet.getString("borrowDate"),
                    resultSet.getString("dueDate"),
                    resultSet.getString("returnedDate")
                };
                model.addRow(row);
                rowCount++;
            }
            System.out.println("Number of rows retrieved: " + rowCount);

            connection.close();
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void fetchBookInfo(int bookID) {
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String selectQuery = "SELECT bookTitle, author, genre FROM books WHERE bookID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, bookID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String bookTitle = resultSet.getString("bookTitle");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");

                // Now you have the book information, you can display it or perform any other actions
                System.out.println("Book Title: " + bookTitle);
                System.out.println("Author: " + author);
                System.out.println("Genre: " + genre);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error fetching book information: " + e.getMessage());
        }
    }

    // Method to save edited details for borrow and due dates
    public static void saveRenewBooksDetails(int bookID, String newBorrowDate, String newDueDate) {
        try {
            // Replace 'url', 'username', and 'password' with your database connection details
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Retrieve existing borrowDate and dueDate from the database for comparison
            PreparedStatement retrieveStatement = connection.prepareStatement("SELECT borrowDate, dueDate FROM borrows WHERE bookID = ?");
            retrieveStatement.setInt(1, bookID);
            ResultSet resultSet = retrieveStatement.executeQuery();
            resultSet.next();
            String existingBorrowDate = resultSet.getString("borrowDate");
            String existingDueDate = resultSet.getString("dueDate");

            // Check if the new values are different from the existing values
            if (existingBorrowDate.equals(newBorrowDate) && existingDueDate.equals(newDueDate)) {
                JOptionPane.showMessageDialog(null, "No changes detected.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE borrows SET borrowDate = ?, dueDate = ? WHERE bookID = ?");
            // Check if the date formats are valid
            if (!isValidDateFormat(newBorrowDate) || !isValidDateFormat(newDueDate)) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-mm-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Set parameters and execute update
            preparedStatement.setString(1, newBorrowDate);
            preparedStatement.setString(2, newDueDate);
            preparedStatement.setInt(3, bookID);
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update details.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to validate date format
    private static boolean isValidDateFormat(String date) {
        try {
            java.sql.Date.valueOf(date);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static void changePassword(String studentID, String currentPassword) {
        // Prompt user to enter current password
        String enteredPassword = JOptionPane.showInputDialog(null, "Enter your current password:", "Password Confirmation", JOptionPane.PLAIN_MESSAGE);
        if (enteredPassword == null) {
            // User clicked Cancel or closed the dialog
            return;
        }

        // Verify that the entered password matches the password stored in the database
        if (!checkPassword(studentID, enteredPassword)) {
            JOptionPane.showMessageDialog(null, "Incorrect current password.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompt user to enter new password
        String newPassword = JOptionPane.showInputDialog(null, "Enter your new password:", "Change Password", JOptionPane.PLAIN_MESSAGE);
        if (newPassword == null) {
            return;
        }

        // Encrypt the new password using bcrypt
        String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET password = ? WHERE studentID = ?");

            // Set parameters and execute update
            preparedStatement.setString(1, hashedPassword);
            preparedStatement.setString(2, studentID);
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Password changed successfully.");
                JOptionPane.showMessageDialog(null, "Password changed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed to change password.");
                JOptionPane.showMessageDialog(null, "Failed to change password.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static boolean checkPassword(String studentID, String enteredPassword) {
        boolean passwordMatch = false;

        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT password FROM students WHERE studentID = ?");
            preparedStatement.setString(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String hashedPassword = resultSet.getString("password");
                passwordMatch = BCrypt.checkpw(enteredPassword, hashedPassword);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return passwordMatch;
    }

    public static void addTransaction(int bookID, String studentID, String transactionType) {
        try {
            // Replace 'url', 'username', and 'password' with your database connection details
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Prepare the SQL INSERT query
            String sql = "INSERT INTO transactions (bookID, studentID, transactionType, transactionDate) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the values of the parameters
            preparedStatement.setInt(1, bookID);
            preparedStatement.setString(2, studentID);
            preparedStatement.setString(3, transactionType);
            preparedStatement.setDate(4, Date.valueOf(LocalDate.now())); // Set transaction date as current date

            // Execute the query to insert the record
            preparedStatement.executeUpdate();

            // Close the PreparedStatement and database connection
            preparedStatement.close();
            connection.close();

            System.out.println("Transaction added successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void getRecentTransactions(JLabel type, JLabel title, JLabel username) {
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Prepare the SQL query with JOINs to fetch required data
            String sql = "SELECT transactions.transactionType, books.title, students.userName "
                    + "FROM transactions "
                    + "INNER JOIN books ON transactions.bookID = books.bookID "
                    + "INNER JOIN students ON transactions.studentID = students.studentID "
                    + "ORDER BY transactions.transactionDate DESC "
                    + // Assuming transactionDate is the date of the transaction
                    "LIMIT 1";  // Limit to retrieve only recent transactions, adjust as needed

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                String transactionType = type.getText() + " ";
                String bookTitle = title.getText() + " ";
                String studentName = username.getText() + " ";
                type.setText(transactionType + resultSet.getString("transactionType"));
                title.setText(bookTitle + resultSet.getString("title"));
                username.setText(studentName + resultSet.getString("userName"));
            }

            // Close the result set, prepared statement, and database connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static Book[] getAllBooks(String filterGenre) {
        List<Book> books = new ArrayList<>();

        try {
            String selectQuery = "SELECT * FROM books";
            if (filterGenre != null && !filterGenre.equals("All")) {
                selectQuery += " WHERE genre = ?";
            }

            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            if (filterGenre != null && !filterGenre.equals("All")) {
                preparedStatement.setString(1, filterGenre);
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int bookID = resultSet.getInt("bookID");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String publicationDate = resultSet.getString("publicationDate");
                String status = resultSet.getString("status");

                Book book = new Book(bookID, title, author, genre, publicationDate, status);
                books.add(book);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        return books.toArray(new Book[0]);
    }

    public static boolean updateBookDetails(int bookID, String title, String author, String genre, String publicationDate, String status) {
        try {
            // SQL query to update the book details except the bookID
            String updateQuery = "UPDATE books SET title = ?, author = ?, genre = ?, publicationDate = ?, status = ? WHERE bookID = ?";

            // Establish the connection
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            // Set the parameters for the update query
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, genre);
            preparedStatement.setString(4, publicationDate);
            preparedStatement.setString(5, status);
            preparedStatement.setInt(6, bookID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the resources
            preparedStatement.close();
            connection.close();

            // Return true if the update was successful, false otherwise
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            return false;
        }
    }

}
