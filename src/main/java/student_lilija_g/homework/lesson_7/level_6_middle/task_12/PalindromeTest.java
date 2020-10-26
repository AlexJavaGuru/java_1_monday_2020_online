package student_lilija_g.homework.lesson_7.level_6_middle.task_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PalindromeTest {
    public static void main(String[] args) {

        Palindrome myPalindrome = new Palindrome();
        PalindromeTest myPalindromeTest = new PalindromeTest();
        myPalindromeTest.totalBooleanTest(true,myPalindrome.isPalindrome("LeVel"),"LeVel");
        myPalindromeTest.totalBooleanTest(true,myPalindrome.isPalindrome("L e V, el "),"L e V, el ");
        myPalindromeTest.totalBooleanTest(true,myPalindrome.isPalindrome("А роза упала на лапу Азора"),"А роза упала на лапу Азора");
        myPalindromeTest.totalBooleanTest(false,myPalindrome.isPalindrome("Palindrome"),"Palindrome");
    }

    void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
