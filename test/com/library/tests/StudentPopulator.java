package com.library.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author Jareth Baur
 * @since June 3, 2024
 */
public class StudentPopulator {

    private static final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private static final String SQLUSERNAME = "Jareth";
    private static final String SQLPASSWORD = "Jareth0223";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD)) {
            for (int i = 1; i <= 20; i++) {
                String username = "student" + i;
                String password = username;
                String fullName = "Student " + i;
                String email = "student" + i + "@gmail.com";
                String phoneNumber = "123456789" + i;
                String address = "Address " + i + ", City " + i + ", Country";
                String course = "Course " + i;
                int yearLevel = i % 4 + 1; // Year levels from 1 to 4
                String section = "Section " + i;

                // Hash the password using BCrypt
                String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

                String insertQuery = "INSERT INTO students (fullName, userName, email, password, phoneNumber, address, course, yearLevel, section) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setString(1, fullName);
                preparedStatement.setString(2, username);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, hashedPassword);
                preparedStatement.setString(5, phoneNumber);
                preparedStatement.setString(6, address);
                preparedStatement.setString(7, course);
                preparedStatement.setInt(8, yearLevel);
                preparedStatement.setString(9, section);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Student " + i + " added successfully!");
                } else {
                    System.out.println("Failed to add student " + i);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
