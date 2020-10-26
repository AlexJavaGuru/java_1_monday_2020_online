package teacher.lesson_10.lessoncode.library;

public interface Library {

    Book takeTheBook(String bookTitle);

    Book takeTheBook(Book book);

    void returnTheBook(Book book);

    Book searchBookByTitle(String bookTitle);

    Book searchBookByAuthor(String bookAuthor);

    void bookReservation(Book book);

    //penalty

    //add a book

}
