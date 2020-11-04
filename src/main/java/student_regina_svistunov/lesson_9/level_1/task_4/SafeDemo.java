package student_regina_svistunov.lesson_9.level_1.task_4;


class SafeDemo {


    public static void main(String[] args) {

        Safe safe = new Safe("1357", 100);

        System.out.println("Amount of money is " + safe.getMoneyAmount());
        System.out.println("Pin Code is:" + safe.getPinCode());

    }

}