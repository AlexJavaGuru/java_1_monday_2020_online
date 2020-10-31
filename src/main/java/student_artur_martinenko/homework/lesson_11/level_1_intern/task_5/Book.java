package student_artur_martinenko.homework.lesson_11.level_1_intern.task_5;

import teacher.annotations.CodeReview;

import java.util.Objects;

/*
Дан класс Book:

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}

Создайте класс BookListContainsDemo в котором продемонстрируйте как
проверяют есть ли в списке данная книга или её нет. Если для правильной
работы выбранной вами функциональности требуется внести изменения в
класс Book, сделайте это!

PS: подсказка по функциональности в названии класса :).
 */
@CodeReview(approved = true)
class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
