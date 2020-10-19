package student_andris_tresutins.homework.lesson_9.level_4_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Ну где вы такие названия берете? =) Я же вас такому не учил. Не надо использовать любые _ в названиях чего либо. ")
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
