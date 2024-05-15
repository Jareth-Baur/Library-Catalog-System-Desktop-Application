/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Transactions {

    private int transactionID;
    private int bookID;
    private String studentID;
    private String transactionType;
    private String transactionDate;

    public Transactions(int transactionID, int bookID, String studentID, String transactionType, String transactionDate) {
        this.transactionID = transactionID;
        this.bookID = bookID;
        this.studentID = studentID;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    public Transactions(int bookID, String studentID, String transactionType, String transactionDate) {
        this.bookID = bookID;
        this.studentID = studentID;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    public Transactions() {
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @returns the fields to string
     */
    @Override
    public String toString() {
        return "Transactions{" + "transactionID=" + transactionID + ", bookID=" + bookID + ", studentID=" + studentID + ", transactionType=" + transactionType + ", transactionDate=" + transactionDate + '}';
    }
}
