package student_lilija_g.homework.lesson_7.level_1_intern.task_1;
/*
Дана строка с текстом.
Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.

class WordService {

    public String findMostFrequentWord(String text) {
           // write solution here
    }

}

Если несколько слов в тексте встречаются одинаково максимальное число раз,
то возвращаем то слово, которое стоит в тексте первым.

Подумайте на какие подзадачи можно разбить эту задачу?
Распишите на бумаге каждую подзадачу в отдельности:
- как она называется,
- что её надо передать на вход (параметры),
- что будет возвращать в качестве результата.

PS: если вы не можете придумать как разбить эту задачу на подзадачи,
пожалуйста попросите помощи! Умение попросить помощи, когда это нужно
навес золота в ИТ.

Убедитесь, что вы сможете из решений всех подзадач
собрать решение главной задачи.
 */

import java.util.Arrays;

class WordService {

    public void findMostFrequentWord(String text) {

        String newText = text.replaceAll("[^a-zA-Z ]", ""); // удаляем все символы не буквы, кроме пробелов
        String[] textSplit = newText.split(" "); // разделителем слов считаем пробел

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String currentWord : textSplit) {
            if (currentWord.equalsIgnoreCase(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = currentWord;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }
        System.out.println("Result of the task: " + '"' + maxWord + '"' + " (Occurs " + maxCount + " times)");
    }
}
