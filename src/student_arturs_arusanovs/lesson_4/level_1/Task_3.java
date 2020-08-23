package student_arturs_arusanovs.lesson_4.level_1;

import java.util.Scanner;

//Для этой задачи, лучше бы смотрелся оператор switch...нет? =)
class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number between 1 and 7 please.");
        int number = scanner.nextInt();

        switch (number) {
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
            default:
                System.out.println("Invalid number entered.");
        }

    }
}
