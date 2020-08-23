package student_dmitry_vasiliev.lesson_3.level_6;

class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            int moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + bankAccount.getOwner());
            System.out.println("Money = " + bankAccount.getMoney());
        }

    }

