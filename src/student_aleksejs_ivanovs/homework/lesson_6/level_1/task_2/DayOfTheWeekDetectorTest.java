package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Лучше не сравнивать объекты между собой через ==")
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.monday();
        test.tuesday();
        test.wednesday();
        test.thursday();
        test.friday();
        test.saturday();
        test.sunday();
    }

    public void monday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(1);
        if (dayNumber == "Monday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void tuesday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(2);
        if (dayNumber == "Tuesday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void wednesday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(3);
        if (dayNumber == "Wednesday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void thursday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(4);
        if (dayNumber == "Thursday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void friday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(5);
        if (dayNumber == "Friday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void saturday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(6);
        if (dayNumber == "Saturday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void sunday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayNumber = day.detectDayName(7);
        if (dayNumber == "Sunday") {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }
}
