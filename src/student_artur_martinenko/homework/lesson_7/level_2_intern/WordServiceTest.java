package student_artur_martinenko.homework.lesson_7.level_2_intern;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest victim = new WordServiceTest();
        victim.wordRepeatsInArrayTest();
        victim.findMostFrequentWordTest();
    }

    public void check(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void check(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void wordRepeatsInArrayTest() {
        WordService temp = new WordService();
        String[] test = {"lamp", "scooter", "table", "lamp", "chair", "car", "table", "scooter", "scooter",
                "table", "air", "table", "scooter"};
        int qty = temp.wordRepeatsInArray(test, "scooter");
        check(4,qty, "wordRepeatsInArrayTest");
    }

    public void findMostFrequentWordTest() {
        WordService temp = new WordService();
        String test = "lamp scooter table lamp chair car table scooter scooter table air scooter ";
        String frequentWord = temp.findMostFrequentWord(test);
        check("scooter", frequentWord, "findMostFrequentWordTest");
    }

}
