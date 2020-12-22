package student_alexander_shl.homework.lesson_10.level_2_intern.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    private final Scanner scanner = new Scanner(System.in);

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        System.out.print("Please enter day number: ");
        int day = scanner.nextInt();
        System.out.println("Day of week is " + detector.detectDayName(day) + ", (" + detector.getClass().getSimpleName() + ")");
    }

     public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifDetector.run();

        DayOfTheWeekDetectorDemo switchDetector = new DayOfTheWeekDetectorDemo(new DetectDayNameBySwitch());
        switchDetector.run();

        DayOfTheWeekDetectorDemo listDetector = new DayOfTheWeekDetectorDemo(new DetectDayNameFromList());
        listDetector.run();
    }
}
