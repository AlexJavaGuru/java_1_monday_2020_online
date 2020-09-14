package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Надо покрыть еще хотябы пару сценариев. Сделать общий check метод для проверки результатов тестов.")
class Task_1Demo {

    public static void main(String[] args) {

        Task_1 test = new Task_1();
        int number = 1;
        int result = test.isEven(number);
        if ( result==0 )  {
            System.out.println("Test has passed.");
             }
        else {System.out.println("Test failed.");
        System.out.println();
        }

    }
}
