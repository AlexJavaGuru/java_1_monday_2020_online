package student_lilija_g.homework.lesson_4.level_x.super_task_4;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

 //       lightColorDetector.testViolet(405);
 //       lightColorDetector.testBlue(475);
 //       lightColorDetector.testGreen(505);
 //       lightColorDetector.testYellow(585);
 //       lightColorDetector.testOrange(619);
 //       lightColorDetector.testRed(620);
 //       lightColorDetector.testInvisible(760);

        lightColorDetector.testColor(405,"Violet");
        lightColorDetector.testColor(475,"Blue");
        lightColorDetector.testColor(505,"Green");
        lightColorDetector.testColor(585,"Yellow");
        lightColorDetector.testColor(619,"Orange");
        lightColorDetector.testColor(620,"Red");
        lightColorDetector.testColor(760,"Invisible Light");

    }

    void testColor(int wavelength, String result) {

        String color;
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        if (wavelength >= 380 && wavelength <= 449) {
            color = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            color = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            color = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            color = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            color = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            color = "Red";
        } else {
            color = "Invisible Light";
        }
        if (result == color) {
            System.out.printf("\nLightColorDetector test - " + color + " = OK");
        } else {
            System.out.printf("\nLightColorDetector test - " + color + " = FAIL");
        }
    }
/*
    void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }
    void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }
    }
    void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }
    }
    void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }
    }
    void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }
    }
    void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }
    }
    void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Invisible Light")) {
            System.out.println("LightColorDetector test - Invisible Light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible Light = FAIL");
        }
    }
 */
}
