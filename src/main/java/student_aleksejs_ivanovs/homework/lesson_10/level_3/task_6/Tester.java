package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Tester {

    public static void main(String[] args) {
        MyPredicate myPredicate = x -> true;
        System.out.println(myPredicate.test(10));
    }

}
