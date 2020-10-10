package student_andris_tresutins.homework.lesson_9.level_1;


public class SafeDemo_T4 {
    public static void main(String[] args) {

        Safe_T4 test = new Safe_T4(1234, 2000);

        System.out.println(test.getPin());
        System.out.println(test.getMoney());

        test.pin = 4321;
        test.money = 0;

        System.out.println("new Pin = " + test.getPin());
        System.out.println("new Balance = " + test.getMoney());

    }
}
