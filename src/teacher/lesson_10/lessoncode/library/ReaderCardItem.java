package teacher.lesson_10.lessoncode.library;

import java.util.Date;

public class ReaderCardItem {

    private ReaderCard readerCard;
    private Book book;
    private Date takeAway;
    private Date returnDueDate;
    private Date actualReturnDate;

    public ReaderCardItem(ReaderCard readerCard, Book book, Date takeAway, Date returnDueDate, Date actualReturnDate) {
        this.readerCard = readerCard;
        this.book = book;
        this.takeAway = takeAway;
        this.returnDueDate = returnDueDate;
        this.actualReturnDate = actualReturnDate;
    }

    @Override
    public String toString() {
        return "ReaderCardItem{" +
                "readerCard=" + readerCard +
                ", book=" + book +
                ", takeAway=" + takeAway +
                ", returnDueDate=" + returnDueDate +
                ", actualReturnDate=" + actualReturnDate +
                '}';
    }
}
