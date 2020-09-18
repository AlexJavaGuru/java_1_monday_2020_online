package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

//endless for loop with a "break" in it
@CodeReview(approved = false)
@CodeReviewComment(comment = "Запустил ваш бесконечный цикл...а он закончился =)" +
        "Andris, Я путаюсь в ваших заданиях. У каждого таска есть номер, который можно использовать в названии класса к заданию. У вас идет Task_15, а потом" +
        "почему-то Task_15For, хотя это уже Task_16. Надо как-то нумерацию привести в порядок. Я оцениваю это задание как Task_15...там надо бесконечный цикл")
public class Task_16 {
    public static void main(String[] args) {

        for (int i = 0; i > -1; i++) {
            if (i<5000){
                System.out.println(i);
            }else{
                break;
            }
        }
    }
}
