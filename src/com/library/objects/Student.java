package com.library.objects;

import java.util.Objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Student {

    private int studentID;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String course;
    private int yearLevel;
    private String section;

    public Student() {
    }

    public Student(int studentID, String fullName, String userName, String email, String password, String phoneNumber, String address, String course, int yearLevel, String section) {
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

    public Student(Object[] rowData) {
        this.studentID = (int) rowData[0];
        this.fullName = (String) rowData[1];
        this.userName = (String) rowData[2];
        this.email = (String) rowData[3];
        this.password = (String) rowData[4];
        this.phoneNumber = (String) rowData[5];
        this.address = (String) rowData[6];
        this.course = (String) rowData[7];
        this.yearLevel = (int) rowData[8];
        this.section = (String) rowData[9];
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.studentID;
        hash = 23 * hash + Objects.hashCode(this.fullName);
        hash = 23 * hash + Objects.hashCode(this.userName);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.phoneNumber);
        hash = 23 * hash + Objects.hashCode(this.address);
        hash = 23 * hash + Objects.hashCode(this.course);
        hash = 23 * hash + this.yearLevel;
        hash = 23 * hash + Objects.hashCode(this.section);
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
        final Student other = (Student) obj;
        if (this.studentID != other.studentID) {
            return false;
        }
        if (this.yearLevel != other.yearLevel) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        return Objects.equals(this.section, other.section);
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", address=" + address + ", course=" + course + ", yearLevel=" + yearLevel + ", section=" + section + '}';
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}
