package student_andris_tresutins.homework.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_1Demo {

    public static void main(String[] args) {
        Task_1 test = new Task_1(); //call default constructor
        test.setText("Default Constructor");
        System.out.println(test.getText());
    }

}
