-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2024 at 12:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library catalog system`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `bookID` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `publicationDate` varchar(10) NOT NULL,
  `status` varchar(30) NOT NULL DEFAULT 'available'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookID`, `title`, `author`, `genre`, `publicationDate`, `status`) VALUES
(1, 'To Kill a Mockingbird', 'Harper Lee', 'Fiction', '1960-07-11', 'unavailable'),
(2, '1984', 'George Orwell', 'Science Fiction', '1949-06-08', 'unavailable'),
(3, 'Pride and Prejudice', 'Jane Austen', 'Romance', '1813-01-28', 'available'),
(4, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', '1925-04-10', 'available'),
(5, 'Animal Farm', 'George Orwell', 'Political Satire', '1945-08-17', 'unavailable'),
(6, 'The Catcher in the Rye', 'J.D. Salinger', 'Fiction', '1951-07-16', 'available'),
(7, 'The Lord of the Rings', 'J.R.R. Tolkien', 'Fantasy', '1954-07-29', 'available'),
(8, 'Harry Potter and the Sorcerer\'s Stone', 'J.K. Rowling', 'Fantasy', '1997-06-26', 'available'),
(9, 'Harry Potter and the Chamber of Secrets', 'J.K. Rowling', 'Fantasy', '1998-07-02', 'available'),
(10, 'Harry Potter and the Prisoner of Azkaban', 'J.K. Rowling', 'Fantasy', '1999-07-08', 'available'),
(11, 'Harry Potter and the Goblet of Fire', 'J.K. Rowling', 'Fantasy', '2000-07-08', 'available'),
(12, 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 'Fantasy', '2003-06-21', 'available'),
(13, 'Harry Potter and the Half-Blood Prince', 'J.K. Rowling', 'Fantasy', '2005-07-16', 'unavailable'),
(14, 'Harry Potter and the Deathly Hallows', 'J.K. Rowling', 'Fantasy', '2007-07-21', 'available'),
(15, 'The Hobbit', 'J.R.R. Tolkien', 'Fantasy', '1937-09-21', 'unavailable'),
(16, 'The Da Vinci Code', 'Dan Brown', 'Mystery', '2003-03-18', 'unavailable'),
(17, 'The Alchemist', 'Paulo Coelho', 'Fantasy', '1988-09-01', 'available'),
(18, 'The Chronicles of Narnia', 'C.S. Lewis', 'Fantasy', '1950-10-16', 'unavailable'),
(19, 'The Hunger Games', 'Suzanne Collins', 'Science Fiction', '2008-09-14', 'available'),
(20, 'Catch-22', 'Joseph Heller', 'Satire', '1961-10-10', 'available'),
(21, 'Lord of the Flies', 'William Golding', 'Fiction', '1954-09-17', 'available'),
(22, 'Moby-Dick', 'Herman Melville', 'Adventure', '1851-10-18', 'available'),
(23, 'The Hitchhiker\'s Guide to the Galaxy', 'Douglas Adams', 'Science Fiction', '1979-10-12', 'unavailable'),
(24, 'The Picture of Dorian Gray', 'Oscar Wilde', 'Gothic Fiction', '1890-07-20', 'unavailable'),
(25, 'Frankenstein', 'Mary Shelley', 'Horror', '1818-01-01', 'unavailable'),
(26, 'Brave New World', 'Aldous Huxley', 'Science Fiction', '1932-01-01', 'unavailable'),
(27, 'Wuthering Heights', 'Emily Bronte', 'Gothic Fiction', '1847-12-19', 'available'),
(28, 'The Secret Garden', 'Frances Hodgson Burnett', 'Children\'s', '1911-10-01', 'available'),
(29, 'Anne of Green Gables', 'Lucy Maud Montgomery', 'Children\'s', '1908-04-01', 'unavailable'),
(30, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(31, 'Alice\'s Adventures in Wonderland', 'Lewis Carroll', 'Fantasy', '1865-11-26', 'unavailable'),
(32, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(33, 'The Adventures of Huckleberry Finn', 'Mark Twain', 'Fiction', '1884-12-10', 'unavailable'),
(34, 'Little Women', 'Louisa May Alcott', 'Fiction', '1868-09-30', 'available'),
(35, 'The War of the Worlds', 'H.G. Wells', 'Science Fiction', '1898-01-01', 'available'),
(36, 'Don Quixote', 'Miguel de Cervantes', 'Fiction', '1605-01-16', 'unavailable'),
(37, 'Dracula', 'Bram Stoker', 'Horror', '1897-05-26', 'available'),
(38, 'Crime and Punishment', 'Fyodor Dostoevsky', 'Psychological Fiction', '1866-01-01', 'available'),
(39, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08', 'unavailable'),
(40, 'Les Misérables', 'Victor Hugo', 'Historical Fiction', '1862-03-15', 'available'),
(41, 'The Kite Runner', 'Khaled Hosseini', 'Fiction', '2003-05-29', 'available'),
(42, 'The Road', 'Cormac McCarthy', 'Post-Apocalyptic Fiction', '2006-09-26', 'available'),
(43, 'Great Expectations', 'Charles Dickens', 'Fiction', '1861-08-01', 'available'),
(44, 'The Bell Jar', 'Sylvia Plath', 'Autobiographical Fiction', '1963-01-14', 'available'),
(45, 'The Scarlet Letter', 'Nathaniel Hawthorne', 'Romance', '1850-03-16', 'available'),
(46, 'The Grapes of Wrath', 'John Steinbeck', 'Fiction', '1939-04-14', 'available'),
(47, 'The Odyssey', 'Homer', 'Epic Poetry', '1967-03-16', 'available'),
(48, 'The Old Man and the Sea', 'Ernest Hemingway', 'Novella', '1952-09-01', 'available'),
(49, 'Of Mice and Men', 'John Steinbeck', 'Fiction', '1937-02-06', 'available'),
(50, 'Anna Karenina', 'Leo Tolstoy', 'Realist Fiction', '1877-01-01', 'unavailable'),
(51, 'One Hundred Years of Solitude', 'Gabriel Garcia Marquez', 'Magical Realism', '1967-05-30', 'available'),
(52, 'The Brothers Karamazov', 'Fyodor Dostoevsky', 'Philosophical Fiction', '1880-11-26', 'available'),
(53, 'East of Eden', 'John Steinbeck', 'Family Saga', '1952-09-19', 'available'),
(54, 'The Little Prince', 'Antoine de Saint-Exupéry', 'Children\'s Literature', '1943-04-06', 'available'),
(55, 'Slaughterhouse-Five', 'Kurt Vonnegut', 'Science Fiction', '1969-03-31', 'unavailable'),
(56, 'War and Peace', 'Leo Tolstoy', 'Historical Fiction', '1869-01-01', 'available'),
(57, 'Gone with the Wind', 'Margaret Mitchell', 'Historical Fiction', '1936-06-30', 'available'),
(58, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', '1925-04-10', 'unavailable'),
(59, 'Moby-Dick', 'Herman Melville', 'Adventure', '1851-10-18', 'available'),
(60, 'The Adventures of Huckleberry Finn', 'Mark Twain', 'Fiction', '1884-12-10', 'available'),
(61, 'A Tale of Two Cities', 'Charles Dickens', 'Historical Fiction', '1859-04-30', 'unavailable'),
(62, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(63, 'Crime and Punishment', 'Fyodor Dostoevsky', 'Psychological Fiction', '1866-01-01', 'unavailable'),
(64, 'The Brothers Karamazov', 'Fyodor Dostoevsky', 'Philosophical Fiction', '1880-11-26', 'available'),
(65, 'Les Misérables', 'Victor Hugo', 'Historical Fiction', '1862-03-15', 'available'),
(66, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08-28', 'available'),
(67, 'Pride and Prejudice', 'Jane Austen', 'Romance', '1813-01-28', 'unavailable'),
(68, 'The Picture of Dorian Gray', 'Oscar Wilde', 'Gothic Fiction', '1890-07-20', 'unavailable'),
(69, 'The Scarlet Letter', 'Nathaniel Hawthorne', 'Romance', '1850-03-16', 'unavailable'),
(70, 'The Call of the Wild', 'Jack London', 'Adventure', '1903-06-17', 'available'),
(71, 'Treasure Island', 'Robert Louis Stevenson', 'Adventure', '1883-05-23', 'unavailable'),
(72, 'Dracula', 'Bram Stoker', 'Gothic Horror', '1897-05-26', 'unavailable'),
(73, 'Alice\'s Adventures in Wonderland', 'Lewis Carroll', 'Fantasy', '1865-11-26', 'available'),
(74, 'Around the World in Eighty Days', 'Jules Verne', 'Adventure', '1873-01-30', 'available'),
(75, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(76, 'The Three Musketeers', 'Alexandre Dumas', 'Historical Adventure', '1844-03-14', 'available'),
(77, 'Anne of Green Gables', 'Lucy Maud Montgomery', 'Children\'s', '1908-04-01', 'available'),
(78, 'Wuthering Heights', 'Emily Brontë', 'Gothic Fiction', '1847-12-19', 'available'),
(79, 'Little Women', 'Louisa May Alcott', 'Coming-of-Age Fiction', '1868-09-30', 'available'),
(80, 'The Iliad', 'Homer', 'Epic Poetry', '1865-11-26', 'unavailable'),
(81, 'The Odyssey', 'Homer', 'Epic Poetry', '1524-01-26', 'available'),
(82, 'A Christmas Carol', 'Charles Dickens', 'Novella', '1843-12-19', 'unavailable'),
(83, 'The Wind in the Willows', 'Kenneth Grahame', 'Children\'s', '1908-10-08', 'available'),
(84, 'The Jungle Book', 'Rudyard Kipling', 'Children\'s', '1894-10-05', 'unavailable'),
(85, 'The Adventures of Pinocchio', 'Carlo Collodi', 'Children\'s', '1883-07-07', 'available'),
(86, 'The War of the Worlds', 'H.G. Wells', 'Science Fiction', '1898-01-01', 'available'),
(87, 'Frankenstein', 'Mary Shelley', 'Gothic Horror', '1818-01-01', 'available'),
(88, 'The Time Machine', 'H.G. Wells', 'Science Fiction', '1895-05-07', 'available'),
(89, 'Peter Pan', 'J.M. Barrie', 'Children\'s', '1911-12-27', 'available'),
(90, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(91, 'Black Beauty', 'Anna Sewell', 'Children\'s', '1877-11-24', 'available'),
(92, 'The Secret Garden', 'Frances Hodgson Burnett', 'Children\'s', '1911-10-01', 'unavailable'),
(93, 'The Arabian Nights', 'Anonymous', 'Folklore', '16-03-12', 'unavailable'),
(94, 'Robinson Crusoe', 'Daniel Defoe', 'Adventure', '1719-04-25', 'unavailable'),
(95, 'Gulliver\'s Travels', 'Jonathan Swift', 'Satire', '1726-10-28', 'available'),
(96, 'Jane Eyre', 'Charlotte Brontë', 'Gothic Romance', '1847-10-16', 'unavailable'),
(97, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(98, 'Great Expectations', 'Charles Dickens', 'Coming-of-Age Fiction', '1861-08-01', 'available'),
(99, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08-28', 'available'),
(100, 'Charlotte\'s Web', 'E.B. White', 'Children\'s', '1952-10-15', 'available'),
(101, 'book 1', 'author 1', 'Adventure', '2003-03-12', 'available'),
(102, 'Horror book', 'Horror author', 'Horror', '2023-04-09', 'available');

-- --------------------------------------------------------

--
-- Table structure for table `borrows`
--

CREATE TABLE `borrows` (
  `borrowID` int(11) NOT NULL,
  `studentID` varchar(9) NOT NULL,
  `bookID` varchar(9999) NOT NULL,
  `borrowDate` varchar(10) NOT NULL,
  `dueDate` varchar(10) NOT NULL,
  `returnedDate` varchar(10) NOT NULL DEFAULT 'null',
  `status` varchar(10) NOT NULL DEFAULT 'borrowed'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `borrows`
--

INSERT INTO `borrows` (`borrowID`, `studentID`, `bookID`, `borrowDate`, `dueDate`, `returnedDate`, `status`) VALUES
(1, '1', '1', '2024-03-24', '2024-03-27', 'null', 'returned'),
(2, '1', '2', '2024-03-24', '2024-03-23', 'null', 'returned'),
(5, '17', '80', '2024-06-05', '2024-06-14', '2024-06-05', 'returned'),
(6, '2', '26', '2024-06-05', '2024-06-19', '2024-06-05', 'returned'),
(7, '17', '80', '2024-06-05', '2024-06-29', '2024-06-05', 'returned'),
(8, '2', '26', '2024-06-05', '2024-06-21', '2024-06-05', 'returned'),
(9, '9', '24', '2024-06-05', '2024-06-28', '2024-06-05', 'returned'),
(10, '9', '58', '2024-06-05', '2024-07-03', '2024-06-05', 'returned'),
(11, '17', '82', '2024-06-05', '2024-07-02', '', 'returned'),
(12, '5', '55', '2024-06-05', '2024-06-06', '2024-06-05', 'returned'),
(13, '14', '72', '2024-06-05', '2024-06-27', '2024-06-05', 'returned'),
(14, '12', '71', '2024-06-05', '2024-06-08', '2024-06-05', 'returned'),
(15, '2', '63', '2024-06-05', '2024-06-27', '', 'returned'),
(16, '6', '94', '2024-06-05', '2024-06-28', '', 'returned'),
(17, '11', '68', '2024-06-05', '2024-06-14', '2024-06-05', 'returned'),
(18, '5', '69', '2024-06-05', '2024-06-09', '2024-06-05', 'returned'),
(19, '2', '5', '2024-06-05', '2024-07-04', '', 'returned'),
(20, '16', '13', '2024-06-05', '2024-06-15', '', 'returned'),
(21, '18', '29', '2024-06-05', '2024-06-23', '2024-06-05', 'returned'),
(22, '13', '31', '2024-06-05', '2024-06-18', '2024-06-05', 'returned'),
(23, '5', '50', '2024-06-05', '2024-06-14', '2024-06-05', 'returned'),
(24, '15', '84', '2024-06-05', '2024-06-09', '', 'returned'),
(25, '7', '33', '2024-06-05', '2024-06-20', '', 'returned'),
(26, '6', '25', '2024-06-05', '2024-06-15', '2024-06-05', 'returned'),
(27, '4', '67', '2024-06-05', '2024-06-27', '', 'returned'),
(28, '6', '96', '2024-06-05', '2024-07-04', '', 'returned'),
(29, '14', '39', '2024-06-05', '2024-06-27', '', 'returned'),
(30, '10', '93', '2024-06-05', '2024-07-03', '2024-06-05', 'returned'),
(31, '4', '16', '2024-06-05', '2024-06-29', '', 'returned'),
(32, '1', '92', '2024-06-05', '2024-06-17', '2024-06-05', 'returned'),
(33, '18', '61', '2024-06-05', '2024-07-04', '', 'returned'),
(34, '11', '15', '2024-06-05', '2024-06-13', '2024-06-05', 'returned'),
(35, '15', '23', '2024-06-05', '2024-06-06', '', 'returned'),
(36, '19', '18', '2024-06-05', '2024-06-09', '2024-06-05', 'returned');

-- --------------------------------------------------------

--
-- Table structure for table `librarians`
--

CREATE TABLE `librarians` (
  `librarianID` int(11) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `jobTitle` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `librarians`
--

INSERT INTO `librarians` (`librarianID`, `fullName`, `userName`, `email`, `password`, `phoneNumber`, `jobTitle`) VALUES
(2, 'first name middle', 'admin', 'admin@gmail.com', '$2a$12$a8FL6L80FRyXgN3wohN1vOzV/DQbImmo.AV3nC.lGseALZfEyMZr2', '987654321', 'administrator');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `logID` int(11) NOT NULL,
  `action` varchar(50) NOT NULL,
  `timestamp` date NOT NULL,
  `logType` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`logID`, `action`, `timestamp`, `logType`) VALUES
(1, 'login', '2024-06-01', 'security'),
(2, 'logout', '2024-06-01', 'security'),
(3, 'login', '2024-06-01', 'security'),
(4, 'logout', '2024-06-01', 'security'),
(5, 'logout', '2024-06-02', 'security'),
(6, 'login', '2024-06-02', 'security'),
(7, 'login', '2024-06-02', 'security'),
(8, 'login', '2024-06-02', 'security'),
(9, 'login', '2024-06-02', 'security'),
(10, 'login', '2024-06-02', 'security'),
(11, 'login', '2024-06-04', 'security');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `studentID` int(9) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `yearLevel` int(11) NOT NULL,
  `section` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentID`, `fullName`, `userName`, `email`, `password`, `phoneNumber`, `address`, `course`, `yearLevel`, `section`) VALUES
(1, 'Jareth Bayron Baur', 'Jareth', 'jarethbaur0223@gmail.com', '$2a$12$i8fmx.0fCMU8SXCXNfJHb.MhB5EeWjACgbsy5hFD4z2F1f7AuVfJ6', '09500132753', 'Purok 10, San Vicente Banaybanay Davao Oriental', 'BSBA', 4, 'A'),
(2, 'Student 1', 'student1', 'student1@gmail.com', '$2a$10$k8HA6yKFmbQmsO5/9inxy.pTADBcbJmuxiZFVJdZhUEx.tEB8MWQ6', '1234567891', 'Address 1, City 1, Country', 'Course 1', 2, 'Section 1'),
(3, 'Student 2', 'student2', 'student2@gmail.com', '$2a$10$IoBRZZ6OS1ARe0rID6EK1ekjiYW8pSDQxXSDapf3Jv9TPFc1rok4K', '1234567892', 'Address 2, City 2, Country', 'Course 2', 3, 'Section 2'),
(4, 'Student 3', 'student3', 'student3@gmail.com', '$2a$10$pzTyO6xKSe/a9ZPRIMSdj.9IOf3MdEr7jQDOT4QOFnhaBVgVZEX4e', '1234567893', 'Address 3, City 3, Country', 'Course 3', 4, 'Section 3'),
(5, 'Student 4', 'student4', 'student4@gmail.com', '$2a$10$fQrwHmZ/ExYtFKxF.3BPuOtjx85WllpPah8fmcMx0aTpICJruRFuW', '1234567894', 'Address 4, City 4, Country', 'Course 4', 1, 'Section 4'),
(6, 'Student 5', 'student5', 'student5@gmail.com', '$2a$10$FBwPdiUreBiNf1jRnnw1ueqKHlOql26R1HiHgm8UYQD9xAxCqg./K', '1234567895', 'Address 5, City 5, Country', 'Course 5', 2, 'Section 5'),
(7, 'Student 6', 'student6', 'student6@gmail.com', '$2a$10$17ayQQBxE/7N..LKwUnNkun7fgQ2L8yapLmUv85vlbdqVxBDzgeXa', '1234567896', 'Address 6, City 6, Country', 'Course 6', 3, 'Section 6'),
(8, 'Student 7', 'student7', 'student7@gmail.com', '$2a$10$pfoJlc0Zay4AafIyd6IHJu4VUJ6Zd6g.9F/ZMAwuk8Z/yCAb9wDca', '1234567897', 'Address 7, City 7, Country', 'Course 7', 4, 'Section 7'),
(9, 'Student 8', 'student8', 'student8@gmail.com', '$2a$10$Xb0u7E10it9CrHJu8p83pucM8lp90bqCER8mBliqboSgxyE4yaM22', '1234567898', 'Address 8, City 8, Country', 'Course 8', 1, 'Section 8'),
(10, 'Student 9', 'student9', 'student9@gmail.com', '$2a$10$UYIhKnRs0V/xz0ywaChkLeogRhJX86WpaV5XsRYMrOS4Ncwol34xW', '1234567899', 'Address 9, City 9, Country', 'Course 9', 2, 'Section 9'),
(11, 'Student 10', 'student10', 'student10@gmail.com', '$2a$10$utmFF/jjKusPV3aUy/csWembUxmhm4QOHGu729wj.J8uZQ3k/Jswu', '12345678910', 'Address 10, City 10, Country', 'Course 10', 3, 'Section 10'),
(12, 'Student 11', 'student11', 'student11@gmail.com', '$2a$10$IkNiItmbXR20zMccL/pvUeevupaH8vLGNauan/kD6XIn359MUatb.', '12345678911', 'Address 11, City 11, Country', 'Course 11', 4, 'Section 11'),
(13, 'Student 12', 'student12', 'student12@gmail.com', '$2a$10$FNzZmNYpIQPJ59hKR.si4u6HMlUT4EAWWcDvdRfFWmdf5j24UrLDa', '12345678912', 'Address 12, City 12, Country', 'Course 12', 1, 'Section 12'),
(14, 'Student 13', 'student13', 'student13@gmail.com', '$2a$10$Y5yOZiiVGMAGK5H4Smu.4ev1FKwtS/FC4UmZ7x33Ntbe9cHytSjIe', '12345678913', 'Address 13, City 13, Country', 'Course 13', 2, 'Section 13'),
(15, 'Student 14', 'student14', 'student14@gmail.com', '$2a$10$Sd0wo4fBR9PdFWTGzBwOuu9ob83c/H87pDwT1j8Jvt2D1BCkhWV1S', '12345678914', 'Address 14, City 14, Country', 'Course 14', 3, 'Section 14'),
(16, 'Student 15', 'student15', 'student15@gmail.com', '$2a$10$Zn01e5OdDXbc4craZoPjCujbfpMBD5bnkv0S6vf/jHSbgMPAUk/Re', '12345678915', 'Address 15, City 15, Country', 'Course 15', 4, 'Section 15'),
(17, 'Student 16', 'student16', 'student16@gmail.com', '$2a$10$hye5OsniZgNxmwZnoe6MLukGrftPDN08ZVfSDdOZOi761gS6QtpB6', '12345678916', 'Address 16, City 16, Country', 'Course 16', 1, 'Section 16'),
(18, 'Student 17', 'student17', 'student17@gmail.com', '$2a$10$9FJsYVg8ISNLWgja7HrrQukwZD0ybpDiXd2a2MdsFrsZoJ.Ro8OAq', '12345678917', 'Address 17, City 17, Country', 'Course 17', 2, 'Section 17'),
(19, 'Student 18', 'student18', 'student18@gmail.com', '$2a$10$tM5Fwi/yUbeHHiqR3GSpmO.ofIBy5IDLmQZA9v0sqxZsRLONyzxZG', '12345678918', 'Address 18, City 18, Country', 'Course 18', 3, 'Section 18');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transactionID` int(11) NOT NULL,
  `bookID` int(11) NOT NULL,
  `studentID` int(11) NOT NULL,
  `transactionType` varchar(30) NOT NULL,
  `transactionDate` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`transactionID`, `bookID`, `studentID`, `transactionType`, `transactionDate`) VALUES
(1, 80, 17, 'loan', '2024-06-04'),
(2, 26, 2, 'loan', '2024-06-04'),
(3, 24, 9, 'loan', '2024-06-04'),
(4, 58, 9, 'loan', '2024-06-04'),
(5, 82, 17, 'loan', '2024-06-04'),
(6, 55, 5, 'loan', '2024-06-04'),
(7, 72, 14, 'loan', '2024-06-04'),
(8, 71, 12, 'loan', '2024-06-04'),
(9, 63, 2, 'loan', '2024-06-04'),
(10, 94, 6, 'loan', '2024-06-04'),
(11, 68, 11, 'loan', '2024-06-04'),
(12, 69, 5, 'loan', '2024-06-04'),
(13, 5, 2, 'loan', '2024-06-04'),
(14, 13, 16, 'loan', '2024-06-04'),
(15, 29, 18, 'loan', '2024-06-04'),
(16, 31, 13, 'loan', '2024-06-04'),
(17, 50, 5, 'loan', '2024-06-04'),
(18, 84, 15, 'loan', '2024-06-04'),
(19, 33, 7, 'loan', '2024-06-04'),
(20, 25, 6, 'loan', '2024-06-04'),
(21, 67, 4, 'loan', '2024-06-04'),
(22, 96, 6, 'loan', '2024-06-04'),
(23, 39, 14, 'loan', '2024-06-04'),
(24, 93, 10, 'loan', '2024-06-04'),
(25, 16, 4, 'loan', '2024-06-04'),
(26, 92, 1, 'loan', '2024-06-04'),
(27, 61, 18, 'loan', '2024-06-04'),
(28, 15, 11, 'loan', '2024-06-04'),
(29, 23, 15, 'loan', '2024-06-04'),
(30, 18, 19, 'loan', '2024-06-04'),
(31, 1, 1, 'return', '2024-06-05'),
(32, 2, 1, 'return', '2024-06-05'),
(33, 82, 17, 'return', '2024-06-05'),
(34, 63, 2, 'return', '2024-06-05'),
(35, 94, 6, 'return', '2024-06-05'),
(36, 5, 2, 'return', '2024-06-05'),
(37, 13, 16, 'return', '2024-06-05'),
(38, 84, 15, 'return', '2024-06-05'),
(39, 33, 7, 'return', '2024-06-05'),
(40, 67, 4, 'return', '2024-06-05'),
(41, 96, 6, 'return', '2024-06-05'),
(42, 39, 14, 'return', '2024-06-05'),
(43, 16, 4, 'return', '2024-06-05'),
(44, 61, 18, 'return', '2024-06-05'),
(45, 23, 15, 'return', '2024-06-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`bookID`);

--
-- Indexes for table `borrows`
--
ALTER TABLE `borrows`
  ADD PRIMARY KEY (`borrowID`);

--
-- Indexes for table `librarians`
--
ALTER TABLE `librarians`
  ADD PRIMARY KEY (`librarianID`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`logID`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`studentID`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`transactionID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `bookID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- AUTO_INCREMENT for table `borrows`
--
ALTER TABLE `borrows`
  MODIFY `borrowID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `librarians`
--
ALTER TABLE `librarians`
  MODIFY `librarianID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `logID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `studentID` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `transactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
