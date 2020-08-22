package student_artur_martinenko.homework.lesson_4.level_x;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.testViolet();
        lightColorDetector.testBlue();
        lightColorDetector.testGreen();
        lightColorDetector.testYellow();
        lightColorDetector.testOrange();
        lightColorDetector.testRed();
        lightColorDetector.testInvisible();
    }

    public void colorTest(String expectedColor, LightColorDetector color){
        String result = color.detect();
        if(result.equalsIgnoreCase(expectedColor)) {
            System.out.println("LightColorDetector test - " + expectedColor + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expectedColor + " = FAIL");
        }
    }

    public void testViolet() {
        LightColorDetector color = new LightColorDetector(405);
        colorTest("Violet", color);
    }

    public void testBlue() {
        LightColorDetector color = new LightColorDetector(475);
        colorTest("Blue", color);
    }

    public void testGreen() {
        LightColorDetector color = new LightColorDetector(505);
        colorTest("Green", color);
    }

    public void testYellow() {
        LightColorDetector color = new LightColorDetector(585);
        colorTest("Yellow", color);
    }

    public void testOrange() {
        LightColorDetector color = new LightColorDetector(619);
        colorTest("Orange", color);
    }

    public void testRed() {
        LightColorDetector color = new LightColorDetector(620);
        colorTest("Red", color);
    }

    public void testInvisible() {
        LightColorDetector color = new LightColorDetector(760);
        colorTest("Invisible Light", color);
    }

}
