package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {
        ArrayOfObjects arrayOfObjects = new ArrayOfObjects();

        Book firstBook = new Book("War and Peace", "John Snow", 1234);
        Book secondBook = new Book("Harry Potter", "Vasja Pupkin", 56);
        Book thirdBook = new Book("Head First Java", "Gregorij Leps", 286);

        Book[] library = new Book[10];

        library[0] = firstBook;
        library[1] = secondBook;
        library[2] = thirdBook;

        //0, 1, 2, null
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            if (book != null) {
                arrayOfObjects.printBook(book);
            }
        }

    }

    public void printBook(Book book) {
        System.out.println("Book: ");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of Pages: " + book.getNumberOfPages());
    }
}
