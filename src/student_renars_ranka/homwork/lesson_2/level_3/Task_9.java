package student_renars_ranka.homwork.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input a number: ");
            int num1 = in.nextInt();

            //Хорошо, но формат чуть-чуть страдает. Почему перенесли на новую строчку выражение? С точки зрения выполнения программы, это никак не повлияло ни на что. Пробелы между знаками...их не хватает
            //            for (int i = 0; i < 10; i++) {
            //                System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            //            }
            for (int i=0; i< 10; i++){
                System.out.println(num1 + " x " + (i+1) + " = " +
                        (num1 * (i+1)));
            }
        }
    }
