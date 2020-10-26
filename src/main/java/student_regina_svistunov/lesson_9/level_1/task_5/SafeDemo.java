package student_regina_svistunov.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe("1357", 150);
        System.out.println(" Money amount right now is: " + safe.getBalance());

        safe.putMoney("1357", 300);
        System.out.println(" After putting 300 money amount is: " + safe.getBalance());

        safe.getMoney("1357", 50);
        System.out.println(" After getting out 50 money amount is: " + safe.getBalance());





    }

}