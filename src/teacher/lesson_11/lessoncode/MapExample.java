package teacher.lesson_11.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> myFirstMap = new HashMap<>();

        myFirstMap.put(1, "A");
        myFirstMap.put(2, "B");
        myFirstMap.put(3, "C");
        myFirstMap.put(4, "D");
        myFirstMap.put(4, "D");

        //index = hashCode(key) & (n-1).

        myFirstMap.remove(2);

        myFirstMap.replace(3, "F");

        // 1 -> "A" (key + value = entry)
        // 2 -> "B"
        // 3 -> "C"
        // 4 -> "D"

        for (Map.Entry<Integer, String> entry : myFirstMap.entrySet()) {
            System.out.println(entry.toString());
        }
//
//        for (Map.Entry<Integer, String> entry : myFirstMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
//        for (Integer integer : myFirstMap.keySet()) {
//            System.out.println(integer);
//        }
//
//        for (String value : myFirstMap.values()) {
//            System.out.println(value);
//        }
    }
}
