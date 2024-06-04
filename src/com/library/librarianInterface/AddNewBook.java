package com.library.librarianInterface;

import com.library.util.DatabaseAccess;
import com.library.util.DateParser;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Jareth Baur
 * @since May 3, 2024
 */
public class AddNewBook extends javax.swing.JFrame {

    private final String sqlUrl = "jdbc:mysql://localhost:3306/library catalog system";
    private final String sqlUsername = "Jareth";
    private final String sqlPassword = "Jareth0223";

    /**
     * Creates new form BookFrame
     */
    public AddNewBook() {
        initComponents();
        DatabaseAccess.addGenres(genreField);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addBookLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        bookTitleField = new javax.swing.JTextField();
        publicationDateField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        genreField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Catalog System - Add New Book");

        rootPanel.setBackground(new java.awt.Color(34, 42, 44));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        addBookLabel.setBackground(new java.awt.Color(51, 51, 51));
        addBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        addBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookLabel.setText("Add New Book");
        addBookLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBookLabel.setOpaque(true);
        addBookLabel.setPreferredSize(new java.awt.Dimension(45, 27));
        addBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBookLabelMouseExited(evt);
            }
        });

        cancelLabel.setBackground(new java.awt.Color(51, 51, 51));
        cancelLabel.setForeground(new java.awt.Color(255, 255, 255));
        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLabel.setText("Cancel");
        cancelLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLabel.setOpaque(true);
        cancelLabel.setPreferredSize(new java.awt.Dimension(45, 27));
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });

        bookTitleField.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Title"));

        publicationDateField.setToolTipText("yyyy-mm-dd");
        publicationDateField.setBorder(javax.swing.BorderFactory.createTitledBorder("Publication Date"));

        authorField.setBorder(javax.swing.BorderFactory.createTitledBorder("Author"));

        genreField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Genre"));
        genreField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genreField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicationDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(publicationDateField)
                    .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookLabelMouseClicked
        boolean b = addBook(bookTitleField, authorField, publicationDateField, genreField);
        if (b) {
            this.dispose();
            new LibrarianInterface().setVisible(true);
        }
    }//GEN-LAST:event_addBookLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelLabel.setBackground(new Color(255, 67, 70));
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelLabel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_cancelLabelMouseExited

    private void addBookLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookLabelMouseEntered
        addBookLabel.setBackground(new Color(102, 255, 102));
        addBookLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_addBookLabelMouseEntered

    private void addBookLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookLabelMouseExited
        addBookLabel.setBackground(new Color(51, 51, 51));
        addBookLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_addBookLabelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JComboBox<String> genreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField publicationDateField;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables

    public boolean addBook(JTextField titleField, JTextField authorField, JTextField dateField, JComboBox<String> genreComboBox) {
        boolean b = false;
        // Get the values from the input fields
        String title = titleField.getText().trim();
        String author = authorField.getText().trim();
        String date = dateField.getText().trim();
        String genre = (String) genreComboBox.getSelectedItem();

        // Perform input validation
        if (title.isEmpty() || author.isEmpty() || date.isEmpty() || genre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return b;
        }

        // Validate publication date format
        if (!isValidDateFormat(date)) {
            JOptionPane.showMessageDialog(null, "Invalid publication date format. Please use yyyy-mm-dd.", "Error", JOptionPane.ERROR_MESSAGE);
            return b;
        }
        LocalDate parsedDate = DateParser.parseDate(date);

        try {
            // Replace 'url', 'username', and 'password' with your database connection details
            Connection connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

            // Prepare the INSERT statement
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO books (title, author, publicationDate, genre, status) VALUES (?, ?, ?, ?, 'available')");

            // Set the parameters
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, parsedDate + "");
            preparedStatement.setString(4, genre);

            // Execute the INSERT statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Book added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Book added successfully.");
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add book.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Failed to add book.");
                b = false;
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return b;
        }
        return b;
    }

    // Method to validate date format (yyyy-mm-dd)
    private boolean isValidDateFormat(String date) {
        try {
            java.sql.Date.valueOf(date);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
