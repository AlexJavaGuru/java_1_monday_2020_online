package student_dmitry_vasiliev.lesson_10.level_2;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    // Try to use switch here!!
    @Override
    public String detectDayName(int number) {
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
                day = "from 1 to 7!";
                break;
        }
        return day;
    }
}
