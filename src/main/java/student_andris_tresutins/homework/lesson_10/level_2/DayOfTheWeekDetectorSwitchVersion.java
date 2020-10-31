package student_andris_tresutins.homework.lesson_10.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String day;
        switch(number)
        {
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
