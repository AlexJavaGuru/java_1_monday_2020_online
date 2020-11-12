package student_andris_tresutins.homework.lesson_11.level_1;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
public class Task_4 {

    public static void main(String[] args) {
        // java util List allows duplicates
        // Sets in java dont allow duplicates and are similair to Lists
        ArrayList<String> list = new ArrayList<>();
        list.add("beans");
        list.add("beans");
        list.add("beans");

        for(String element : list){
            System.out.println(element);
        }
    }

}
