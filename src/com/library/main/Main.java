/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.library.main;

import com.library.frames.HomePage;
import com.library.frames.RegisterLibrarian;
import com.library.frames.LoginFrame;
import com.library.frames.RegisterStudent;
import com.library.librarianInterface.AddNewBook;
import com.library.librarianInterface.EditBookDetails;
import com.library.librarianInterface.EditLibrarianProfileDetails;
import com.library.librarianInterface.LibrarianInterface;
import com.library.studentInterface.EditProfileDetails;
import com.library.studentInterface.LoanBook;
import com.library.studentInterface.StudentInterface;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Main {

    public static void main(String[] args) {

        new HomePage().setVisible(true);
        //new LoginFrame().setVisible(true);
        //new RegisterStudent().setVisible(true);
        //new RegisterLibrarian().setVisible(true);
        //StudentInterface.username = "Jareth";
        //new StudentInterface().setVisible(true);
        //LibrarianInterface.username = "admin";
        //new LibrarianInterface().setVisible(true);
        //new LoanBook("2022-6232","2","sample title","sample author","sample genre").setVisible(true);
        //new EditProfileDetails("2022-6232").setVisible(true);
        //new EditLibrarianProfileDetails("2").setVisible(true);
        //new AddNewBook().setVisible(true);
        //new EditBookDetails("101").setVisible(true);
    }
}
