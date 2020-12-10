package student_alexander_shl.homework.lesson_4.level_5.task_16;

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.testColorDetector();
    }

    void testColorDetector() {
        checkTest("Invisible Light", lightColorDetector.detect(120), "Invisible Light");
        checkTest("Violet", lightColorDetector.detect(430), "Violet");
        checkTest("Blue", lightColorDetector.detect(475), "Blue");
        checkTest("Green", lightColorDetector.detect(550), "Green");
        checkTest("Yellow", lightColorDetector.detect(580), "Yellow");
        checkTest("Orange", lightColorDetector.detect(600), "Orange");
        checkTest("Red", lightColorDetector.detect(710), "Red");
        checkTest("Invisible Light", lightColorDetector.detect(800), "Invisible Light");
    }

    void checkTest(String expectedValue, String realValue, String testName) {
        if (expectedValue.equals(realValue)) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("expectedValue = " + expectedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
