package student_dmitry_vasiliev.lesson_2.level_3;

import java.util.Scanner;
//TODO: Мне чуть-чуть не нравиться форматирование вашего класса. Ниже я оставлю свой вариант - сравните. Из грубого: Не стоит писать метод в одну строку с объявлением класса
//TODO: public class Task_9 { public static void main(String[] args){ -> т.е. вот так. Метод должен начинаться на новой строке.
//TODO: Плюсик за использование циктов ) Вы читаете материал дальше? Или просто есть какой-то опыт? Можно ответить мне в телеграм в личку )
public class Task_9 { public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
    int a = in.nextInt();
    int b = 1;

        do {
            int c = a * b;
            System.out.println(a+" * "+b+" = "+c);
            b++;
        }while (b < 11);

}
}

//public class Task_9 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number");
//        int a = in.nextInt();
//        int b = 1;
//
//        do {
//            int c = a * b;
//            System.out.println(a + " * " + b + " = " + c);
//            b++;
//        } while (b < 11);
//
//    }
//}

