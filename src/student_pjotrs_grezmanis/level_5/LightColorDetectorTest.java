package student_pjotrs_grezmanis.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();


    }
    public void testViolet() {
        LightColorDetector lightestOne = new LightColorDetector();
        int waveLenght = 448;
        String wave = lightestOne.detect(waveLenght);
        if (wave.equals("Violet")) {
            System.out.println("Colors is Violet Test1 - OK");
        } else {
            System.out.println("Test1 - FAILED");
        }

    }
}