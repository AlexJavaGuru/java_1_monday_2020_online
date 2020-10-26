package student_regina_svistunov.lesson_8.level_2.Task_6;

//Исправьте код программы:
//class Mother {
//}
//
//class Father {
//}
//
//class Child extends Mother, Father {
//}
//PS: вносить изменения можно только в объявление класса Child.
//        Правильных решений у этой задачи два, выбирайте любое.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Child extends Mother {
}

// В Java только один класс родитель,
// так что после extends может быть либо Mother либо  Father :)

