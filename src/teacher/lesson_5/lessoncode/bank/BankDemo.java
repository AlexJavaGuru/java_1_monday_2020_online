package teacher.lesson_5.lessoncode.bank;

public class BankDemo {

    public static void main(String[] args) {

        BankAccount alexBankAccount = new BankAccount("Alex Ivanov");

        alexBankAccount.printInformation();

        Transaction transaction = new Transaction(true, 100);

        alexBankAccount.printInformation();

        Transaction[] transactions = new Transaction[5];

        transactions[0] = new Transaction(true, 50);
        transactions[1] = new Transaction(true, 50);
        transactions[2] = new Transaction(false, 100);
        transactions[3] = new Transaction(false, 0);
        transactions[4] = new Transaction(true, 150);

        alexBankAccount.executeTransaction(transactions);

        for (int i = 0; i < transactions.length; i++) {
            System.out.println("[" + i + "] = " + transactions[i]);
        }

//        alexBankAccount.printInformation();
    }
}
