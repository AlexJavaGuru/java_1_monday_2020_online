package student_regina_svistunov.lesson_6.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" Please, enter number: ... If enter number 0 you can break. ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
        }
    }
}


    //    Прерывание цикла: «break»
    //        Обычно цикл завершается при вычислении условия в false.
    //        Но мы можем выйти из цикла в любой момент с помощью специальной директивы break.