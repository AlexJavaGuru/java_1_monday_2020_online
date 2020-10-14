package teacher.lesson_11.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> myFirstSet = new HashSet<>();

        myFirstSet.add("A");
        myFirstSet.add("B");
        myFirstSet.add("C");
        myFirstSet.add("D");
        myFirstSet.add("A1");
        myFirstSet.add("B2");
        myFirstSet.add("C3");
        myFirstSet.add("D4");
        myFirstSet.add("C5");
        myFirstSet.add("D6");


        for (String tempString : myFirstSet) {
            System.out.println(tempString);
        }

    }
}
