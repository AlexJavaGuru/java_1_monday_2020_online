package student_elizabete_ket.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();

    }

    public void violetTest() {
        int waveLength = 402;
        String expectedColourOfTheWave = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Violet Test is OK!");
        } else {
            System.out.println("Violet Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void blueTest() {
        int waveLength = 451;
        String expectedColourOfTheWave = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Blue Test is OK!");
        } else {
            System.out.println("Blue Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void greenTest() {
        int waveLength = 500;
        String expectedColourOfTheWave = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Green Test is OK!");
        } else {
            System.out.println("Green Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void yellowTest() {
        int waveLength = 575;
        String expectedColourOfTheWave = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Yellow Test is OK!");
        } else {
            System.out.println("Yellow Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void orangeTest() {
        int waveLength = 615;
        String expectedColourOfTheWave = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Orange Test is OK!");
        } else {
            System.out.println("Orange Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void redTest() {
        int waveLength = 621;
        String expectedColourOfTheWave = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Red Test is OK!");
        } else {
            System.out.println("Red Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }

    public void invisibleTest() {
        int waveLength = 5;
        String expectedColourOfTheWave = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColour = lightColorDetector.detect(waveLength);

        if (waveColour == expectedColourOfTheWave) {
            System.out.println("Invisible Test is OK!");
        } else {
            System.out.println("Invisible Test is FAILED!");
            System.out.println("Expected wave colour is " + expectedColourOfTheWave);
            System.out.println("Actual wave colour is " + waveColour);
        }
    }
}
