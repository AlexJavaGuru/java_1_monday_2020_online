package student_artur_martinenko.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
//Такая же проблема - много лишнего кода. Метод check вам должен помоч
//->Полностью согласен, слелал задание не CleanCode, но в супер таске переделал уже все красиво.
class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightTest = new LightColorDetectorTest();
        lightTest.violetTest(380);
        lightTest.violetTest(449);
        lightTest.blueTest(450);
        lightTest.blueTest(494);
        lightTest.greenTest(495);
        lightTest.greenTest(569);
        lightTest.yellowTest(570);
        lightTest.yellowTest(589);
        lightTest.orangeTest(590);
        lightTest.orangeTest(619);
        lightTest.redTest(620);
        lightTest.redTest(750);
        lightTest.invisibleTest(379);
        lightTest.invisibleTest(751);

    }

    public void violetTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Violet")){
            System.out.println("Test Violet - OK");
        }else{
            System.out.println("Test Violet - FAIL");
        }
    }

    public void blueTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Blue")){
            System.out.println("Test Blue - OK");
        }else{
            System.out.println("Test Blue - FAIL");
        }
    }

    public void greenTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Green")){
            System.out.println("Test Green - OK");
        }else{
            System.out.println("Test Green - FAIL");
        }
    }

    public void yellowTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Yellow")){
            System.out.println("Test Yellow - OK");
        }else{
            System.out.println("Test Yellow - FAIL");
        }
    }

    public void orangeTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Orange")){
            System.out.println("Test Orange - OK");
        }else{
            System.out.println("Test Orange - FAIL");
        }
    }

    public void redTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Red")){
            System.out.println("Test Red - OK");
        }else{
            System.out.println("Test Red - FAIL");
        }
    }

    public void invisibleTest(int wavelength){
        LightColorDetector temp = new LightColorDetector();
        String output = temp.detect(wavelength);
        if (output.equals("Invisible Light")){
            System.out.println("Test Invisible Light - OK");
        }else{
            System.out.println("Test Invisible Light - FAIL");
        }
    }


}
