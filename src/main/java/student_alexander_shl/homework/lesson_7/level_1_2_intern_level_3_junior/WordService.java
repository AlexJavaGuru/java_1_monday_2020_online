package student_alexander_shl.homework.lesson_7.level_1_2_intern_level_3_junior;

/* Task_1
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

Task_2

Запрограммируйте решение каждой из подзадачь из Task_1.txt в отдельности.
Для этого создайте в классе WordService отдельные методы для каждой подзадачи.
Напишите автоматические тесты для каждой подзадачи.

Task_3
Из подзадач запрограммированных в Task_2.txt
соберите решение главной задачи из Task_1.txt
и напишите автоматические тесты для главной задачи!

Task_5:
опробовать применить на практике знания о функциях
полученные из третьей главы ("Функции") книги Роберта Мартина "Чистый код" (Clean code).
Попробуйте оценить свой код написанный для решения задачи
нахождения наиболее часто встречаемого в тексте слова.
Следует ли ваш код всем правилам, которые описыны в книге "Чистый код".
Критически оцените написанный вами код и если увидите те места,
которые следует улучшить то сделайте это! Выполните рефакторинг!

Task_7:
Попробовать применить на практике знания
полученные из второй главы ("Содержательные имена") книги Роберта Мартина "Чистый код" (Clean code).
Попробуйте оценить свой код написанный для решения задачи
нахождения наиболее часто встречаемого в тексте слова.
Следует ли ваш код всем правилам, которые описыны в книге "Чистый код".
Критически оцените написанный вами код и если увидите те места,
которые следует улучшить то сделайте это! Выполните рефакторинг!
 */

class WordService {

    public String findMostFrequentWord(String text) {
        String[] arrayFromText = splitText(text);
        return mostFrequentWord(arrayFromText);
    }

    public String[] splitText(String text) {
        return text.split(" ");
    }

    public String mostFrequentWord(String[] arrayFromText) {
        String maxWord = arrayFromText[0];
        int maxCount = 1;

        for (String currentWord : arrayFromText) {
            int currentCount = wordCount(arrayFromText, currentWord);
            if (maxCount < currentCount) {
                maxCount = currentCount;
                maxWord = currentWord;
            }
        }
        return maxWord;
    }

    public int wordCount(String[] text, String word) {
        int countWord = 0;
        for (String currentWord : text) {
            if (currentWord.equalsIgnoreCase(word)) {
                countWord++;
            }
        }
        return countWord;
    }
}
