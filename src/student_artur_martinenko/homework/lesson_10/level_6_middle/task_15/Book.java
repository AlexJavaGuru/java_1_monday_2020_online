package student_artur_martinenko.homework.lesson_10.level_6_middle.task_15;

import java.util.Objects;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author.toLowerCase(), book.author.toLowerCase()) &&
                Objects.equals(title.toLowerCase(), book.title.toLowerCase());
    }

}
