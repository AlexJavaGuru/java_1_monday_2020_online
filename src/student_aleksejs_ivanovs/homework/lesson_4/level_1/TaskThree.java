package student_aleksejs_ivanovs.homework.lesson_4.level_1;

import java.util.Scanner;

class TaskThree {

    public static void main(String[] args) {
        System.out.println("Enter an integer from 1 to 7!");
        Scanner num = new Scanner (System.in);
        int day = num.nextInt();

        switch (day) {
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
                System.out.println("Number out of range!");
        }
    }

}
