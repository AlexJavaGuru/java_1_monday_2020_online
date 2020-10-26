package student_dmitry_vasiliev.lesson_6.level_4;

import teacher.annotations.CodeReview;

import java.io.IOException;

@CodeReview(approved = true)
class EndlessCycleWhile {

    public static void main(String[] args) throws InterruptedException, IOException {

        while (true) {
            System.out.println("hit an Enter key!");
            Thread.sleep(2000);
            if (System.in.available() != 0) {
                System.out.println("I'm quitting! Bye!");
                break;
            }
        }
    }
}
