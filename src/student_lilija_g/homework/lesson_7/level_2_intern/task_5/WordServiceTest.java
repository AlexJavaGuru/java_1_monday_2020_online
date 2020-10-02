package student_lilija_g.homework.lesson_7.level_2_intern.task_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordService myWordService = new WordService();
        WordServiceTest myWordServiceTest = new WordServiceTest();

        String text = "“Every person had a star, every star had a friend, and for every person carrying a star there was someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart.”";
        text = myWordService.replacementOfUnnecessaryCharacters(text);

        String[] newText = myWordService.creatingArrayOfWords(text);

        myWordServiceTest.totalTest("a", myWordService.findMostFrequentWord(newText),"findMostFrequentWord - a");

        newText = myWordService.creatingArrayOfWords(myWordService.replacementOfUnnecessaryCharacters("Every person had a star, every star had a friend..."));
        myWordServiceTest.totalTest("Every",myWordService.findMostFrequentWord(newText),"findMostFrequentWord - Every");
    }

    void totalTest(String expectedValue, String actualValue, String testName) {

        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
