package student_andris_tresutins.homework.lesson_11.level_1.Task_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return title.equals(that.title) &&
                author.equals(that.author);
    }
}
