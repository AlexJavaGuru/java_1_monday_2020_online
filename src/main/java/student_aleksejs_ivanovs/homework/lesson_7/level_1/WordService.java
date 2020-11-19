package student_aleksejs_ivanovs.homework.lesson_7.level_1;

/*Дана строка с текстом.
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
собрать решение главной задачи.*/

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Попробуйте переделать. Смотрите, у вас задача, найти самое частое слово. Разбейте задачу на две части.\" +\n" +
        "        \"   1: Напишите метод, который принимает массив слов (который вы уже имеете) и слово. Алгоритм должен поискать данное слово по массиву и возвращать\" +\n" +
        "        \"   количество вхождений этого слова в массив.\" +\n" +
        "        \"   2: Основной алгоритм пробегает по всем словам массива, вызывает метод описанный мной выше, передавая туда сам массив и слово на данной итерации.\" +\n" +
        "        \"   Далее, задача сводиться к нахождению максимума, только кроме максимального значения, еще надо записывать слово, на текущей итерации\" +" +
        "Еще мне очень не нравиться ваш временный массив, наличие которого, максимально усложняет читаемость кода.")
class WordService {

    public String findMostFrequentWord(String text) {
        String[] array = text.split(" ");
        String wordReturn = array[0];
        int repeatedCount = 1;
        for (String repeat : array) {
            if (repeatedCount < wordRepeats(array, repeat)) {
                repeatedCount = wordRepeats(array, repeat);
                wordReturn = repeat;
            }
        }
        return wordReturn;
    }

    public int wordRepeats(String[] array, String wordFind) {
        int count = 0;
        for (String word : array) {
            if (word.equals(wordFind)) {
                count++;
            }
        }
        return count;
    }

}
