package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14_25;

import teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
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

    @Override
    public String toString() {
        return "\tBook " + title +
                " [" + author +
                "]";
    }
}
