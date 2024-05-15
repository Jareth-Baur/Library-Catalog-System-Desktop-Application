/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Librarian {

    private String librarianID;
    private String fullName;
    private String middleName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private int phoneNumber;
    private String jobTitle;

    public Librarian(String fullName, String middleName, String lastName, String userName, String email, String password, int phoneNumber, String jobTitle) {
        this.fullName = fullName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    public Librarian(String librarianID, String fullName, String middleName, String lastName, String userName, String email, String password, int phoneNumber, String jobTitle) {
        this.librarianID = librarianID;
        this.fullName = fullName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    public Librarian() {
    }

    public String getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(String librarianID) {
        this.librarianID = librarianID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @returns the fields to string
     */
    @Override
    public String toString() {
        return "Librarian{" + "librarianID=" + librarianID + ", fullName=" + fullName + ", middleName=" + middleName + ", lastName=" + lastName + ", userName=" + userName + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", jobTitle=" + jobTitle + '}';
    }

}
