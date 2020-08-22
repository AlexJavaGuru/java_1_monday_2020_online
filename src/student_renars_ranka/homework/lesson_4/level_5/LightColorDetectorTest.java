package student_renars_ranka.homework.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest colorDetectorTest = new LightColorDetectorTest();
        colorDetectorTest.violetTest( 380);
        colorDetectorTest.violetTest( 449);
        colorDetectorTest.blueTest( 450);
        colorDetectorTest.blueTest( 494);
        colorDetectorTest.greenTest( 495);
        colorDetectorTest.greenTest( 569);
        colorDetectorTest.yellowTest( 570);
        colorDetectorTest.yellowTest( 589);
        colorDetectorTest.orangeTest( 590);
        colorDetectorTest.orangeTest( 619);
        colorDetectorTest.redTest( 620);
        colorDetectorTest.redTest( 750);
        colorDetectorTest.invisibleTest( 379);
        colorDetectorTest.invisibleTest( 751);
    }

    public void violetTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Violet")) {
            System.out.println("Test Violet - past!");
        }else {
                System.out.println("Test Violet - fail!");
            }
        }
    public void blueTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Blue")) {
            System.out.println("Test Blue - past!");
        }else {
            System.out.println("Test Blue - fail!");
        }
    }
    public void greenTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Green")) {
            System.out.println("Test Green - past!");
        }else {
            System.out.println("Test Green - fail!");
        }
    }
    public void yellowTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Yellow")) {
            System.out.println("Test Yellow - past!");
        }else {
            System.out.println("Test Yellow - fail!");
        }
    }
    public void orangeTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Orange")) {
            System.out.println("Test Orange - past!");
        }else {
            System.out.println("Test Orange - fail!");
        }
    }
    public void redTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Red")) {
            System.out.println("Test Red - past!");
        }else {
            System.out.println("Test Red - fail!");
        }
    }
    public void invisibleTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Invisible Light")) {
            System.out.println("Test Invisible Light - past!");
        }else {
            System.out.println("Test Invisible Light - fail!");
        }
    }

}

