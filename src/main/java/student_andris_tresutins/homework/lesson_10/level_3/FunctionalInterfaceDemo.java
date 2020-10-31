package student_andris_tresutins.homework.lesson_10.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class FunctionalInterfaceDemo implements FunctionalInterface {

    public static void main(String[] args) {
        FunctionalInterface say = () -> {
            System.out.println("Yeet");
        };
        say.say();
    }


}
