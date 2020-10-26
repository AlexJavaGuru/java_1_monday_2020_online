package student_aleksejs_ivanovs.homework.lesson_7.level_1;

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
        int[] additionalArray = {-1, 0};

        for (int i = 0; i < array.length; i++) {
            if (!array[additionalArray[1]].equals(array[i]) || additionalArray[0] < 0) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                if (additionalArray[0] < count) {
                    additionalArray[0] = count;
                    additionalArray[1] = i;
                }
            }
        }
        return array[additionalArray[1]];
    }

}
