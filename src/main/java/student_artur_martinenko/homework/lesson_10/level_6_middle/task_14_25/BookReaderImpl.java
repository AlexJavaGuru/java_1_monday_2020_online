package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14_25;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    private List<Book> electronicLibrary;
    private List<Reader> readerList;

    public BookReaderImpl() {
        this.electronicLibrary = new ArrayList<>();
        this.readerList = new ArrayList<>();
    }

    @Override
    public boolean addReaderToReaderList(Reader reader) {
        if (reader != null && !readerList.contains(reader)) {
            readerList.add(reader);
            return true;
        }
        return false;
    }

    @Override
    public boolean addBookToLibrary(Book book) {
        if (electronicLibrary.contains(book)) return false;
        if (authorOrTitleIsEmpty(book)) return false;
        electronicLibrary.add(book);
        return true;
    }

    //Task_14
    //Task_15
    @Override
    public boolean authorOrTitleIsEmpty(Book book) {
        return book.getAuthor().isEmpty() || book.getTitle().isEmpty();
    }

    //Task_16
    @Override
    public boolean removeBookFromLibrary(Book book) {
        return electronicLibrary.remove(book);
    }

    //Task_17
    @Override
    public void listOfBooksInLibrary() {
        for (Book book : electronicLibrary) {
            System.out.println(book.toString());
        }
    }

    //Task_18
    @Override
    public ArrayList<Book> findBooksByAuthor(String authorName) {
        ArrayList<Book> authorsBooks = new ArrayList<>();
        for (Book book : electronicLibrary) {
            if (matchAuthorByFirstLetters(book, authorName)) {
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

    //Task_20
    @Override
    public ArrayList<Book> findBooksByTitle(String title) {
        ArrayList<Book> bookTitles = new ArrayList<>();
        for (Book book : electronicLibrary) {
            if (matchTitleByFirstLetters(book, title)) {
                bookTitles.add(book);
            }
        }
        return bookTitles;
    }

    //Task_22
    @Override
    public boolean markBookAsReadByReader(Book book, Reader reader) {
        if (!ifReaderInLibraryList(reader)) return false;
        if (!electronicLibrary.contains(book)) return false;
        return reader.addReadBooks(book);
    }

    //Task_23
    @Override
    public boolean markBookAsFavoriteUnread(Book book, Reader reader) {
        if (!ifReaderInLibraryList(reader)) return false;
        if (!electronicLibrary.contains(book)) return false;
        return reader.addUnReadFavoriteBooks(book);
    }

    //Task_24
    @Override
    public ArrayList<Book> booksReadByReaders() {
        Set<Book> readBookList = new HashSet<>();
        for (Reader reader : readerList) {
            readBookList.addAll(reader.getReadBooks());
        }
        return new ArrayList<>(readBookList);
    }

    //Task_25
    @Override
    public ArrayList<Book> booksNotReadByReaders() {
        ArrayList<Book> bookList = new ArrayList<>(electronicLibrary);
        bookList.removeAll(booksReadByReaders());
        return bookList;
    }

    private boolean ifReaderInLibraryList(Reader reader) {
        return readerList.contains(reader);
    }

    //Task_19
    private boolean matchAuthorByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getAuthor().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }

    //Task_21
    private boolean matchTitleByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getTitle().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }


}
