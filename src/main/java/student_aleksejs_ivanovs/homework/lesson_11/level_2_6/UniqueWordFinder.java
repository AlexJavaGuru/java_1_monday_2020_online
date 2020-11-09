package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {    //  Task_27

    Set<String> find(String text) {
        String[] removeSymbols = {",", "."};
        for (String symbols : removeSymbols) {
            text = text.replace("" + symbols, "");
        }
        return new HashSet<>(Arrays.asList(text.split(" ")));
    }

}
