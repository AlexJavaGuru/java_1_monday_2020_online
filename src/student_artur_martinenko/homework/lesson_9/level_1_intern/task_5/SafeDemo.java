package student_artur_martinenko.homework.lesson_9.level_1_intern.task_5;

class SafeDemo {

    public static void main(String[] args) {
        Safe victim = new Safe(100, "0000");
        System.out.println("1. Balance is " + victim.getBalance());

        victim.putMoney(100, "0000");
        System.out.println("2. Balance is " + victim.getBalance());

        victim.getMoney(200,"0000");
        System.out.println("3. Balance is " + victim.getBalance());

    }

}
