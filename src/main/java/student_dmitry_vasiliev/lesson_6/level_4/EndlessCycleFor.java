package student_dmitry_vasiliev.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.io.IOException;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Exceptions - отдельная тема, которая нас ждет")
class EndlessCycleFor {

    public static void main(String[] args) throws InterruptedException, IOException {
//За таким коротким заданием скрывается серьезная тема исключений.
//С ходу разобраться не удалось. Надеюсь будет лекционная тема.
        for(int i = 0; i == 0;) {
            System.out.println("hit an Enter key!");
            Thread.sleep(2000);
            if (System.in.available() != 0) {
                System.out.println("I'm quitting! Bye!");
                break;
            }
        }
    }
}
