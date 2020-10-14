package teacher.lesson_11.lessoncode;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> myFirstLinkedList = new LinkedList<>();

        myFirstLinkedList.add("One");
        myFirstLinkedList.add("One");
        myFirstLinkedList.add("Two");
        myFirstLinkedList.add("Two");

        myFirstLinkedList.remove("One");

        for (String tempString : myFirstLinkedList) {
            System.out.println(tempString);
        }



    }
}
