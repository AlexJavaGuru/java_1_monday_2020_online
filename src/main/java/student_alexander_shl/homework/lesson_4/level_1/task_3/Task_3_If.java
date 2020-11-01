package student_alexander_shl.homework.lesson_4.level_1.task_3;
/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */


import teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_3_If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer Number from 1 to 7: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 1 || inputNumber > 7) {
            System.out.println("Wrong input number!!!!");
        } else {

            if (inputNumber == 1) {
                System.out.println("Monday");
            } else {
                if (inputNumber == 2) {
                    System.out.println("Tuesday");
                } else {
                    if (inputNumber == 3) {
                        System.out.println("Wednesday");
                    } else {
                        if (inputNumber == 4) {
                            System.out.println("Thursday");
                        } else {
                            if (inputNumber == 5) {
                                System.out.println("Friday");
                            } else {
                                if (inputNumber == 6) {
                                    System.out.println("Saturday");
                                } else {
                                    System.out.println("Sunday");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
