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


import java.util.Scanner;

class Task_3_Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer Number from 1 to 7: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 1 || inputNumber > 7) {
            System.out.println("Wrong input number!!!!");
        }
        switch (inputNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

