package student_artur_martinenko.homework.lesson_4.level_x;

class LeapYear {

    public boolean isLeapYear(int year) {
        if ((year < 1) || (9999 < year)) {
            return false;
        } else if ((year % 4 == 0) &&    // 1
                (year % 100 == 0) &&     // 2
                (year % 400 == 0)) {     // 5
            return true;
        } else if ((year % 4 == 0) &&    // 1
                (year % 100 != 0)) {     // 4
            return true;
        } else {
            return false;
        }
    }
}
