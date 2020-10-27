package student_andris_tresutins.homework.lesson_10.level_6;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    @Override
    public String toString() {
        return "Book Title = " + title + ". Book Author = " + author + ". is Read ";
    }
}
