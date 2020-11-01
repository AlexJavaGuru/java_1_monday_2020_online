package student_aleksejs_ivanovs.homework.lesson_10.level_6;

import teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
class Book {

    private String author;
    private String bookName;
    private boolean finishedBook;

    public Book(String author, String bookName) {
        this.bookName = bookName;
        this.author = author;
        //this.finishedBook = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean getFinishedBook() {
        return finishedBook;
    }

    public void setFinishedBook(boolean finishedBook) {
        this.finishedBook = finishedBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return  bookName + " [" + author + "]";
    }

}
