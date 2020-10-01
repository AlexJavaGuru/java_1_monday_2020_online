package student_dmitry_vasiliev.lesson_7;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

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
@CodeReview(approved = false)
@CodeReviewComment(comment = "Если в задание даны сигнатуры методов - используйте их. " +
        "1 - метод changeDotCommToEmpty можно было бы назвать как удаление знаков пунктуации. Если хотите преобразовать строку, то не надо плодить её копии" +
        "просто записывайте в нее." +
        "2 - метод arrayOfWord можно сделать в одну строку." +
        "3 - сам алгорит очень сложный. Попробуйте переделать. Смотрите, у вас задача, найти самое частое слово. Разбейте задачу на две части." +
        "   1: Напишите метод, который принимает массив слов (который вы уже имеете) и слово. Алгоритм должен поискать данное слово по массиву и возвращать" +
        "   количество вхождений этого слова в массив." +
        "   2: Основной алгоритм пробегает по всем словам массива, вызывает метод описанный мной выше, передавая туда сам массив и слово на данной итерации." +
        "   Далее, задача сводиться к нахождению максимума, только кроме максимального значения, еще надо записывать слово, на текущей итерации" +
        "Самое плохое, что вы сделали, это то, как вы пользуетесь вашим сервисом. Зачем пользователю видеть весь этот ужос? words.findEntryMaxNumber(words.wordMaxEntry(words.arrayOfWord(words.changeDotCommToEmpty(sentence))));" +
        "это очень сложно читать, а еще сложнее это дэбажить. Максимум, вы можете вызвать один метод у аргумента, передаваемого в другой метод." +
        "Я вам рекомендую. спрятать всю эту логику в классе WordService. Вы должны просто вызвать сервис -> передать в него стринг с текстом -> получить результат")
class WordService {

    public String changeDotCommToEmpty(String sentence) {
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");
        return sentence;
    }

    public String[] arrayOfWord(String sentence) {
        return sentence.split("\\s");
    }

    public int[] wordMaxEntry(String[] array) {
        int[] entryCounter = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    entryCounter[i] += 1;
                }
            }
            //int j = i;
        }
        return entryCounter;
    }

    public int findEntryMaxNumber(int[] array) {
        int maxNumber = 0;
        int indexNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                indexNumber = i;
            }
        }
        return indexNumber;
    }

    public void printWord(String sentence, String[] wordArray, int indexNumber) {
        System.out.println("In sentence //" + sentence + "//, word /" + wordArray[indexNumber] +
                "/ has most entries.");
    }
}


