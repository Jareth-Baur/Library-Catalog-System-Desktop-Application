/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Student {

    private String studentID;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private int phoneNumber;
    private String address;
    private String course;
    private String yearLevel;
    private String section;
    private int booksBorrowed;
    private int booksReturned;

    public Student() {
    }

    public Student(String studentID, String fullName, String userName, String email, String password, int phoneNumber, String address, String course, String yearLevel, String section) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
        this.yearLevel = yearLevel;
        this.section = section;
    }

    public Student(String studentID, String fullName, String userName, String email, String password, int phoneNumber, String address, String course, String yearLevel, String section, int booksBorrowed, int booksReturned) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
        this.yearLevel = yearLevel;
        this.section = section;
        this.booksBorrowed = booksBorrowed;
        this.booksReturned = booksReturned;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public int getBooksReturned() {
        return booksReturned;
    }

    public void setBooksReturned(int booksReturned) {
        this.booksReturned = booksReturned;
    }

    /**
     * @returns the fields to string
     */
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", address=" + address + ", course=" + course + ", yearLevel=" + yearLevel + ", section=" + section + ", booksBorrowed=" + booksBorrowed + ", booksReturned=" + booksReturned + '}';
    }

}
