package student_lilija_g.homework.lesson_4.level_x.super_task_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему вы создали еще метод с логикой класса, который надо протестировать? Почему в тестах к классу LightColorDetector, вы ни разу его не вызвали?.")
class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testWare();

    }

    void testWare() {
        totalTest("Invisible Light", lightColorDetector.detect(300), "Invisible Light");
        totalTest("Violet", lightColorDetector.detect(405), "Violet");
        totalTest("Blue", lightColorDetector.detect(475), "Blue");
        totalTest("Green", lightColorDetector.detect(505), "Green");
        totalTest("Yellow", lightColorDetector.detect(585), "Yellow");
        totalTest("Orange", lightColorDetector.detect(619), "Orange");
        totalTest("Red", lightColorDetector.detect(620), "Red");
        totalTest("Invisible Light", lightColorDetector.detect(760), "Invisible Light");
    }

    void totalTest(String expectedValue, String actualValue, String testName) {
        if (expectedValue.equals(actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
