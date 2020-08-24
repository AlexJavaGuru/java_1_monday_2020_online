package student_lilija_g.homework.lesson_4.level_5;

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

