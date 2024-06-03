package com.library.util;

import java.time.LocalDate;

/**
 * @author Jareth Baur
 * @since March 22, 2024
 */
public class BookLoan {
    private final LocalDate dueDate;

    public BookLoan(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isOverdue(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(dueDate);
    }
}
