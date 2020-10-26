package student_aleksejs_ivanovs.homework.lesson_9.level_1.task_5;

class SafeTwoDemo {

    public static void main(String[] args) {
        SafeTwo safe = new SafeTwo("123", 100);
        safe.getMoney("123", 50);
        safe.getMoney();
        safe.putMoney("123", 333);
        safe.getMoney();
    }

}
