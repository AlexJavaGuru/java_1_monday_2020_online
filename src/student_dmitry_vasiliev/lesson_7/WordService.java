package student_dmitry_vasiliev.lesson_7;

import teacher.annotations.CodeReview;

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
@CodeReview(approved = true)
class WordService {

    public void findMostFrequentWord(String sentence) {
        String[] array = arrayOfWord(removePunctMarks(sentence));
        System.out.println("In sentence *" + sentence + "*, word *" + findMostCommWord(array) +
                "* has most entries.");
    }

    public String removePunctMarks(String sentence) {
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");
        return sentence;
    }

    public String[] arrayOfWord(String sentence) {
        return removePunctMarks(sentence).split("\\s");
    }

    public int wordEntry(String[] arrayOfWord, String word) {
        int wordCounter = 0;
        for (int i = 0; i < arrayOfWord.length; i++) {
            if (arrayOfWord[i].equals(word)) {
                wordCounter += 1;
            }
        }
        return wordCounter;
    }

    public String findMostCommWord(String[] array) {
        int maxNumber = 0;
        String mostCommWord = new String();
        for (int i = 0; i < array.length; i++) {
            if (wordEntry(array, array[i]) > maxNumber) {
                maxNumber = wordEntry(array, array[i]);
                mostCommWord = array[i];
            }
        }
        return mostCommWord;
    }
}


