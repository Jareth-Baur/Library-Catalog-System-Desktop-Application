package com.library.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Jareth Baur
 * @since June 4, 2024
 */
public class PopulateSampleTransactions {

    private static final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private static final String SQLUSERNAME = "Jareth";
    private static final String SQLPASSWORD = "Jareth0223";

    public static void main(String[] args) {
        populateTransactions();
    }

    public static void populateTransactions() {
        List<Integer> bookIDs = getBookIDs();
        List<Integer> studentIDs = getStudentIDs();
        Random random = new Random();

        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Insert transactions
            String insertQuery = "INSERT INTO transactions (bookID, studentID, transactionType, transactionDate) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

            // Update book status
            String updateBookStatusQuery = "UPDATE books SET status = 'unavailable' WHERE bookID = ?";
            PreparedStatement updateBookStatusStatement = connection.prepareStatement(updateBookStatusQuery);

            for (int i = 0; i < 30; i++) {
                int bookID = bookIDs.remove(random.nextInt(bookIDs.size()));
                int studentID = studentIDs.get(random.nextInt(studentIDs.size()));

                insertStatement.setInt(1, bookID);
                insertStatement.setInt(2, studentID);
                insertStatement.setString(3, "loan");
                insertStatement.setDate(4, new java.sql.Date(System.currentTimeMillis()));

                insertStatement.executeUpdate();

                // Update the book status to "unavailable"
                updateBookStatusStatement.setInt(1, bookID);
                updateBookStatusStatement.executeUpdate();
            }

            insertStatement.close();
            updateBookStatusStatement.close();
            connection.close();

            System.out.println("Sample transactions added and book statuses updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> getBookIDs() {
        List<Integer> bookIDs = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT bookID FROM books WHERE status = 'available'";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                bookIDs.add(resultSet.getInt("bookID"));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookIDs;
    }

    private static List<Integer> getStudentIDs() {
        List<Integer> studentIDs = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT studentID FROM students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                studentIDs.add(resultSet.getInt("studentID"));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentIDs;
    }
}
