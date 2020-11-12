package student_lilija_g.homework.lesson_10.level_2_intern.task_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String detectDayNameBySwitch(int number) {
//        Так красивее:
//        return switch (number) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Please input a valid number between 1 and 7";
//        };
        String day;
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Please input a valid number between 1 and 7";
                break;
        }
        return day;
    }

    @Override
    public String detectDayNameFromList(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        return switch (number - 1) {
//            case 0 -> weekDays[0];
//            case 1 -> weekDays[1];
//            case 2 -> weekDays[2];
//            case 3 -> weekDays[3];
//            case 4 -> weekDays[4];
//            case 5 -> weekDays[5];
//            case 6 -> weekDays[6];
//            default -> "Please input a valid number between 1 and 7";
//        };
        String day;
        switch (number-1) {
            case 0:
                day = weekDays[0];
                break;
            case 1:
                day = weekDays[1];
                break;
            case 2:
                day = weekDays[2];
                break;
            case 3:
                day = weekDays[3];
                break;
            case 4:
                day = weekDays[4];
                break;
            case 5:
                day = weekDays[5];
                break;
            case 6:
                day = weekDays[6];
                break;
            default:
                day = "Please input a valid number between 1 and 7";
                break;
        }
        return day;
    }
}
