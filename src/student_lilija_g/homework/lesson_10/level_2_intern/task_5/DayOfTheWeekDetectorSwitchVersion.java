package student_lilija_g.homework.lesson_10.level_2_intern.task_5;

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
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
}
