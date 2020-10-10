package student_andris_tresutins.homework.lesson_9.level_1;

public class SafeDemo_T5 {
    public static void main(String[] args) {

        Safe_T5 test = new Safe_T5("password123", 2500);
        System.out.println(test.getMoneyInfo());

        test.getMoney("password123", 500);
        System.out.println(test.getMoneyInfo());

        test.putMoney("password123", 500);
        System.out.println(test.getMoneyInfo());

        test.putMoney("password1234", 500);
        System.out.println(test.getMoneyInfo());




    }
}
