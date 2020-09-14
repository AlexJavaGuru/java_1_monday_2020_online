package student_andris_tresutins.homework.lesson_6.level_4;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вам надо было добавить метод сортировки в класс ArrayUtil." +
        "Метод так же должен быть способен сортировать входящий массив, а не создавать новый. Иначе, этот метод бесполезный как утилита. Он может работать только" +
        "с одним массивом. Зачем нам такой ограниченный метод?" +
        "У вас кстати класс почему-то UtilArray...Я это понимаю как - Массив Утелит :D")
public class Task_14 {

    public String sortArray() {

        int[] Array = {12, 13, 54, 14, 458};
        Arrays.sort(Array);
        return Arrays.toString(Array);

    }

}
