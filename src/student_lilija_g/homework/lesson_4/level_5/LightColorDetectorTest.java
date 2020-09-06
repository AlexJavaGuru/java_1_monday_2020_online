package student_lilija_g.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Отлично. Спасибо, что переделали =)")
class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest myLightColorDetectorTest = new LightColorDetectorTest();

        myLightColorDetectorTest.testWare();
    }

    void totalTest(String expectedValue, String actualValue, String testName) {
        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    void testWare() {
        totalTest("Invisible Light", lightColorDetector.detect(300), "Invisible Light");
        totalTest("Violet", lightColorDetector.detect(380), "Violet");
        totalTest("Blue", lightColorDetector.detect(490), "Blue");
        totalTest("Green", lightColorDetector.detect(500), "Green");
        totalTest("Yellow", lightColorDetector.detect(589), "Yellow");
        totalTest("Red", lightColorDetector.detect(750), "Red");
        totalTest("Invisible Light", lightColorDetector.detect(752), "Invisible Light");
    }

}

