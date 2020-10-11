package student_pjotrs_grezmanis.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testPalindrome();
    }

    public void testPalindrome() {
        Palindrome test = new Palindrome();
        check(true, test.isPalindrome(" sum summus mus "), "testPalindromeSuccess()");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

}
