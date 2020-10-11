package student_artur_martinenko.homework.lesson_10.level_6_middle.task_18;

import java.util.ArrayList;

interface BookReader {

    boolean addBookToLibrary(Book book);

    boolean authorOrTitleIsEmpty(Book book);

    boolean removeBookFromLibrary(Book book);

    void listOfBooksInLibrary();

    ArrayList<Book> findBooksByAuthor(String authorName);


}
