package student_dmitry_vasiliev.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Формат должен быть такой.")
class Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter please integer number from 1 to 7...");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
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
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Check please your numpad!");
                break;
        }
    }


}
