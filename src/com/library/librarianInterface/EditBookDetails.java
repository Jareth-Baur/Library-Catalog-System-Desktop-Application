package com.library.librarianInterface;

import com.library.util.DatabaseAccess;
import com.library.util.DateParser;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * @author Jareth Baur
 * @since May 3, 2024
 */
public class EditBookDetails extends javax.swing.JFrame {

    private final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private final String SQLUSERNAME = "Jareth";
    private final String SQLPASSWORD = "Jareth0223";
    public String bookID;

    /**
     * Creates new form BookFrame
     *
     * @param bookID
     */
    public EditBookDetails(String bookID) {
        this.bookID = bookID;
        initComponents();
        DatabaseAccess.addGenres(genreField);
        displayDetailsOnFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        updateBookLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        bookTitleField = new javax.swing.JTextField();
        publicationDateField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        genreField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        statusField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Catalog System - Add New Book");

        rootPanel.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        updateBookLabel.setBackground(new java.awt.Color(204, 204, 255));
        updateBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBookLabel.setText("Update Book");
        updateBookLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBookLabel.setOpaque(true);
        updateBookLabel.setPreferredSize(new java.awt.Dimension(45, 27));
        updateBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBookLabelMouseExited(evt);
            }
        });

        cancelLabel.setBackground(new java.awt.Color(204, 204, 255));
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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Edit Book Details");

        statusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "unavailable" }));
        statusField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Status"));
        statusField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(publicationDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genreField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(publicationDateField)
                    .addComponent(statusField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void updateBookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBookLabelMouseClicked
        try {
            int bookID = Integer.parseInt(this.bookID);
            String title = bookTitleField.getText();
            String author = authorField.getText();
            String genre = genreField.getSelectedItem().toString();
            String publicationDate = publicationDateField.getText();
            String status = statusField.getSelectedItem().toString();

            // Validate publication date format
            if (!isValidDateFormat(publicationDate)) {
                JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-mm-dd.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDate parsedDate = DateParser.parseDate(publicationDate);

            // Update book details
            boolean success = DatabaseAccess.updateBookDetails(bookID, title, author, genre, (parsedDate + ""), status);

            if (success) {
                JOptionPane.showMessageDialog(this, "Book details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Refresh the table or perform other necessary UI updates here
                this.dispose();
                new LibrarianInterface().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update book details.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid book ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBookLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
        new LibrarianInterface().setVisible(true);
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelLabel.setBackground(new Color(255, 67, 70));
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelLabel.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_cancelLabelMouseExited

    private void updateBookLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBookLabelMouseEntered
        updateBookLabel.setBackground(new Color(102, 255, 102));
    }//GEN-LAST:event_updateBookLabelMouseEntered

    private void updateBookLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBookLabelMouseExited
        updateBookLabel.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_updateBookLabelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JComboBox<String> genreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField publicationDateField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JComboBox<String> statusField;
    private javax.swing.JLabel updateBookLabel;
    // End of variables declaration//GEN-END:variables

    // Method to validate date format (yyyy-mm-dd)
    private boolean isValidDateFormat(String date) {
        try {
            java.sql.Date.valueOf(date);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private void displayDetailsOnFields() {
        try {
            int bookID = Integer.parseInt(this.bookID);

            // Query to get the book details
            String query = "SELECT title, author, genre, publicationDate, status FROM books WHERE bookID = ?";

            // Establish the connection
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set the bookID parameter
            preparedStatement.setInt(1, bookID);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // If book details are found, set them in the fields
            if (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String publicationDate = resultSet.getString("publicationDate");
                String status = resultSet.getString("status");

                bookTitleField.setText(title);
                authorField.setText(author);
                genreField.setSelectedItem(genre);
                publicationDateField.setText(publicationDate);
                statusField.setSelectedItem(status);
            } else {
                // If no book found, clear the fields
                bookTitleField.setText("");
                authorField.setText("");
                genreField.setSelectedItem("");
                publicationDateField.setText("");
                statusField.setSelectedItem("");
                JOptionPane.showMessageDialog(this, "No book found with the provided bookID.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the resources
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid book ID format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
