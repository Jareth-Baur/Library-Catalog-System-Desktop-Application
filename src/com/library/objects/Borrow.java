package com.library.objects;

/**
 * @author Jareth Baur
 * @since June 5, 2024
 */
public class Borrow {

    private int borrowID;
    private int studentID;
    private int bookID;
    private String dueDate;
    private String borrowDate;
    private String returnedDate;
    private String status;

    public Borrow(int borrowID, int studentID, int bookID, String dueDate, String borrowDate, String returnedDate, String status) {
        this.borrowID = borrowID;
        this.studentID = studentID;
        this.bookID = bookID;
        this.dueDate = dueDate;
        this.borrowDate = borrowDate;
        this.returnedDate = returnedDate;
        this.status = status;
    }

    public Borrow() {
    }

    public int getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(int borrowID) {
        this.borrowID = borrowID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
