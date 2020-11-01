package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14_25;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
interface BookReader {

    boolean addBookToLibrary(Book book);

    boolean authorOrTitleIsEmpty(Book book);

    boolean removeBookFromLibrary(Book book);

    void listOfBooksInLibrary();

    ArrayList<Book> findBooksByAuthor(String authorName);

    ArrayList<Book> findBooksByTitle(String title);

    boolean markBookAsReadByReader(Book book, Reader reader);

    boolean markBookAsFavoriteUnread(Book book, Reader reader);

    boolean addReaderToReaderList(Reader reader);

    ArrayList<Book> booksReadByReaders();

    ArrayList<Book> booksNotReadByReaders();


}
