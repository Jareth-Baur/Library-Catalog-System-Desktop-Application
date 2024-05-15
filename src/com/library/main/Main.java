package com.library.main;

import com.library.frames.*;
import com.library.librarianInterface.*;
import com.library.studentInterface.*;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Main {

    public static void main(String[] args) {
        new HomeMenu().setVisible(true);
        //new StudentInterface().setVisible(true);
        //new LoginFrame().setVisible(true);
        //new LibrarianInterface().setVisible(true);
        //new LoanBook("2022-6232","2","sample title","sample author","sample genre").setVisible(true);
        //new EditProfileDetails("2022-6232").setVisible(true);
        //new AddNewBook().setVisible(true);
    }
}
