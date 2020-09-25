package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetector {

    String detectDayName(int number) {
//        if ((number >=1) && (number <= 7)) {
//            switch (number) {
//                case 1 -> {
//                    return ("Monday");
//                }
//                case 2 -> {
//                    return ("Tuesday");
//                }
//                case 3 -> {
//                    return ("Wednesday");
//                }
//                case 4 -> {
//                    return ("Thursday");
//                }
//                case 5 -> {
//                    return ("Friday");
//                }
//                case 6 -> {
//                    return ("Saturday");
//                }
//                case 7 -> {
//                    return ("Sunday");
//                }
//            }
//        }
//        else {
//            System.out.println("Please input a valid number between 1 and 7");
//        }
        return String.valueOf(number);
    }

}
