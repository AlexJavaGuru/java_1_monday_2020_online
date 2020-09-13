package student_andris_tresutins.homework.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Почитайте про сравнение Объектов типа String между собой.")
public class Task_2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();

        Task_2 detector = new Task_2();

        String detectedDay = detector.detectDayName(firstNumber);
        if (detectedDay != "") {
            System.out.println("Detected day is " + detectedDay);
        }
        else
        {
            System.out.println("The entered number is invalid");
        }
    }

    public String detectDayName(int number){

        if (number >= 1 && number <= 7 ){
            switch (number) {
                case 1 -> {
                    return "Monday";
                }
                case 2 -> {
                    return "Tuesday";
                }
                case 3 -> {
                    return "Wednesday";
                }
                case 4 -> {
                    return "Thursday";
                }
                case 5 -> {
                    return "Friday";
                }
                case 6 -> {
                    return "Saturday";
                }
                case 7 -> {
                    return "Sunday";
                }
            }

        }
        return "";
    }

}

