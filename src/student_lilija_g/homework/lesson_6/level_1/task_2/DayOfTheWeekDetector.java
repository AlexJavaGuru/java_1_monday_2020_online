package student_lilija_g.homework.lesson_6.level_1.task_2;

class DayOfTheWeekDetector {

    public String detectDayName(int number) {

    String weekDay;
        switch (number) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Please input a valid number between 1 and 7";
                break;
        }
        return weekDay;
    }
}