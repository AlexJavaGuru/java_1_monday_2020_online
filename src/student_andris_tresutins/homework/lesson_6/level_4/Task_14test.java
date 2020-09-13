package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Когда вы приведете в порядок метод сортировки, то вы сможете переделать тесты правильно. Как думаете, что надо чтобы проверить, " +
        "упорядочен ли массив? Надо идти по всему массиву исходя из предположения, что каждое текужее число меньше следующего. Если не поймете - пишите в телеграмм.")
public class Task_14test {

    public static void main(String[] args) {
        Task_14test test = new Task_14test();
        test.sortArrayTest();
    }

    public void sortArrayTest(){
        Task_14 victim = new Task_14();

        boolean actualresult = victim.sortArray().equals("[12, 13, 14, 54, 458]");
        boolean expectedresult = true;

        check(expectedresult, actualresult, "Reverse Array test");


    }
    public void check(boolean expectedRes, boolean result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}
