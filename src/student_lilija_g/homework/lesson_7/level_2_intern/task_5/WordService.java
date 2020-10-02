package student_lilija_g.homework.lesson_7.level_2_intern.task_5;

import teacher.annotations.CodeReview;

/*
Попробовать применить на практике знания о функциях
полученные из третьей главы ("Функции") книги Роберта Мартина "Чистый код" (Clean code).
Попробуйте оценить свой код написанный для решения задачи
нахождения наиболее часто встречаемого в тексте слова.
Следует ли ваш код всем правилам, которые описыны в книге "Чистый код".
Критически оцените написанный вами код и если увидите те места,
которые следует улучшить то сделайте это! Выполните рефакторинг!
 */
@CodeReview(approved = true)
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

    public int findWordCount (String[] text, String word) {
        int countWord = 0;
        for (String currentWord : text) {
            if (currentWord.equalsIgnoreCase(word)) {
                countWord++;
            }
        }
        return countWord;
    }

    public void printWord (String maxWord) {
        System.out.println("Result of the task: " + '"' + maxWord + '"');
    }

    public void printCount (int maxCount) {
        System.out.println("(Occurs " + maxCount + " times)");
    }

    public void printWordArray(String[] text) {
        for (int i = 0; i < text.length; i++) System.out.println("Word " + i + " is " + text[i]);
    }
}
