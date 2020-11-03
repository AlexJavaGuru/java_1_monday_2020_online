package student_andris_tresutins.homework.lesson_11.level_1;

import java.util.ArrayList;

public class Task_2 {

    public static void main(String[] args) {
        //it cant store primitive data types directly, instead it uses a wrapper to "wrap" and store primitive data types
        //Wrapper example for int is Integer as shown below
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(42);
        System.out.println(intList.get(0));


    }

}
