package student_artur_martinenko.homework.lesson_10.level_2_intern.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private static Scanner scanner = new Scanner(System.in);

    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        System.out.print("\nEnter week day number: ");
        int day = scanner.nextInt();
        String className = detector.getClass().getSimpleName();
        System.out.println("Passed '" + day + "' to '" + className + "'. It detects -> " + detector.detectDayName(day));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo fromArrayDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        fromArrayDetector.run();

        DayOfTheWeekDetectorDemo fromIfDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        fromIfDetector.run();

        DayOfTheWeekDetectorDemo fromSwitchDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        fromSwitchDetector.run();

    }


}
