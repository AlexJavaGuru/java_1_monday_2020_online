package student_dmitry_vasiliev.lesson_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.shouldChangeDotCommToEmpty();
        test.shouldArrayOfWord();
        test.shouldWordMaxEntry();
        test.shouldfindEntryMaxNumber();
    }

    public void shouldChangeDotCommToEmpty() {
        String testName = "shouldChangeDotCommToEmpty";
        WordService wordService = new WordService();
        String expectedString = wordService.changeDotCommToEmpty("+a,,..a.+");
        String actualString = "+aa+";
        printTestResult(expectedString.equals(actualString), testName);
    }

    public void shouldArrayOfWord() {
        String testName = "shouldArrayOfWord";
        WordService wordService = new WordService();
        String[] expectedWordArray = wordService.arrayOfWord("aa bb cc dd ee ff");
        String[] actualWordArray = {"aa","bb","cc","dd","ee","ff"};
        int counter = 0;
        for (int i=0; i<actualWordArray.length; i++) {
            if (actualWordArray[i].equals(expectedWordArray[i])) {
                    counter += 1;
            }
        }
        printTestResult(counter == 6, testName);
    }

    public void shouldWordMaxEntry() {
        String testName = "shouldWordMaxEntry";
        WordService wordService = new WordService();
        String[] wordArray = {"aa","bb","cc","cc","bb","cc"};
        int[] expectedWordArray = {0,1,2,1,0,0};
        int[] actualWordArray = wordService.wordMaxEntry(wordArray);
        int counter = 0;
        for (int i=0; i<actualWordArray.length; i++) {
            if (actualWordArray[i] == expectedWordArray[i]) {
                counter += 1;
            }
            //System.out.println(actualWordArray[i]);
        }
        printTestResult(counter == 6, testName);
    }

    public void shouldfindEntryMaxNumber() {
        String testName = "shouldWordMaxEntry";
        WordService wordService = new WordService();
        int[] actualWordArray = {3,0,1,1,2,0};
        int maxNumber = 0;
        int indexNumber = 0;
        for (int i=0; i<actualWordArray.length; i++) {
            if (actualWordArray[i] > maxNumber) {
                maxNumber = actualWordArray[i];
                indexNumber = i;
            }
        }
        printTestResult(indexNumber == 0, testName);
    }

    public void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}
