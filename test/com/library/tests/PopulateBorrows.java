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
public class PopulateBorrows {

    private static final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private static final String SQLUSERNAME = "Jareth";
    private static final String SQLPASSWORD = "Jareth0223";

    public static void main(String[] args) {
        populateBorrows();
    }

    public static void populateBorrows() {
        List<Integer> transactionIDs = getTransactionIDs();
        Random random = new Random();

        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);

            // Insert borrows
            String insertQuery = "INSERT INTO borrows (studentID, bookID, dueDate, borrowDate, returnedDate, status) VALUES (?,?,?,?,?,?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

            for (int i = 0; i < transactionIDs.size(); i++) {
                int transactionID = transactionIDs.get(i);

                // Get studentID and bookID from transactions table
                int studentID = getStudentIDFromTransaction(transactionID);
                int bookID = getBookIDFromTransaction(transactionID);

                // Generate random due date and borrow date
                java.sql.Date borrowDate = new java.sql.Date(System.currentTimeMillis());
                java.sql.Date dueDate = new java.sql.Date(System.currentTimeMillis() + (long) (Math.random() * 30 * 24 * 60 * 60 * 1000));

                // Determine if the book has been returned
                boolean returned = Math.random() < 0.5;
                java.sql.Date returnedDate = returned ? new java.sql.Date(System.currentTimeMillis()) : null;
                String nullReurnedDate = returnedDate + "";
                if (returnedDate == null) {
                    nullReurnedDate = "";
                }
                String status = returned ? "returned" : "borrowed";

                insertStatement.setInt(1, studentID);
                insertStatement.setInt(2, bookID);
                insertStatement.setString(3, dueDate + "");
                insertStatement.setString(4, borrowDate + "");
                insertStatement.setString(5, nullReurnedDate);
                insertStatement.setString(6, status);

                insertStatement.executeUpdate();
            }

            insertStatement.close();
            connection.close();

            System.out.println("Sample borrows added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> getTransactionIDs() {
        List<Integer> transactionIDs = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT transactionID FROM transactions";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                transactionIDs.add(resultSet.getInt("transactionID"));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactionIDs;
    }

    private static int getStudentIDFromTransaction(int transactionID) {
        int studentID = 0;
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT studentID FROM transactions WHERE transactionID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, transactionID);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                studentID = resultSet.getInt("studentID");
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentID;
    }

    private static int getBookIDFromTransaction(int transactionID) {
        int bookID = 0;
        try {
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            String query = "SELECT bookID FROM transactions WHERE transactionID = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, transactionID);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                bookID = resultSet.getInt("bookID");
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookID;
    }
}
