package teacher.lesson_10.lessoncode.library;

import java.math.BigDecimal;

public class Penalty {

    private BigDecimal amount;
    private ReaderCard readerCard;

    public Penalty(BigDecimal amount, ReaderCard readerCard) {
        this.amount = amount;
        this.readerCard = readerCard;
    }
}
