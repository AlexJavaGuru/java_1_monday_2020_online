package student_alexander_shl.homework.lesson_9.level_4_junior;

class FraudDetector {

    boolean isFraud(Transaction transaction, int amount) {
        return isFraud_Rule_1(transaction) ||
                isFraud_Rule_2(transaction, amount) ||
                isFraud_Rule_3(transaction) ||
                isFraud_Rule_4(transaction) ||
                isFraud_Rule_5(transaction, amount);
    }

    boolean isFraud_Rule_1(Transaction transaction) { // Task_17
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }

    boolean isFraud_Rule_2(Transaction transaction, int amount) { // Task_18
        return amount > 1000000;
    }

    Boolean isFraud_Rule_3(Transaction transaction) {  // Task_19
        Trader trader = transaction.getTrader();
        return "Sydney".equals(trader.getCity());
    }

    Boolean isFraud_Rule_4(Transaction transaction) {  // Task_20
        Trader trader = transaction.getTrader();
        return "Jamaica".equals(trader.getCountry());
    }

    boolean isFraud_Rule_5(Transaction transaction, int amount) {  // Task_21
        Trader trader = transaction.getTrader();
        return "Germany".equals(trader.getCountry()) && amount > 1000;
    }

}
