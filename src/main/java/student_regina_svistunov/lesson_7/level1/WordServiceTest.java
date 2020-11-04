package student_regina_svistunov.lesson_7.level1;

public class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println( testName + " test is PASSED");
        } else {
            System.out.println( testName + " test is FAILED");
        }
    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String test = "tomato apple cucumber pear apple banana apple tomato apple cucumber banana ";
        String frequentWord = wordService.findMostFrequentWord(test);
        check("apple", frequentWord, "findMostFrequentWordTest");
    }



}
