package student_artur_martinenko.homework.lesson_10.level_2_intern.task_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String dayOfWeek;
        switch (number) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Please input a valid number between 1 and 7";
                break;
        }
        return dayOfWeek;
    }

}