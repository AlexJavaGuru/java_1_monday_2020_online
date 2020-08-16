package student_lilija_g.homework.lesson_3.level_4;

public class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,  // ,
                       int moneyAmount)

    {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;      // money ->  moneyAmount
    }

    public String getOwnerFirstName() {      // )
        return this.ownerFirstName;          // ;
    }

    public String getOwnerLastName() {       // (
        return this.ownerLastName;          // ownerFirstName -> ownerLastName and ;
    }

    public int getMoneyAmount() {            // int
        return this.moneyAmount;
        }
    }


