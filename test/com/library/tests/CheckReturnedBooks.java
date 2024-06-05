package com.library.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Jareth Baur
 * @since June 5, 2024
 */
public class CheckReturnedBooks {

    private static final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private static final String SQLUSERNAME = "Jareth";
    private static final String SQLPASSWORD = "Jareth0223";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Select returned books from borrows table
            String selectQuery = "SELECT * FROM borrows WHERE returnedDate IS NOT NULL AND status = 'borrowed'";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            // Insert transactions for returned books
            String insertQuery = "INSERT INTO transactions (bookID, studentID, transactionType, transactionDate) VALUES (?,?,?,?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

            // Update status of returned books in borrows table
            String updateQuery = "UPDATE borrows SET status = 'returned' WHERE borrowID =?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);

            while (resultSet.next()) {
                int bookID = resultSet.getInt("bookID");
                int studentID = resultSet.getInt("studentID");

                insertStatement.setInt(1, bookID);
                insertStatement.setInt(2, studentID);
                insertStatement.setString(3, "return");
                insertStatement.setDate(4, new java.sql.Date(System.currentTimeMillis()));

                insertStatement.executeUpdate();

                updateStatement.setInt(1, resultSet.getInt("borrowID"));
                updateStatement.executeUpdate();
            }

            insertStatement.close();
            updateStatement.close();
            connection.close();

            System.out.println("Transactions for returned books added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
