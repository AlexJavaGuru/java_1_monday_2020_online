package teacher.lesson_10.lessoncode.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReaderCard {

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private  Reader reader;

    private List<ReaderCardItem> items = new ArrayList<>();

    public ReaderCard(Reader reader) {
        this.reader = reader;
    }

    public void takeTheBook(Book book) throws ParseException {
        ReaderCardItem item = new ReaderCardItem(this, book, new Date(),
                formatter.parse("01.11.2020"), null);
        items.add(item);
    }

    public List<ReaderCardItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ReaderCard{" +
                "reader=" + reader +
                ", items=" + items +
                '}';
    }
}
