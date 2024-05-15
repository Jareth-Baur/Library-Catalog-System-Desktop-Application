package com.library.studentInterface;

import java.awt.Color;
import java.sql.*;

/**
 * @author Jareth Baur
 * @since March 24, 2024
 */
public class EditProfileDetails extends javax.swing.JFrame {
    
    private String studentID;
    
    private final String SQLURL = "jdbc:mysql://localhost:3306/library catalog system";
    private final String SQLUSERNAME = "Jareth";
    private final String SQLPASSWORD = "Jareth0223";

    /**
     * Creates new form EditProfileDetails
     *
     * @param studentID
     */
    public EditProfileDetails(String studentID) {
        this.studentID = studentID;
        initComponents();
        displayInformation(studentID);
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
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        sectionTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        fullNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        yearLevelComboBox = new javax.swing.JComboBox<>();
        middleNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        courseComboBox = new javax.swing.JComboBox<>();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Library Catalog System -  Edit Profile Details");
        setResizable(false);

        rootPanel.setBackground(new java.awt.Color(34, 42, 44));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        phoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberLabel.setText("Phone Number:");

        phoneNumberTextField.setText("09");
        phoneNumberTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phoneNumberTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phoneNumberTextFieldMouseEntered(evt);
            }
        });

        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address:");

        addressTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addressTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addressTextFieldMouseEntered(evt);
            }
        });

        courseLabel.setForeground(new java.awt.Color(255, 255, 255));
        courseLabel.setText("Course:");

        sectionTextField.setText("Section");
        sectionTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sectionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sectionTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sectionTextFieldFocusLost(evt);
            }
        });
        sectionTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sectionTextFieldMouseEntered(evt);
            }
        });
        sectionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sectionTextFieldKeyPressed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(51, 51, 51));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });

        fullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fullNameLabel.setText("Full Name:");

        firstNameTextField.setText("First Name");
        firstNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });
        firstNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                firstNameTextFieldMouseEntered(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyPressed(evt);
            }
        });

        yearLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        yearLevelComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yearLevelComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearLevelComboBoxMouseEntered(evt);
            }
        });

        middleNameTextField.setText("Middle Name");
        middleNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        middleNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middleNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameTextFieldFocusLost(evt);
            }
        });
        middleNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                middleNameTextFieldMouseEntered(evt);
            }
        });
        middleNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                middleNameTextFieldKeyPressed(evt);
            }
        });

        lastNameTextField.setText("Last Name");
        lastNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });
        lastNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastNameTextFieldMouseEntered(evt);
            }
        });
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyPressed(evt);
            }
        });

        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSBA", "BTLED", "BSA" }));
        courseComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        usernameTextField.setText("Username");
        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseEntered(evt);
            }
        });
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        emailTextField.setText("Email");
        emailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });
        emailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailTextFieldMouseEntered(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyPressed(evt);
            }
        });

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email:");

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(courseLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(middleNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(yearLevelComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(sectionTextField)))
                    .addComponent(addressTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Profile Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNumberTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldMouseEntered
        phoneNumberTextField.setToolTipText("Enter Phone Number");
    }//GEN-LAST:event_phoneNumberTextFieldMouseEntered

    private void addressTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextFieldMouseEntered
        addressTextField.setToolTipText("Enter Address");
    }//GEN-LAST:event_addressTextFieldMouseEntered

    private void sectionTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sectionTextFieldFocusGained
        setTextFieldPlaceholder(sectionTextField, "Section");
    }//GEN-LAST:event_sectionTextFieldFocusGained

    private void sectionTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sectionTextFieldFocusLost
        removeTextFieldPlaceholder(sectionTextField, "Section");
    }//GEN-LAST:event_sectionTextFieldFocusLost

    private void sectionTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionTextFieldMouseEntered
        sectionTextField.setToolTipText("Enter Section");
    }//GEN-LAST:event_sectionTextFieldMouseEntered

    private void sectionTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sectionTextFieldKeyPressed
        sectionTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_sectionTextFieldKeyPressed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
        new StudentInterface().setVisible(true);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void firstNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusGained
        setTextFieldPlaceholder(firstNameTextField, "First Name");
    }//GEN-LAST:event_firstNameTextFieldFocusGained

    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        removeTextFieldPlaceholder(firstNameTextField, "First Name");
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void firstNameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameTextFieldMouseEntered
        firstNameTextField.setToolTipText("Enter First Name");
    }//GEN-LAST:event_firstNameTextFieldMouseEntered

    private void firstNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyPressed
        firstNameTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_firstNameTextFieldKeyPressed

    private void yearLevelComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearLevelComboBoxMouseEntered
        yearLevelComboBox.setToolTipText("Select Year Level");
    }//GEN-LAST:event_yearLevelComboBoxMouseEntered

    private void middleNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameTextFieldFocusGained
        setTextFieldPlaceholder(middleNameTextField, "Middle Name");
    }//GEN-LAST:event_middleNameTextFieldFocusGained

    private void middleNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameTextFieldFocusLost
        removeTextFieldPlaceholder(middleNameTextField, "Middle Name");
    }//GEN-LAST:event_middleNameTextFieldFocusLost

    private void middleNameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_middleNameTextFieldMouseEntered
        middleNameTextField.setToolTipText("Enter Middle Name");
    }//GEN-LAST:event_middleNameTextFieldMouseEntered

    private void middleNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_middleNameTextFieldKeyPressed
        middleNameTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_middleNameTextFieldKeyPressed

    private void lastNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusGained
        setTextFieldPlaceholder(lastNameTextField, "Last Name");
    }//GEN-LAST:event_lastNameTextFieldFocusGained

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        removeTextFieldPlaceholder(lastNameTextField, "Last Name");
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void lastNameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameTextFieldMouseEntered
        lastNameTextField.setToolTipText("Enter Last Name");
    }//GEN-LAST:event_lastNameTextFieldMouseEntered

    private void lastNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyPressed
        lastNameTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lastNameTextFieldKeyPressed

    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        setTextFieldPlaceholder(usernameTextField, "Username");
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        removeTextFieldPlaceholder(usernameTextField, "Username");
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void usernameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseEntered
        usernameTextField.setToolTipText("Enter User Name");
    }//GEN-LAST:event_usernameTextFieldMouseEntered

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
        usernameTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        setTextFieldPlaceholder(emailTextField, "Email");
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        removeTextFieldPlaceholder(emailTextField, "Email");
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void emailTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextFieldMouseEntered
        emailTextField.setToolTipText("Enter Email");
    }//GEN-LAST:event_emailTextFieldMouseEntered

    private void emailTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyPressed
        emailTextField.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_emailTextFieldKeyPressed

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        updateDetails();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        saveButton.setBackground(new Color(54, 81, 207));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        saveButton.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_saveButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_cancelButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField middleNameTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sectionTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JComboBox<String> yearLevelComboBox;
    // End of variables declaration//GEN-END:variables
    /**
     * @param text field and string to remove placeholder from text fields
     */
    private void removeTextFieldPlaceholder(javax.swing.JTextField textField, String text) {
        if (textField.getText().equals("")) {
            textField.setText(text);
            textField.setForeground(new Color(153, 153, 153));
        }
    }

    /**
     * @param text field and string to set placeholder from text fields
     */
    private void setTextFieldPlaceholder(javax.swing.JTextField textField, String text) {
        if (textField.getText().equalsIgnoreCase(text)) {
            textField.setText("");
            textField.setForeground(new Color(153, 153, 153));
        }
    }
    
    private void displayInformation(String studentID) {
        try {
            String selectQuery = "SELECT * FROM `students` WHERE studentID = ?";
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String[] fullName = resultSet.getString("fullName").split(" ");
                firstNameTextField.setText(fullName[0]);
                middleNameTextField.setText(fullName[1]);
                lastNameTextField.setText(fullName[2]);
                usernameTextField.setText(resultSet.getString("userName"));
                emailTextField.setText(resultSet.getString("email"));
                phoneNumberTextField.setText(resultSet.getString("phoneNumber"));
                addressTextField.setText(resultSet.getString("address"));
                switch (resultSet.getString("course")) {
                    case "BSIT" ->
                        courseComboBox.setSelectedIndex(0);
                    case "BSBA" ->
                        courseComboBox.setSelectedIndex(1);
                    case "BTLED" ->
                        courseComboBox.setSelectedIndex(2);
                    case "BSA" ->
                        courseComboBox.setSelectedIndex(3);
                    default ->
                        throw new AssertionError();
                }
                switch (resultSet.getString("yearLevel")) {
                    case "1" ->
                        yearLevelComboBox.setSelectedIndex(0);
                    case "2" ->
                        yearLevelComboBox.setSelectedIndex(1);
                    case "3" ->
                        yearLevelComboBox.setSelectedIndex(2);
                    case "4" ->
                        yearLevelComboBox.setSelectedIndex(3);
                    default ->
                        throw new AssertionError();
                }
                sectionTextField.setText(resultSet.getString("section"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void updateDetails() {
        try {
            String updateQuery = "UPDATE students SET fullName = ?, userName = ?, email = ?, phoneNumber = ?, address = ?, course = ?, yearLevel = ?, section = ? WHERE studentID = ?";
            Connection connection = DriverManager.getConnection(SQLURL, SQLUSERNAME, SQLPASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, firstNameTextField.getText() + " " + middleNameTextField.getText() + " " + lastNameTextField.getText());
            preparedStatement.setString(2, usernameTextField.getText());
            preparedStatement.setString(3, emailTextField.getText());
            preparedStatement.setString(4, phoneNumberTextField.getText());
            preparedStatement.setString(5, addressTextField.getText());
            preparedStatement.setString(6, courseComboBox.getSelectedItem().toString());
            preparedStatement.setInt(7, Integer.parseInt(yearLevelComboBox.getSelectedItem().toString()));
            preparedStatement.setString(8, sectionTextField.getText());
            preparedStatement.setString(9, this.studentID);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Profile details updated successfully!");
                this.dispose();
                StudentInterface.username = usernameTextField.getText();
                new StudentInterface().setVisible(true);
            } else {
                System.out.println("Failed to update details.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
