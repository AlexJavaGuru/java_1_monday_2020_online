package student_aleksejs_ivanovs.homework.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorVersionTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorVersionTest test = new DayOfTheWeekDetectorVersionTest();
        test.dayOfTheWeekDetectorIfVersionTest();
        test.dayOfTheWeekDetectorSwitchVersionTest();
    }

    public void dayOfTheWeekDetectorIfVersionTest() {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        String dayName = day.detectDayName(3);

        if (dayName.equals("Wednesday")) {
            System.out.println("dayOfTheWeekDetectorIfVersionTest passed");
        } else {
            System.out.println("dayOfTheWeekDetectorIfVersionTest failed");
        }
    }

    public void dayOfTheWeekDetectorSwitchVersionTest() {
        DayOfTheWeekDetectorSwitchVersion day = new DayOfTheWeekDetectorSwitchVersion();
        String dayName = day.detectDayName(5);

        if (dayName.equals("Friday")) {
            System.out.println("dayOfTheWeekDetectorSwitchVersionTest passed");
        } else {
            System.out.println("dayOfTheWeekDetectorSwitchVersionTest failed");
        }
    }

}
