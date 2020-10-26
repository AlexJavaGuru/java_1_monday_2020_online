package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//Task_27
/*
Найти в тексте все уникальные слова использую для этого java.util.Set.

Создайте класс UniqueWordFinder и метод:

    Set<String> find(String text);

Реализуйте и протестируйте данный метод.
 */
class UniqueWordFinder {

    Set<String> find(String text) {
        String[] symbolsToRemove = {",", "."};
        for (String symbol : symbolsToRemove) {
            text = text.replace("" + symbol, "");
        }
        return new HashSet<>(Arrays.asList(text.split(" ")));
    }
}
