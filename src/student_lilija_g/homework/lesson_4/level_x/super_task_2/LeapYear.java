package student_lilija_g.homework.lesson_4.level_x.super_task_2;


import teacher.annotations.CodeReview;

@CodeReview(approved = false)
class LeapYear {

    boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else {
            if (year % 100 != 0) {
                return true;
            } else {
                return year % 400 == 0;
            }
        }
    }
}



