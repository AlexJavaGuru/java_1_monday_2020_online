package student_lilija_g.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Этот тест не тестирует ничего. Пишите нормальный тест. Где вы передаете длинну волны, возвращается String с цветом и вы их сравниваете." +
        "Вывод на консоль - ничего не тестирует!")
class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest myLightColorDetectorTest = new LightColorDetectorTest();
        myLightColorDetectorTest.testWare();
    }

        void testWare() {

            LightColorDetector myLightColorDetector = new LightColorDetector();

            for (int myWavelength = 300; myWavelength < 800; myWavelength += 30) {
                String result = myLightColorDetector.detect(myWavelength);
                System.out.printf("\n Wave length: " + myWavelength + " - " + result);
            }

        }
    }

