package student_aleksejs_ivanovs.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testOne();
        test.testTwo();
        test.testThree();
        test.testFour();
        test.testFive();
        test.testSix();
        test.testSeven();
    }

    public void testOne() {
        int waveLength = 449;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Violet")) {
            System.out.println("Color is Violet");
        } else {
            System.out.println("Violet failed");
        }
    }

    public void testTwo() {
        int waveLength = 460;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Blue")) {
            System.out.println("Color is Blue");
        } else {
            System.out.println("Blue failed");
        }
    }

    public void testThree() {
        int waveLength = 540;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Green")) {
            System.out.println("Color is Green");
        } else {
            System.out.println("Green failed");
        }
    }

    public void testFour() {
        int waveLength = 580;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Yellow")) {
            System.out.println("Color is Yellow");
        } else {
            System.out.println("Yellow failed");
        }
    }

    public void testFive() {
        int waveLength = 605;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Orange")) {
            System.out.println("Color is Orange");
        } else {
            System.out.println("Orange failed");
        }
    }

    public void testSix() {
        int waveLength = 710;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Red")) {
            System.out.println("Color is Red");
        } else {
            System.out.println("Red failed");
        }
    }

    public void testSeven() {
        int waveLength = 800;
        LightColorDetector light = new LightColorDetector();
        String wave = light.detect(waveLength);

        if (wave.equals("Invisible Light")) {
            System.out.println("Invisible Light");
        } else {
            System.out.println("Invisible Light failed");
        }
    }
}
