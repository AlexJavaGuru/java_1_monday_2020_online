package student_andris_tresutins.homework.lesson_9.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FraudDetectorConditionMoneyAndCountry_T21 {

    boolean deniedGermany1000(Trader trader, Transaction transaction){

        String country = trader.getCountry();
        int money = transaction.getAmount();

        return country == "Germany" && money > 1000;

    }
}
