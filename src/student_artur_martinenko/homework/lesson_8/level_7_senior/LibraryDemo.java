package student_artur_martinenko.homework.lesson_8.level_7_senior;

import java.util.Calendar;
import java.util.Date;

class LibraryDemo {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("author", "name", 400);
        library.addBookToLibrary(book1);

        System.out.println("Book is on hands: " + library.isBookOnHands(book1));
        System.out.println("Book is reserved: " + library.isBookReserved(book1));
        System.out.println("======================================");

        LibraryReader reader = new LibraryReader("aaa", "sss", new Date(90, Calendar.JULY, 15));
        library.takeBookFromLibrary(reader, book1, new Date());
        System.out.println("Book is on hands: " + library.isBookOnHands(book1));
        System.out.println("Book is reserved: " + library.isBookReserved(book1));
        for (Service service : library.getBookService()) {
            System.out.println(service.getReadersName().toString());
        }
        System.out.println("======================================");

        library.returnBookToLibrary(reader, book1, new Date());
        System.out.println("Book is on hands: " + library.isBookOnHands(book1));
        System.out.println("Book is reserved: " + library.isBookReserved(book1));
        System.out.println("======================================");

        library.reserveBook(reader, book1, new Date());
        System.out.println("Book is on hands: " + library.isBookOnHands(book1));
        System.out.println("Book is reserved: " + library.isBookReserved(book1));
        System.out.println("======================================");

        library.unReserveBook(reader, book1, new Date());
        System.out.println("Book is on hands: " + library.isBookOnHands(book1));
        System.out.println("Book is reserved: " + library.isBookReserved(book1));
        System.out.println("======================================");

        System.out.println("History of Library is " + library.getHistory().size());
        for (Service service : library.getHistory()) {
            service.toString();
        }


    }
}

