package student_lilija_g.homework.lesson_4.level_x.super_task_2;

public class LeapYearTest {

    public static void main(String[] args) {

        LeapYear myLeapYear = new LeapYear();

        int myYear = 2020;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));

        myYear = 2019;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));

        myYear = 2016;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));

        myYear = 2015;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));

        myYear = 2000;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));

        myYear = 1900;
        System.out.println("Year=" + myYear + " - Leap year is "+ myLeapYear.isLeapYear(myYear));
    }
}
