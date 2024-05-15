package com.library.objects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Book {

    private int bookID;
    private String title;
    private String author;
    private String genre;
    private String publicationDate;
    private String status;
    private String time;
    
    public static Comparator<Book> bookIDComparator = Comparator.comparing(Book::getBookID);
    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
    public static Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
    public static Comparator<Book> genreComparator = Comparator.comparing(Book::getGenre);
    public static Comparator<Book> publicationDateComparator = Comparator.comparing(Book::getPublicationDate);
    public static Comparator<Book> statusComparator = Comparator.comparing(Book::getStatus);
    public static Comparator<Book> timeComparator = Comparator.comparing(Book::getTime);

    public Book(int bookID, String title, String author, String genre, String publicationDate, String status, String time) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationDate = publicationDate;
        this.status = status;
        this.time = time;
    }

    public Book(int bookID) {
        this.bookID = bookID;
    }

    public Book() {

    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @returns the fields to string
     */
    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", title=" + title + ", author=" + author + ", genre=" + genre + ", publicationDate=" + publicationDate + ", status=" + status + '}';
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(bookID, title, author, genre, publicationDate, status, time);
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
        final Book other = (Book) obj;
        if (this.bookID != other.bookID) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.publicationDate, other.publicationDate)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return Objects.equals(this.time, other.time);
    }
}
