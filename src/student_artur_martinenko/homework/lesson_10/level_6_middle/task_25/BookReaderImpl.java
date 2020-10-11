package student_artur_martinenko.homework.lesson_10.level_6_middle.task_25;
/*
Продолжаем создавать интерфейс BookReader.

Для устройства чтения электронных книг требуется разработать прототип.

Бизнес хочет дать пользователям возможность легко просматривать
все не прочитанные книги.

К этой функциональности выдвигается следующее требование:
- список всех не прочитанных книг должен выдаваться в виде
  массива строк следующего формата: Book Title [Book Author].

Внесите в интерфейс BookReader и его реализацию BookReaderImpl
(Impl - сокращение от Implementation) требуемые изменения.
Если вам нужно, то вы можете создавать дополнительные
классы.

То, что ваше решение реализует все требования бизнеса докажите
автоматическими юнит тестами.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Override
    public boolean authorOrTitleIsEmpty(Book book) {
        return book.getAuthor().isEmpty() || book.getTitle().isEmpty();
    }

    @Override
    public boolean removeBookFromLibrary(Book book) {
        return electronicLibrary.remove(book);
    }

    @Override
    public void listOfBooksInLibrary() {
        for (Book book : electronicLibrary) {
            System.out.println(book.toString());
        }
    }

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

    @Override
    public boolean markBookAsReadByReader(Book book, Reader reader) {
        if (!ifReaderInLibraryList(reader)) return false;
        if (!electronicLibrary.contains(book)) return false;
        return reader.addReadBooks(book);
    }

    @Override
    public boolean markBookAsFavoriteUnread(Book book, Reader reader) {
        if (!ifReaderInLibraryList(reader)) return false;
        if (!electronicLibrary.contains(book)) return false;
        return reader.addUnReadFavoriteBooks(book);
    }

    @Override
    public ArrayList<Book> booksReadByReaders() {
        Set<Book> readBookList = new HashSet<>();
        for (Reader reader : readerList) {
            readBookList.addAll(reader.getReadBooks());
        }
        return new ArrayList<>(readBookList);
    }

    @Override
    public ArrayList<Book> booksNotReadByReaders() {
        ArrayList<Book> bookList = new ArrayList<>(electronicLibrary);
        bookList.removeAll(booksReadByReaders());
        return bookList;
    }

    private boolean ifReaderInLibraryList(Reader reader) {
        return readerList.contains(reader);
    }

    private boolean matchAuthorByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getAuthor().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }

    private boolean matchTitleByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getTitle().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }


}
