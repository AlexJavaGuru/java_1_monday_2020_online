package student_artur_martinenko.homework.lesson_9.level_1_intern.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe victim = new Safe(100, "0000");

        System.out.println("Balance is " + victim.balance);
        System.out.println("PinCode is " + victim.pinCode);

        victim.balance = 100000;
        System.out.println("Balance is " + victim.getBalance());

        victim.pinCode = "1111";
        System.out.println("Balance is " + victim.balance);
        System.out.println("PinCode is " + victim.pinCode);

    }

}
