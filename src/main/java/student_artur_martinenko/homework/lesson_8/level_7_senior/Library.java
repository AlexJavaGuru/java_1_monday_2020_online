package student_artur_martinenko.homework.lesson_8.level_7_senior;


import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Date;

@CodeReview(approved = true)
class Library {

    //Не сделаны следующие пункты задания. Вернусь позже.
    /*
    - рассылка оповещений читателям о сроке сдачи книги в библиотеку;
    - выписывание штрафов за вовремя не сданные книги;
     */

    private ArrayList<Book> libraryBookList = new ArrayList<>();
    private ArrayList<LibraryReader> readersList = new ArrayList();
    private ArrayList<Service> bookService = new ArrayList();
    private ArrayList<Service> history = new ArrayList();

    public ArrayList<Service> getBookService() {
        return new ArrayList<Service>(bookService);
    }

    public ArrayList<Service> getHistory() {
        return new ArrayList<Service>(history);
    }

    public void addBookToLibrary(Book book) {
        libraryBookList.add(book);
    }

    public void addReader(LibraryReader newPerson) {
        readersList.add(newPerson);
    }

    public boolean findBookInLibrary(Book book) {
        return libraryBookList.contains(book);
    }

    public int findBookInServiceAndItsID(Book book) {
        for (int i = 0; i < bookService.size(); i++) {
            if (bookService.get(i).getBook().equals(book)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isBookReserved(Book book) {
        if (ifBookInService(book)) {
            Service service = bookService.get(findBookInServiceAndItsID(book));
            return service.isBookReserved();
        }
        return false;
    }

    public boolean isBookOnHands(Book book) {
        if (ifBookInService(book)) {
            Service service = bookService.get(findBookInServiceAndItsID(book));
            return service.isBookOnHands();
        }
        return false;
    }

    private boolean ifBookInService(Book book) {
        int bookID = findBookInServiceAndItsID(book);
        return bookID >= 0;
    }

    public boolean reserveBook(LibraryReader reader, Book book, Date dateReserved) {
        if (findBookInLibrary(book) && !isBookOnHands(book)) {
            Service reserveBook = new Service(reader, book, dateReserved);
            reserveBook.setBookReserved(true);
            bookService.add(reserveBook);
            return true;
        }
        return false;
    }

    public boolean unReserveBook(LibraryReader reader, Book book, Date dateUnReserved) {
        int bookId = findBookInServiceAndItsID(book);
        Service reservedBookService = bookService.get(bookId);
        LibraryReader readerReservedBook = reservedBookService.getReadersName();
        if (bookId >= 0 && readerReservedBook.equals(reader)) {
            reservedBookService.setDateReturned(dateUnReserved);
            history.add(reservedBookService);
            bookService.remove(bookId);
            return true;
        }
        return false;
    }

    public boolean takeBookFromLibrary(LibraryReader reader, Book book, Date dateTaken) {
        if (findBookInLibrary(book) && !isBookOnHands(book)) {
            Service onHands = new Service(reader, book, dateTaken);
            onHands.setBookOnHands(true);
            bookService.add(onHands);
            return true;
        }
        return false;
    }

    public boolean returnBookToLibrary(LibraryReader reader, Book book, Date dateReturned) {
        int bookID = findBookInServiceAndItsID(book);
        Service bookOnHands = bookService.get(bookID);
        LibraryReader readerWithBook = bookOnHands.getReadersName();
        if (bookID >= 0 && readerWithBook.equals(reader)) {
            bookOnHands.setDateReturned(dateReturned);
            history.add(bookOnHands);
            bookService.remove(bookID);
            return true;
        }
        return false;
    }


}
