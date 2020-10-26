package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

//Упростите метод boolean isEven(int number).
        //Код внутри этого метода может быть записан в одну строку.
        //Перед изменением кода убедитесь, что у вас есть автоматические тесты для проверки этого кода.
        //Если автоматических тестов нет то напишите их, убедитесь, что они проходят и только тогда меняйте код.
@CodeReview(approved = false)
@CodeReviewComment(comment = "Что случилось с безным методом? Исправить формат")
class Task_1 {

    //class Calculator {

        public static int isEven(int number) {
                int result = number % 2 ;
                return result;
        }
}

