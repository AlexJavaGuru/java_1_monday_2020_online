package student_alexander_shl.homework.lesson_7.level_6_middle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void init() {
        palindrome = new Palindrome();
    }

    @Test
    public void checkPalindrome() {
        Assert.assertTrue(palindrome.isPalindrome("Le,VEl"));
        Assert.assertTrue(palindrome.isPalindrome("L/ev,eL"));
        Assert.assertTrue(palindrome.isPalindrome("sum madam mus"));
        Assert.assertFalse(palindrome.isPalindrome("Good morning!"));
    }
}