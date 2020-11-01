package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14_25;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Objects;

@CodeReview(approved = true)
class Reader {

    private String name;
    private ArrayList<Book> readBooks;
    private ArrayList<Book> unReadFavoriteBooks;

    public Reader(String name) {
        this.name = name;
        this.readBooks = new ArrayList<>();
        this.unReadFavoriteBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getReadBooks() {
        return new ArrayList<>(readBooks);
    }

    public ArrayList<Book> getUnReadFavoriteBooks() {
        return new ArrayList<>(unReadFavoriteBooks);
    }

    public boolean addReadBooks(Book readBook) {
        if (readBook != null) {
            readBooks.add(readBook);
            return true;
        }
        return false;
    }

    public boolean addUnReadFavoriteBooks(Book readBook) {
        if (readBook != null) {
            unReadFavoriteBooks.add(readBook);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(name.toLowerCase(), reader.name.toLowerCase());
    }

}
