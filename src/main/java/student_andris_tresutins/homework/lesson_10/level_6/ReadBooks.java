package student_andris_tresutins.homework.lesson_10.level_6;

import java.util.HashSet;

public class ReadBooks {

    private String name;
    private HashSet<Book> readBooks;
    private HashSet<Book> unReadBooks;

    public ReadBooks (String name){
        this.name = name;
        this.readBooks = new HashSet<>();
        this.unReadBooks = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public HashSet<Book> getReadBooks() {
        return new HashSet<>(readBooks);
    }

    public HashSet<Book> getUnReadBooks() {
        return new HashSet<>(unReadBooks);
    }

    public boolean addReadBooks(Book readBook){
        if (readBooks.contains(readBook)) {
            readBooks.add(readBook);
            return true;
        }
        return false;
    }

    public boolean addUnReadBooks(Book readBook){
        if (unReadBooks.contains(readBook)) {
            unReadBooks.add(readBook);
            return true;
        }
        return false;
    }
}
