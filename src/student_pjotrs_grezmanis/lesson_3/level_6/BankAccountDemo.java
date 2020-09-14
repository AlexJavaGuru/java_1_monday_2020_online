package student_pjotrs_grezmanis.lesson_3.level_6;

 class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        //System.out.println("Owner = " + owner);
        //System.out.println("Money = " + money);
    }

}
