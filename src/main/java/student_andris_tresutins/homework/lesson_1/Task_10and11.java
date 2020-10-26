package student_andris_tresutins.homework.lesson_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Лучше бы вы исправили инициализацию переменных с новой строки ) А не модификатор доступа меняли")
class Task_10and11 {
    public static void main(String[] args) {

        int sum, div;
        sum= 74+36;
        div= 50/3;
        System.out.println(" Hello \n Andris Tresutins \n sum: "+sum+"\n div: "+div);
    }
}
