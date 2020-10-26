package student_pjotrs_grezmanis.lesson_6.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetector {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.recognizeDayOfTheWeek(firstNumber);
        System.out.println(result);

    }

    public String recognizeDayOfTheWeek(int dayNumber) {
        return null;
//        return switch (dayNumber) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Please input a valid number between 1 and 7";
//        };
    }
}

    


