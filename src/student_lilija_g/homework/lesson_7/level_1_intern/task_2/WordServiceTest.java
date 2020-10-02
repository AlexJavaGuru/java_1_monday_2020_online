package student_lilija_g.homework.lesson_7.level_1_intern.task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {

    public static void main(String[] args) {

        WordService myWordService = new WordService();
        WordServiceTest myWordServiceTest = new WordServiceTest();

        String text = "“Every person had a star, every star had a friend, and for every person carrying a star there was someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart.”";

        text = myWordService.replacementOfUnnecessaryCharacters(text);
        myWordService.printWord(text);

        String textOne = "Every person had a star every star had a friend and for every person carrying a star there was someone else who reflected it and everyone carried this reflection like a secret confidante in the heart";
        myWordServiceTest.totalTest(textOne, text, "ReplacementOfUnnecessaryCharacters");

        String[] newText = myWordService.creatingArrayOfWords(text);

        String maxWord = myWordService.findMostFrequentWord(newText);

        myWordService.printWordArray(newText);
        myWordService.printWord(maxWord);

        myWordServiceTest.totalTest("a", maxWord, "FindMostFrequentWord");
        int maxCount = myWordService.findWordCount(newText, "a");
        myWordService.printCount(maxCount);

        myWordServiceTest.totalIntTest(4, myWordService.findWordCount(newText, "a"), "findWordCount - word a");
        myWordServiceTest.totalIntTest(3, myWordService.findWordCount(newText, "star"), "findWordCount - word star");

    }

    void totalTest(String expectedValue, String actualValue, String testName) {

        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    void totalIntTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
