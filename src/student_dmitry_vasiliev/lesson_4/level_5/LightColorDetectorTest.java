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
            int waveSize = 750;
            LightColorDetector detector = new LightColorDetector();
            String lightWaveSize = LightColorDetector.wave(waveSize);
            if ("Violet" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Violet.");
            else if ("Blue" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Blue.");
            else if ("Green" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Green.");
            else if ("Yellow" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Yellow.");
            else if ("Orange" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Orange.");
            else if ("Red" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is Red.");
            else if ("Invisible light" == LightColorDetector.wave(waveSize))
                System.out.println("Test OK. Light is invisible.");
            else
                System.out.println("Test not OK.");
        }
    }

