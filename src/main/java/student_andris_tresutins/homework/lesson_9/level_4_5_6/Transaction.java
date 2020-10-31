package student_andris_tresutins.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {

         this.trader = trader;
         this.amount = amount;
    }

    public Trader getTrader() {
        return  trader;
    }

    public int getAmount() {
        return amount;
    }
}
