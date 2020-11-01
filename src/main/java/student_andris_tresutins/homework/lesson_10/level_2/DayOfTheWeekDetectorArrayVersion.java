package student_andris_tresutins.homework.lesson_10.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersion {

    public String detectDayName(int number) {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String weekDay;
        switch (number) {
            case 1:
                weekDay = day[0];
                break;

            case 2:
                weekDay = day[1];
                break;

            case 3:
                weekDay = day[2];
                break;

            case 4:
                weekDay = day[3];
                break;

            case 5:
                weekDay = day[4];
                break;

            case 6:
                weekDay = day[5];
                break;

            case 7:
                weekDay = day[6];
                break;

            default:
                weekDay = "Please input a valid number between 1 and 7";
                break;
        }
        return weekDay;
    }
}
