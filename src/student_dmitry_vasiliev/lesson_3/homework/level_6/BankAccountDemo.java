package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            int moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + bankAccount.getOwner());
            System.out.println("Money = " + bankAccount.getMoney());
        }

    }

