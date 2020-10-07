package student_dmitry_vasiliev.lesson_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.shouldRemovePunctMarks();
        test.shouldArrayOfWord();
        test.shouldWordEntry();
    }

    public void shouldRemovePunctMarks() {
        String testName = "shouldChangeDotCommToEmpty";
        WordService wordService = new WordService();
        String expectedString = wordService.removePunctMarks("+a,,..a.+");
        String actualString = "+aa+";
        printTestResult(expectedString.equals(actualString), testName);
    }

    public void shouldArrayOfWord() {
        String testName = "shouldArrayOfWord";
        WordService wordService = new WordService();
        String[] expectedWordArray = wordService.arrayOfWord("aa bb cc dd ee ff");
        String[] actualWordArray = {"aa", "bb", "cc", "dd", "ee", "ff"};
        int counter = 0;
        for (int i = 0; i < actualWordArray.length; i++) {
            if (actualWordArray[i].equals(expectedWordArray[i])) {
                counter += 1;
            }
        }
        printTestResult(counter == 6, testName);
    }

    public void shouldWordEntry() {
        String testName = "shouldWordEntry";
        WordService wordService = new WordService();
        String[] wordArray = {"aa", "bb", "cc", "cc", "bb", "cc"};
        String maxWord = "cc";
        int indexNumber = 0;
        indexNumber = wordService.wordEntry(wordArray, maxWord);
        printTestResult(indexNumber == 3, testName);
    }

    public void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}
