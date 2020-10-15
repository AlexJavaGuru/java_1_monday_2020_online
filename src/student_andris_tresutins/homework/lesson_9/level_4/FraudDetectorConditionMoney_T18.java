package student_andris_tresutins.homework.lesson_9.level_4;

public class FraudDetectorConditionMoney_T18 {

    boolean moneyAmount(Transaction t){

        int amount = t.getAmount();

        return amount > 1000000;
    }
}
