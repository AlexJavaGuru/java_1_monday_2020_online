package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordFinder {
    Set<String> find(String text){
        String[] unnecessarySymbols = {".", ","};
        for (String character : unnecessarySymbols){
            text = text.replace("" + character, "");
        }
        return new TreeSet<>(Arrays.asList(text.split(" ")));

    }
}
