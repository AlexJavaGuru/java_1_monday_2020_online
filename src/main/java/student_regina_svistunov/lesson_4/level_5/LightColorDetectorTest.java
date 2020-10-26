package student_regina_svistunov.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Objects;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не удаляйте мои комментарии! Спасибо =)")
class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.invisibleTest();


    }

    private void violetTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(401);

        if (Objects.equals(waveColour, "Violet")) {
            System.out.println("Violet color test is PASSED!");
        } else {
            System.out.println("Violet color test is FAILED!");
        }
    }
    private void blueTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(477);

        if (Objects.equals(waveColour, "Blue")) {
            System.out.println("Blue color test is PASSED!");
        } else {
            System.out.println("Blue color test is FAILED!");
        }
    }
    private void greenTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(555);

        if (Objects.equals(waveColour, "Green")) {
            System.out.println("Green color test is PASSED!");
        } else {
            System.out.println("Green color test is FAILED!");
        }
    }
    private void yellowTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(570);

        if (Objects.equals(waveColour, "Yellow")) {
            System.out.println("Yellow color test is PASSED!");
        } else {
            System.out.println("Yellow color test is FAILED!");
        }
    }
    private void orangeTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(592);

        if (Objects.equals(waveColour, "Orange")) {
            System.out.println("Orange color test is PASSED!");
        } else {
            System.out.println("Orange color test is FAILED!");
        }
    }
    private void redTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(699);

        if (Objects.equals(waveColour, "Red")) {
            System.out.println("Red color test is PASSED!");
        } else {
            System.out.println("Red color test is FAILED!");
        }
    }
    private void invisibleTest() {

        LightColorDetector colorDetector = new LightColorDetector();
        String waveColour = colorDetector.detect(798);

        if (Objects.equals(waveColour, "Invisible")) {
            System.out.println("Invisible color test is PASSED!");
        } else {
            System.out.println("Invisible color test is FAILED!");
        }
    }



}