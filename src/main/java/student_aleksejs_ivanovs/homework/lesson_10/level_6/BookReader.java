package student_aleksejs_ivanovs.homework.lesson_10.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    void writeBookStorage();

    void searchBooksByAuthor(String author);

    void searchBooksByBooksName(String bookName);

    boolean markBookAsRead(Book book);

    boolean markBookAsNotRead(Book book);

    void writeReadBooks();

    void writeUnreadBooks();

}
