package student_lilija_g.homework.lesson_4.level_x.super_task_2;

class LeapYear {

    boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }


    }
}



