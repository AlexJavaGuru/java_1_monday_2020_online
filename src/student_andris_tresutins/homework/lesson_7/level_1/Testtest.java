package student_andris_tresutins.homework.lesson_7.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Testtest? really? =D Create one more test, when you have two different words with same count ")
 class Testtest {
    public static void main(String[] args) {
        Testtest test = new Testtest();

        test.wordSearch();

    }

    public void wordSearch() {

        Task_1 victim = new Task_1();

        boolean actualresult = victim.findMostFrequentWord("What is the deal with doing deals i mean everyone can do a deal").equals("word: " + "deal" + " occurs: " + 2 + " times") ;
        boolean expectedRes = true ;

        check(expectedRes, actualresult, "Find the highest occurance of a word");
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
