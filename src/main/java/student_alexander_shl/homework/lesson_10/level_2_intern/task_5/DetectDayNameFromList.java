package student_alexander_shl.homework.lesson_10.level_2_intern.task_5;

public class DetectDayNameFromList implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
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
