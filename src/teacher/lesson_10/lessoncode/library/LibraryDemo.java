package teacher.lesson_10.lessoncode.library;

import java.text.ParseException;

public class LibraryDemo {

    public static void main(String[] args) throws ParseException {

        Reader reader = new Reader("Alex");

        Book book1 = new Book("A", "BB");
        Book book2 = new Book("D", "CC");

        ReaderCard readerCard = new ReaderCard(reader);

        readerCard.takeTheBook(book1);
        readerCard.takeTheBook(book2);

        ReaderCardItem readerCardItem = readerCard.getItems().get(0);
        System.out.println(readerCardItem);
    }
}
