package student_artur_martinenko.homework.lesson_10.level_6_middle.task_22;

import java.util.ArrayList;

class Reader {

    private String name;
    private ArrayList<Book> readBooks;

    public Reader(String name) {
        this.name = name;
        this.readBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getReadBooks() {
        return new ArrayList<>(readBooks);
    }

    public boolean addReadBooks(Book readBook) {
        if (readBook != null) {
            readBooks.add(readBook);
            return true;
        }
        return false;
    }
}
