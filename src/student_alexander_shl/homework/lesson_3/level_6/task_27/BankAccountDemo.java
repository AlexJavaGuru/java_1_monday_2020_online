package student_alexander_shl.homework.lesson_3.level_6.task_27;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney(); // String -> int

        System.out.println("Owner = " + bankAccount.owner); // owner -> bankAccount.owner
        System.out.println("Money = " + bankAccount.money); // money -> bankAccount.money
    }
}
