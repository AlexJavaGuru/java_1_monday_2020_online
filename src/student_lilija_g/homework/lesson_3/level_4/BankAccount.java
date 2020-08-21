package student_lilija_g.homework.lesson_3.level_4;

class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    BankAccount(String ownerFirstName,
                       String ownerLastName,  // ,
                       int moneyAmount)

    {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;      // money ->  moneyAmount
    }

    String getOwnerFirstName() {      // )
        return this.ownerFirstName;          // ;
    }

    String getOwnerLastName() {       // (
        return this.ownerLastName;          // ownerFirstName -> ownerLastName and ;
    }

    int getMoneyAmount() {            // int
        return this.moneyAmount;
        }
    }


