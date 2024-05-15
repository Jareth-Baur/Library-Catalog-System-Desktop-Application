/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.library.termsAndConditions;

/**
 * @author Jareth Bayron Baur
 * @since March 11, 2024
 */
public class StudentTermsAndConditions extends javax.swing.JFrame {

    /**
     * Creates new form StudentTermsAndConditions
     */
    public StudentTermsAndConditions() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        gotItButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Library Catalog System - Student Terms and Conditions");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Library Catalog System! These are the following Student terms and conditions:\n\n    Account Responsibility:\n        You are responsible for maintaining the confidentiality of your account credentials (username and password).\n        Notify the system administrator immediately if you suspect any unauthorized use of your account.\n\n    Authorized Use:\n        Your account is for your personal use only and is not transferable.\n        Do not share your login credentials with unauthorized individuals.\n\n    Data Accuracy:\n        You agree to provide accurate and up-to-date information during registration.\n        Keep your account details, including contact information and address, accurate and current.\n\n    Privacy Policy:\n        Your information is subject to our privacy policy. Refer to the privacy policy for details on how your data is collected, used, and protected.\n\n    Communication Preferences:\n        By registering, you may receive communications related to your account, system updates, and library-related information.\n        You can manage your communication preferences in your account settings.\n\n    Acceptable Use:\n        Use the system for library-related activities within the scope of your user type (e.g., librarian, patron).\n        Do not engage in any activities that may compromise the integrity or security of the system.\n\n    Termination of Account:\n        The system administrator reserves the right to terminate or suspend your account for violation of these terms and conditions.\n\n    Acceptance of Terms:\n        By clicking the \"Register\" button, you acknowledge that you have read, understood, and agreed to abide by these terms and conditions.");
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        gotItButton.setBackground(new java.awt.Color(51, 51, 51));
        gotItButton.setForeground(new java.awt.Color(255, 255, 255));
        gotItButton.setText("Got It");
        gotItButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotItButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotItButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gotItButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotItButton)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotItButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotItButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_gotItButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gotItButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
