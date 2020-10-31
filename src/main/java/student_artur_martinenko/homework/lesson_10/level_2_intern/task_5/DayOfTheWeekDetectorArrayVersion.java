package student_artur_martinenko.homework.lesson_10.level_2_intern.task_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String dayOfWeek;
        switch (dayNumber(number)) {
            case 0:
                dayOfWeek = weekArray[0];
                break;
            case 1:
                dayOfWeek = weekArray[1];
                break;
            case 2:
                dayOfWeek = weekArray[2];
                break;
            case 3:
                dayOfWeek = weekArray[3];
                break;
            case 4:
                dayOfWeek = weekArray[4];
                break;
            case 5:
                dayOfWeek = weekArray[5];
                break;
            case 6:
                dayOfWeek = weekArray[6];
                break;
            default:
                dayOfWeek = "Please input a valid number between 1 and 7";
                break;
        }
        return dayOfWeek;
    }

    private int dayNumber(int number) {
        return number - 1;
    }

}