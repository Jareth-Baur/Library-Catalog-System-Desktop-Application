-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2024 at 02:24 AM
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
(5, 'Animal Farm', 'George Orwell', 'Political Satire', '1945-08-17', 'available'),
(6, 'The Catcher in the Rye', 'J.D. Salinger', 'Fiction', '1951-07-16', 'available'),
(7, 'The Lord of the Rings', 'J.R.R. Tolkien', 'Fantasy', '1954-07-29', 'available'),
(8, 'Harry Potter and the Sorcerer\'s Stone', 'J.K. Rowling', 'Fantasy', '1997-06-26', 'available'),
(9, 'Harry Potter and the Chamber of Secrets', 'J.K. Rowling', 'Fantasy', '1998-07-02', 'available'),
(10, 'Harry Potter and the Prisoner of Azkaban', 'J.K. Rowling', 'Fantasy', '1999-07-08', 'available'),
(11, 'Harry Potter and the Goblet of Fire', 'J.K. Rowling', 'Fantasy', '2000-07-08', 'available'),
(12, 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 'Fantasy', '2003-06-21', 'available'),
(13, 'Harry Potter and the Half-Blood Prince', 'J.K. Rowling', 'Fantasy', '2005-07-16', 'available'),
(14, 'Harry Potter and the Deathly Hallows', 'J.K. Rowling', 'Fantasy', '2007-07-21', 'available'),
(15, 'The Hobbit', 'J.R.R. Tolkien', 'Fantasy', '1937-09-21', 'available'),
(16, 'The Da Vinci Code', 'Dan Brown', 'Mystery', '2003-03-18', 'available'),
(17, 'The Alchemist', 'Paulo Coelho', 'Fantasy', '1988-09-01', 'available'),
(18, 'The Chronicles of Narnia', 'C.S. Lewis', 'Fantasy', '1950-10-16', 'available'),
(19, 'The Hunger Games', 'Suzanne Collins', 'Science Fiction', '2008-09-14', 'available'),
(20, 'Catch-22', 'Joseph Heller', 'Satire', '1961-10-10', 'available'),
(21, 'Lord of the Flies', 'William Golding', 'Fiction', '1954-09-17', 'available'),
(22, 'Moby-Dick', 'Herman Melville', 'Adventure', '1851-10-18', 'available'),
(23, 'The Hitchhiker\'s Guide to the Galaxy', 'Douglas Adams', 'Science Fiction', '1979-10-12', 'available'),
(24, 'The Picture of Dorian Gray', 'Oscar Wilde', 'Gothic Fiction', '1890-07-20', 'available'),
(25, 'Frankenstein', 'Mary Shelley', 'Horror', '1818-01-01', 'available'),
(26, 'Brave New World', 'Aldous Huxley', 'Science Fiction', '1932-01-01', 'available'),
(27, 'Wuthering Heights', 'Emily Bronte', 'Gothic Fiction', '1847-12-19', 'available'),
(28, 'The Secret Garden', 'Frances Hodgson Burnett', 'Children\'s', '1911-10-01', 'available'),
(29, 'Anne of Green Gables', 'Lucy Maud Montgomery', 'Children\'s', '1908-04-01', 'available'),
(30, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(31, 'Alice\'s Adventures in Wonderland', 'Lewis Carroll', 'Fantasy', '1865-11-26', 'available'),
(32, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(33, 'The Adventures of Huckleberry Finn', 'Mark Twain', 'Fiction', '1884-12-10', 'available'),
(34, 'Little Women', 'Louisa May Alcott', 'Fiction', '1868-09-30', 'available'),
(35, 'The War of the Worlds', 'H.G. Wells', 'Science Fiction', '1898-01-01', 'available'),
(36, 'Don Quixote', 'Miguel de Cervantes', 'Fiction', '1605-01-16', 'unavailable'),
(37, 'Dracula', 'Bram Stoker', 'Horror', '1897-05-26', 'available'),
(38, 'Crime and Punishment', 'Fyodor Dostoevsky', 'Psychological Fiction', '1866-01-01', 'available'),
(39, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08', 'available'),
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
(50, 'Anna Karenina', 'Leo Tolstoy', 'Realist Fiction', '1877-01-01', 'available'),
(51, 'One Hundred Years of Solitude', 'Gabriel Garcia Marquez', 'Magical Realism', '1967-05-30', 'available'),
(52, 'The Brothers Karamazov', 'Fyodor Dostoevsky', 'Philosophical Fiction', '1880-11-26', 'available'),
(53, 'East of Eden', 'John Steinbeck', 'Family Saga', '1952-09-19', 'available'),
(54, 'The Little Prince', 'Antoine de Saint-Exupéry', 'Children\'s Literature', '1943-04-06', 'available'),
(55, 'Slaughterhouse-Five', 'Kurt Vonnegut', 'Science Fiction', '1969-03-31', 'available'),
(56, 'War and Peace', 'Leo Tolstoy', 'Historical Fiction', '1869-01-01', 'available'),
(57, 'Gone with the Wind', 'Margaret Mitchell', 'Historical Fiction', '1936-06-30', 'available'),
(58, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', '1925-04-10', 'available'),
(59, 'Moby-Dick', 'Herman Melville', 'Adventure', '1851-10-18', 'available'),
(60, 'The Adventures of Huckleberry Finn', 'Mark Twain', 'Fiction', '1884-12-10', 'available'),
(61, 'A Tale of Two Cities', 'Charles Dickens', 'Historical Fiction', '1859-04-30', 'available'),
(62, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(63, 'Crime and Punishment', 'Fyodor Dostoevsky', 'Psychological Fiction', '1866-01-01', 'available'),
(64, 'The Brothers Karamazov', 'Fyodor Dostoevsky', 'Philosophical Fiction', '1880-11-26', 'available'),
(65, 'Les Misérables', 'Victor Hugo', 'Historical Fiction', '1862-03-15', 'available'),
(66, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08-28', 'available'),
(67, 'Pride and Prejudice', 'Jane Austen', 'Romance', '1813-01-28', 'available'),
(68, 'The Picture of Dorian Gray', 'Oscar Wilde', 'Gothic Fiction', '1890-07-20', 'available'),
(69, 'The Scarlet Letter', 'Nathaniel Hawthorne', 'Romance', '1850-03-16', 'available'),
(70, 'The Call of the Wild', 'Jack London', 'Adventure', '1903-06-17', 'available'),
(71, 'Treasure Island', 'Robert Louis Stevenson', 'Adventure', '1883-05-23', 'available'),
(72, 'Dracula', 'Bram Stoker', 'Gothic Horror', '1897-05-26', 'available'),
(73, 'Alice\'s Adventures in Wonderland', 'Lewis Carroll', 'Fantasy', '1865-11-26', 'available'),
(74, 'Around the World in Eighty Days', 'Jules Verne', 'Adventure', '1873-01-30', 'available'),
(75, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(76, 'The Three Musketeers', 'Alexandre Dumas', 'Historical Adventure', '1844-03-14', 'available'),
(77, 'Anne of Green Gables', 'Lucy Maud Montgomery', 'Children\'s', '1908-04-01', 'available'),
(78, 'Wuthering Heights', 'Emily Brontë', 'Gothic Fiction', '1847-12-19', 'available'),
(79, 'Little Women', 'Louisa May Alcott', 'Coming-of-Age Fiction', '1868-09-30', 'available'),
(80, 'The Iliad', 'Homer', 'Epic Poetry', '1865-11-26', 'available'),
(81, 'The Odyssey', 'Homer', 'Epic Poetry', '1524-01-26', 'available'),
(82, 'A Christmas Carol', 'Charles Dickens', 'Novella', '1843-12-19', 'available'),
(83, 'The Wind in the Willows', 'Kenneth Grahame', 'Children\'s', '1908-10-08', 'available'),
(84, 'The Jungle Book', 'Rudyard Kipling', 'Children\'s', '1894-10-05', 'available'),
(85, 'The Adventures of Pinocchio', 'Carlo Collodi', 'Children\'s', '1883-07-07', 'available'),
(86, 'The War of the Worlds', 'H.G. Wells', 'Science Fiction', '1898-01-01', 'available'),
(87, 'Frankenstein', 'Mary Shelley', 'Gothic Horror', '1818-01-01', 'available'),
(88, 'The Time Machine', 'H.G. Wells', 'Science Fiction', '1895-05-07', 'available'),
(89, 'Peter Pan', 'J.M. Barrie', 'Children\'s', '1911-12-27', 'available'),
(90, 'The Adventures of Tom Sawyer', 'Mark Twain', 'Fiction', '1876-12-01', 'available'),
(91, 'Black Beauty', 'Anna Sewell', 'Children\'s', '1877-11-24', 'available'),
(92, 'The Secret Garden', 'Frances Hodgson Burnett', 'Children\'s', '1911-10-01', 'available'),
(93, 'The Arabian Nights', 'Anonymous', 'Folklore', '16-03-12', 'available'),
(94, 'Robinson Crusoe', 'Daniel Defoe', 'Adventure', '1719-04-25', 'available'),
(95, 'Gulliver\'s Travels', 'Jonathan Swift', 'Satire', '1726-10-28', 'available'),
(96, 'Jane Eyre', 'Charlotte Brontë', 'Gothic Romance', '1847-10-16', 'available'),
(97, 'The Adventures of Sherlock Holmes', 'Arthur Conan Doyle', 'Mystery', '1892-10-14', 'available'),
(98, 'Great Expectations', 'Charles Dickens', 'Coming-of-Age Fiction', '1861-08-01', 'available'),
(99, 'The Count of Monte Cristo', 'Alexandre Dumas', 'Adventure', '1844-08-28', 'available'),
(100, 'Charlotte\'s Web', 'E.B. White', 'Children\'s', '1952-10-15', 'available');

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
  `status` varchar(10) NOT NULL DEFAULT 'active'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `borrows`
--

INSERT INTO `borrows` (`borrowID`, `studentID`, `bookID`, `borrowDate`, `dueDate`, `returnedDate`, `status`) VALUES
(1, '2022-6232', '1', '2024-03-24', '2024-03-27', 'null', 'active'),
(2, '2022-6232', '2', '2024-03-24', '2024-03-23', 'null', 'active');

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
  `phoneNumber` int(11) NOT NULL,
  `jobTitle` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `librarians`
--

INSERT INTO `librarians` (`librarianID`, `fullName`, `userName`, `email`, `password`, `phoneNumber`, `jobTitle`) VALUES
(2, 'admin admin admin', 'admin', 'admin', '$2a$12$a8FL6L80FRyXgN3wohN1vOzV/DQbImmo.AV3nC.lGseALZfEyMZr2', 987654321, 'admin');

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
(4, 'logout', '2024-06-01', 'security');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `studentID` varchar(9) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `yearLevel` int(11) NOT NULL,
  `section` varchar(5) NOT NULL,
  `booksBorrowed` int(11) NOT NULL,
  `booksReturned` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentID`, `fullName`, `userName`, `email`, `password`, `phoneNumber`, `address`, `course`, `yearLevel`, `section`, `booksBorrowed`, `booksReturned`) VALUES
('2022-6232', 'Jareth Bayron Baur', 'Jareth', 'jarethbaur0223@gmail.com', '$2a$12$i8fmx.0fCMU8SXCXNfJHb.MhB5EeWjACgbsy5hFD4z2F1f7AuVfJ6', '09500132753', 'Purok 10, San Vicente Banaybanay Davao Oriental', 'BSBA', 4, 'A', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transactionID` int(11) NOT NULL,
  `bookID` int(11) NOT NULL,
  `studentID` varchar(9) NOT NULL,
  `transactionType` varchar(30) NOT NULL,
  `transactionDate` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

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
  MODIFY `bookID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `borrows`
--
ALTER TABLE `borrows`
  MODIFY `borrowID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `librarians`
--
ALTER TABLE `librarians`
  MODIFY `librarianID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `logID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `transactionID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
