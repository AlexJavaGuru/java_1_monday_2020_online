package student_artur_martinenko.homework.lesson_8.level_7_senior;

import teacher.annotations.CodeReview;

import java.text.SimpleDateFormat;
import java.util.Date;

@CodeReview(approved = true)
class Service {

    private LibraryReader readersName;
    private Book book;
    private Date dateTaken = null;
    private Date dateReturned = null;
    private boolean bookOnHands = false;
    private boolean bookReserved = false;

    public Service(LibraryReader readersName, Book book, Date dateTaken) {
        this.readersName = readersName;
        this.book = book;
        this.dateTaken = dateTaken;
    }

    public LibraryReader getReadersName() {
        return readersName;
    }

    public void setReadersName(LibraryReader readersName) {
        this.readersName = readersName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public boolean isBookOnHands() {
        return bookOnHands;
    }

    public void setBookOnHands(boolean bookOnHands) {
        this.bookOnHands = bookOnHands;
    }

    public boolean isBookReserved() {
        return bookReserved;
    }

    public void setBookReserved(boolean bookReserved) {
        this.bookReserved = bookReserved;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");

        return "\nReader = " + readersName.getName() + " " + readersName.getLastName() + "\n" +
                "\tBook = " + book.getAuthor() + " - " + book.getName() + "\n" +
                "\tDate taken/reserved = " + ft.format(dateTaken) + "\n" +
                "\tDate returned/unreserved = " + ft.format(dateReturned) + "\n" +
                "\tWas on hands = " + bookOnHands + "\n" +
                "\tWas reserved = " + bookReserved;
    }
}
