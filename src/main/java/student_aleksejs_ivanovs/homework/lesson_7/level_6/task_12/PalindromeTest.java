package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest();
        test.isPalindromeTestTwo();
    }

    public void isPalindromeTest() {
        Palindrome text = new Palindrome();
        boolean answer = text.isPalindrome("L ,e v!e .l");

        if (answer) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void isPalindromeTestTwo() {
        Palindrome text = new Palindrome();
        boolean answer = text.isPalindrome("S/u'm, s;u:M@m#u$s. M%u^s&!*");

        if (answer) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

}
