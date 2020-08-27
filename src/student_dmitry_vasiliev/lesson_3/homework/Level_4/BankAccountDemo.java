package student_dmitry_vasiliev.lesson_3.homework.Level_4;

import student_dmitry_vasiliev.lesson_3.homework.Level_4.BankAccount;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 1000000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
