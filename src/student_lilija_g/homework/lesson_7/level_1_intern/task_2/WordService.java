package student_lilija_g.homework.lesson_7.level_1_intern.task_2;

import java.util.Arrays;

/*
Запрограммируйте решение каждой из подзадачь из Task_1.txt в отдельности.
Для этого создайте в классе WordService отдельные методы для каждой подзадачи.
Напишите автоматические тесты для каждой подзадачи.
 */
class WordService {

    public String replacementOfUnnecessaryCharacters(String text) {
        return text.replaceAll("[^a-zA-Z ]", "");
    }

    public String[] creatingArrayOfWords(String text) {
        return text.split(" ");
    }

    public String findMostFrequentWord(String[] text) {

        String maxWord = text[0];
        int maxCount = 1;

        for (String currentWord : text) {
            int currentCount = findWordCount(text, currentWord);
            if (maxCount < currentCount) {
                maxCount = currentCount;
                maxWord = currentWord;
            }
        }
        return maxWord;
    }

    public int findWordCount(String[] text, String word) {
        int countWord = 0;
        for (String currentWord : text) {
            if (currentWord.equalsIgnoreCase(word)) {
                countWord++;
            }
        }
        return countWord;
    }

    public void printWord(String maxWord) {
        System.out.println("Result of the task: " + '"' + maxWord + '"');
    }

    public void printCount(int maxCount) {
        System.out.println("(Occurs " + maxCount + " times)");
    }

    public void printWordArray(String[] text) {
        for (int i = 0; i < text.length; i++) {
            System.out.println("Word " + i + " is " + text[i]);
        }
    }
}
