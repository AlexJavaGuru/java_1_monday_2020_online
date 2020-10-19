package student_artur_martinenko.homework.lesson_11.level_4_junior.task_27;

import java.util.Set;

class UniqueWordFinderDemo {
    public static void main(String[] args) {
        UniqueWordFinderDemo victim = new UniqueWordFinderDemo();
        victim.findUniqueWordsTest();
    }

    public void check(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void findUniqueWordsTest(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "I'm going home home from work eating home a sandwich. " +
                "It is raining is, umbrella is needed, needed.";
        Set<String> uniqueWordSet = uniqueWordFinder.find(text);
        check(13, uniqueWordSet.size(), "findUniqueWordsTest");
    }

}
