package student_andris_tresutins.homework.lesson_11.level_1;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
public class Task_3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("juiceBox");
        list.add("boomBox");

        //Find out the size of List
        System.out.println(list.size());

        //remove by index
        list.remove(0);

        //remove without specifing an index
        list.remove("pear");

        //Find out if the list is empty
        System.out.println(list.isEmpty());

        //Print out all list elements
        for(String element : list){
            System.out.println(element);
        }



    }

}
