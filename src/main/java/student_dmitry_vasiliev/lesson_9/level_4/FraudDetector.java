package student_dmitry_vasiliev.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Pokemon".equals(trader.getFullName())){
            System.out.println("Transaction canceled - Pokemon is fraud name!");
            return true; //Task_17
        } else if (t.getAmount() > 1000000){
            System.out.println("Transaction canceled - amount greater than 1000000!");
            return true; //Task_18
        } else if ("Sidney".equals(trader.getCity())){
            System.out.println("Transaction canceled - Sidney is fraud city!");
            return true; //Task_19
        } else  if ("Jamaica".equals(trader.getCountry())){
            System.out.println("Transaction canceled - Jamaica is fraud country!");
            return true; //Task_20
        } else if ("Germany".equals(trader.getCountry()) && t.getAmount() > 1000){
            System.out.println("Transaction canceled - Germany with amount 1000 is fraud action!");
            return true; //Task_21
        } System.out.println("The transaction is safe!");
        return false;

    }
}
