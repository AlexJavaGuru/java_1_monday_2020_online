package student_aleksejs_ivanovs.homework.lesson_7.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.findMostFrequentWordTestTwo();
    }

    public void findMostFrequentWordTest() {
        WordService text = new WordService();
        String answer = text.findMostFrequentWord("aaa bbb aaa bbb aaa ccc ddd");

        if (answer.equals("aaa")) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void findMostFrequentWordTestTwo() {
        WordService text = new WordService();
        String answer = text.findMostFrequentWord("bbb aaa bbb aaa ccc ddd");

        if (answer.equals("bbb")) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }
}
