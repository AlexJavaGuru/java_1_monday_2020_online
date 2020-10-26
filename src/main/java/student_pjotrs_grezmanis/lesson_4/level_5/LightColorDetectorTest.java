package student_pjotrs_grezmanis.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Слишком много лишнего кода. Все проверки можно было вынести в отдельный метод и переиспользовать.")
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.test1();
        lightColorDetectorTest.test2();
        lightColorDetectorTest.test3();
        lightColorDetectorTest.test4();
        lightColorDetectorTest.test5();
        lightColorDetectorTest.test6();
    }

    public void test1() {
        int waveLength = 448;
        LightColorDetector violet = new LightColorDetector();
        String wave = violet.detect(waveLength);
        if (wave.equals("Violet")) {
            System.out.println("Color is Violet Test1 - OK");
        } else {
            System.out.println("Test1 - FAILED");
        }
    }

    public void test2() {
        int waveLength = 451;
        LightColorDetector blue = new LightColorDetector();
        String wave = blue.detect(waveLength);
        if (wave.equals("Blue")) {
            System.out.println("Color is Blue Test2 - OK");
        } else {
            System.out.println("Test2 - FAILED");
        }
    }

    public void test3() {
        int waveLength = 530;
        LightColorDetector green = new LightColorDetector();
        String wave = green.detect(waveLength);
        if (wave.equals("Green")) {
            System.out.println("Color is Green Test3 - OK");
        } else {
            System.out.println("Test3 - FAILED");
        }
    }

    public void test4() {
        int waveLength = 582;
        LightColorDetector yellow = new LightColorDetector();
        String wave = yellow.detect(waveLength);
        if (wave.equals("Yellow")) {
            System.out.println("Color is Yellow Test4 - OK");
        } else {
            System.out.println("Test4 - FAILED");
        }
    }

    public void test5() {
        int waveLength = 619;
        LightColorDetector orange = new LightColorDetector();
        String wave = orange.detect(waveLength);
        if (wave.equals("Orange")) {
            System.out.println("Color is Orange Test5 - OK");
        } else {
            System.out.println("Test5 - FAILED");
        }
    }

    public void test6() {
        int waveLength = 620;
        LightColorDetector red = new LightColorDetector();
        String wave = red.detect(waveLength);
        if (wave.equals("Red")) {
            System.out.println("Color is Red Test6 - OK");
        } else {
            System.out.println("Test6 - FAILED");
        }

    }
}


