package teacher.lesson_11.lessoncode;


import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> myFirstArray = new ArrayList<>();

        // add elements
        myFirstArray.add("One");
        myFirstArray.add("Two");
        myFirstArray.add("Two");
        myFirstArray.add("Two");
        myFirstArray.add("Three");

        // remove elements
        //myFirstArray.remove("Two");

        // read value by index
        String result = myFirstArray.get(0);
        System.out.println(result);

        for (int i = 0; i < myFirstArray.size(); i++) {
            String tempString = myFirstArray.get(i);
            System.out.println(i + " : " + tempString);
        }

        int iterator = 0;
        // iter - type iter and wait for Idea hint
        for (String tempString : myFirstArray) {
            System.out.println(iterator + " : " + tempString);
            iterator++;
        }

        //Ask for element index
        int indexOf = myFirstArray.indexOf("Two");
        System.out.println(indexOf);


    }
}
