package com.library.objects;

import java.util.Objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Transaction {

    private int transactionID;
    private int bookID;
    private int studentID;
    private String transactionType;
    private String transactionDate;

    public Transaction(int transactionID, int bookID, int studentID, String transactionType, String transactionDate) {
        this.transactionID = transactionID;
        this.bookID = bookID;
        this.studentID = studentID;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.transactionID;
        hash = 79 * hash + this.bookID;
        hash = 79 * hash + this.studentID;
        hash = 79 * hash + Objects.hashCode(this.transactionType);
        hash = 79 * hash + Objects.hashCode(this.transactionDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaction other = (Transaction) obj;
        if (this.transactionID != other.transactionID) {
            return false;
        }
        if (this.bookID != other.bookID) {
            return false;
        }
        if (this.studentID != other.studentID) {
            return false;
        }
        if (!Objects.equals(this.transactionType, other.transactionType)) {
            return false;
        }
        return Objects.equals(this.transactionDate, other.transactionDate);
    }

}
