/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.library.frames;

import com.library.librarianInterface.LibrarianInterface;
import com.library.util.DatabaseAccess;
import com.library.studentInterface.StudentInterface;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
//@SuppressWarnings("unusedelements")
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        systemLoginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        newUserLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registerComboBox = new javax.swing.JComboBox<>();
        roleComboBox = new javax.swing.JComboBox<>();
        passwordLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        rememberMeCheckBox = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Catalog System - Login");
        setResizable(false);

        rootPanel.setBackground(new java.awt.Color(34, 42, 44));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        systemLoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        systemLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        systemLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemLoginLabel.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemLoginLabel)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        newUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUserLabel.setText("New User?");

        registerButton.setBackground(new java.awt.Color(51, 51, 51));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register Here");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });

        registerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Librarian" }));
        registerComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Librarian", "Student" }));
        roleComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password: ");

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });

        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role:");

        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username/Email: ");

        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseEntered(evt);
            }
        });

        rememberMeCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        rememberMeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        rememberMeCheckBox.setText("Remember Me");
        rememberMeCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rememberMeCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rememberMeCheckBoxMouseEntered(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(51, 51, 51));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rememberMeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(newUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextField)
                            .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(loginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleLabel)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rememberMeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(homeButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserLabel)
                    .addComponent(registerButton)
                    .addComponent(registerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        String registerChoice = registerComboBox.getSelectedItem().toString();
        if (registerChoice.equalsIgnoreCase("Student")) {
            new StudentFrame().setVisible(true);
        } else {
            new LibrarianFrame().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_registerButtonMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setToolTipText("Register as a new User");
        registerButton.setBackground(new Color(250, 250, 250));
        registerButton.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        new HomeMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setToolTipText("Back to Home Page");
        homeButton.setBackground(new Color(250, 250, 250));
        homeButton.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void usernameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseEntered
        usernameTextField.setToolTipText("Enter UserName");
    }//GEN-LAST:event_usernameTextFieldMouseEntered

    private void rememberMeCheckBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberMeCheckBoxMouseEntered
        rememberMeCheckBox.setToolTipText("Remember Username and Password");
    }//GEN-LAST:event_rememberMeCheckBoxMouseEntered

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        boolean loginSuccess = performLogin();
        if (loginSuccess) {
            DatabaseAccess.addLog("login", "security");
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setToolTipText("Proceed Login");
        loginButton.setBackground(new Color(250, 250, 250));
        loginButton.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(51, 51, 51));
        loginButton.setForeground(new Color(250, 250, 250));
    }//GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButton.setBackground(new Color(51, 51, 51));
        registerButton.setForeground(new Color(250, 250, 250));
    }//GEN-LAST:event_registerButtonMouseExited

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeButton.setBackground(new Color(51, 51, 51));
        homeButton.setForeground(new Color(250, 250, 250));
    }//GEN-LAST:event_homeButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JComboBox<String> registerComboBox;
    private javax.swing.JCheckBox rememberMeCheckBox;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JLabel systemLoginLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    private boolean authenticateLogin(String providedUsername, String providedPassword) {
        // Retrieve hashed pasword from databse
        String hashedPasswordFromDatabase = retrieveHashedPassword(providedUsername);

        //check if a matching password was found
        if (hashedPasswordFromDatabase != null) {
            return checkPassword(providedPassword, hashedPasswordFromDatabase);
        } else {
            return false;
        }
    }

    // Retrieve and determine the role of the logger 
    private String determineRole(String role) {
        return (role.equalsIgnoreCase("Student") ? "students" : "librarians");
    }

    private boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

    private String retrieveHashedPassword(String providedUsername) {
        String url = "jdbc:mysql://localhost:3306/library catalog system";
        String username = "Jareth";
        String password = "Jareth0223";
        String role = determineRole(roleComboBox.getSelectedItem().toString());

        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement preparedStatement = connection.prepareStatement("SELECT password FROM " + role + " WHERE username = ?")) {

            preparedStatement.setString(1, providedUsername);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("password");
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    private boolean performLogin() {
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());
        String role = determineRole(roleComboBox.getSelectedItem().toString());
        boolean loginSuccess = authenticateLogin(username, password);

        if (loginSuccess) {
            System.out.println("Login successful!");
            if (role.equals("students")) {
                StudentInterface.username = username;
                JOptionPane.showMessageDialog(rootPane, "Login Successful! Welcome Back " + username + "!", "Success: Logged in Successfully", INFORMATION_MESSAGE);
                new StudentInterface().setVisible(true);

            } else {
                LibrarianInterface.username = username;
                JOptionPane.showMessageDialog(rootPane, "Login Successful! Welcome Back " + username + "!", "Success: Logged in Successfully", INFORMATION_MESSAGE);
                new LibrarianInterface().setVisible(true);
            }
            this.dispose(); // Close the current login window
        } else {
            System.out.println("Login Failed.");
            showLoginFailed();
        }
        return loginSuccess;
    }

    private void showLoginFailed() {
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        if (username.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Login failed. Please enter both username and password.", "Error: Login Failed", ERROR_MESSAGE);
        } else if (retrieveHashedPassword(username) == null) {
            JOptionPane.showMessageDialog(rootPane, "Login failed. Username not found. Please check your credentials and try again.", "Error: Login Failed", ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Login failed. Incorrect password. Please check your password and try again.", "Error: Login Failed", ERROR_MESSAGE);
        }
    }
}
