package student_dmitry_vasiliev.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не похоже на тесты, которые я вас учил писать ). Лучше сделайте хотябы 3 теста но правильных.")
class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();

        test.colorTest();
    }

    public void colorTest() {
        //int waveSize = 750;
        LightColorDetector detector = new LightColorDetector();
        //String lightWaveSize = LightColorDetector.wave(waveSize);

        generalCh ("Red", detector.wave(750), "-Red-");
        generalCh ("Invisible light", detector.wave(379), "-Invisible light_down-");
        generalCh ("Invisible light", detector.wave(751), "-Invisible light_up-");

    }

    public void  generalCh (String actualValue, String expectedValue, String testName) {
        if (actualValue == expectedValue) {
            System.out.println("Test " + testName + " has passed.");
        } else {
            System.out.println("Test " + testName + " failed.");
        }
    }
}

