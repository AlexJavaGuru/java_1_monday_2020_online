package student_dmitry_vasiliev.lesson_3.homework.Level_4;

import student_dmitry_vasiliev.lesson_3.homework.Level_4.Book;

public class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }

