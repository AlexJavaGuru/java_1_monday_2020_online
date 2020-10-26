package student_aleksejs_ivanovs.homework.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{   // Not finished

   private List<Book> bookStorage = new ArrayList<>();

    @Override   //  Task_14_15
    public boolean addBook(Book book) {
        if (bookStorage.contains(book) || book.getAuthor() == null || book.getBookName() == null) {
            return false;
        } else {
            bookStorage.add(book);
            return true;
        }
    }

    @Override   //  Task_16
    public boolean removeBook(Book book) {
        /*if (bookStorage.equals(book)) {
            bookStorage.remove(book);
            return true;
        } else {
            return false;
        }*/
        return bookStorage.remove(book);
    }

    @Override   //  Task_17
    public void writeBookStorage() {
        for (Book book : bookStorage) {
            System.out.println(book.toString());
        }
    }

    @Override   //  Task_18_19
    public void searchBooksByAuthor(String author) {
        /*Book books = new Book(author,"");
        bookStorage.equals(books) &&*/
        for (Book book : bookStorage) {
            if (book.getAuthor().startsWith(author)) {
                System.out.println(book.toString());
            }
        }
    }

    @Override   //  Task_20_21
    public void searchBooksByBooksName(String bookName) {
        for (Book book : bookStorage) {
            if (book.getBookName().startsWith(bookName)) {
                System.out.println(book.toString());
            }
        }
    }

    @Override   //  Task_22
    public boolean markBookAsRead(Book book) {
        if (bookStorage.contains(book)) {
            book.setFinishedBook(true);
            return true;
        }
        return false;
    }

    @Override   //  Task_23
    public boolean markBookAsNotRead(Book book) {
        if (bookStorage.contains(book)) {
            book.setFinishedBook(false);
            return true;
        }
        return false;
    }

    @Override   //  Task_24
    public void writeReadBooks() {
        for (Book book : bookStorage) {
            if (book.getFinishedBook()) {
                System.out.println(book.toString());
            }
        }
    }

    @Override   //  Task_25
    public void writeUnreadBooks() {
        for (Book book : bookStorage) {
            if (!book.getFinishedBook()) {
                System.out.println(book.toString());
            }
        }
    }

}
