package student_dmitry_vasiliev.lesson_10.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    // Try to use switch here!!
    @Override
    public String detectDayName(int number) {
        String[] array = new String[8];
        array[1] = "Monday";
        array[2] = "Tuesday";
        array[3] = "Wednesday";
        array[4] = "Thursday";
        array[5] = "Friday";
        array[6] = "Saturday";
        array[7] = "Sunday";

        if (number > 0 && number < 8) {
            return array[number];
            //System.out.println(array[number])
        } else {
            return "from 1 to 7!";
        }
    }
}

