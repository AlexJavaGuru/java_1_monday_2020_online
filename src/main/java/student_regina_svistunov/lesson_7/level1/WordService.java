package student_regina_svistunov.lesson_7.level1;

//Дана строка с текстом.
//        Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.
//class WordService {
//    public String findMostFrequentWord(String text) {
//        // write solution here
//    }
//}
//    Если несколько слов в тексте встречаются одинаково максимальное число раз,
//    то возвращаем то слово, которое стоит в тексте первым.
//
//        Подумайте на какие подзадачи можно разбить эту задачу?
//        Распишите на бумаге каждую подзадачу в отдельности:
//        - как она называется,
//        - что её надо передать на вход (параметры),
//        - что будет возвращать в качестве результата.
//
//        PS: если вы не можете придумать как разбить эту задачу на подзадачи,
//        пожалуйста попросите помощи! Умение попросить помощи, когда это нужно
//        навес золота в ИТ.
//
//        Убедитесь, что вы сможете из решений всех подзадач
//        собрать решение главной задачи.

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Какой код некрасивый. Надо зарефакторить ) Разбить на пару методов, чтобы все все красиво и понятно )")
class WordService {

    public String findMostFrequentWord(String text) {
        String[] split = text.split(" ");
        Arrays.sort(split);
        System.out.println(Arrays.toString(split));
        int max = 0;
        int count = 1;
        String word = split[0];
        String curr = split[0];
        for (int i = 1; i<split.length; i++) {
            if (split[i].equals(curr)) {
                count++;
            } else {
                count =1;
                curr = split[i];
            } if (max < count) {
                max = count;
                word = split[i];
            }
        }
        return word;
    }
}



























