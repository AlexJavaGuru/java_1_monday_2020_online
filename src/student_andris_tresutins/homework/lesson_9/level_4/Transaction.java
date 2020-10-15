package student_andris_tresutins.homework.lesson_9.level_4;

public class Transaction {

    private Trader m_Trader;
    private int m_Amount;

    Transaction(Trader trader, int amount) {

         m_Trader = trader;
         m_Amount = amount;
    }

    public Trader getTrader() {
        return  m_Trader;
    }

    public int getAmount() {
        return m_Amount;
    }
}
