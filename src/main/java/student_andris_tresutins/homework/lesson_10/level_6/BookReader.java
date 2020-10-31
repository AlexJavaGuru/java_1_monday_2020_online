package student_andris_tresutins.homework.lesson_10.level_6;


import teacher.annotations.CodeReview;

import java.util.HashSet;

@CodeReview(approved = true)
public interface BookReader {

    int count();
    boolean contains(Book book);
    void save(Book book);
    void delete(Book book);
    void showBookList();
    HashSet<Book> findBookAuthor(String author);
    boolean findByFirstCharactersAuthor(Book book, String chars);
    HashSet<Book> findBookTitle(String title);
    boolean findByFirstCharactersTitle(Book book, String chars);
    boolean setBookRead(Book book);
    boolean setBookUnRead(Book book);
    void showReadBooks();
    void showUnReadBooks();

}
