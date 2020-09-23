package student_andris_tresutins.homework.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violet();
        test.blue();
        test.green();
        test.yellow();
        test.orange();
        test.orange();
        test.invisibleLightOne();
        test.invisibleLightTwo();

    }

    public void violet(){
        LightColorDetector victim = new LightColorDetector();

       boolean result = victim.detect(400).equals("Violet");
       boolean expectedResult = true;

       check(result,expectedResult, "Violet test");
    }

    public void blue(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(469).equals("Blue");
        boolean expectedResult = true;

        check(result,expectedResult, "Blue test");
    }

    public void green(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(512).equals("Green");
        boolean expectedResult = true;

        check(result,expectedResult, "Green test");
    }

    public void yellow(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(575).equals("Yellow");
        boolean expectedResult = true;

        check(result,expectedResult, "Yellow test");
    }

    public void orange(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(600).equals("Orange");
        boolean expectedResult = true;

        check(result,expectedResult, "Orange test");
    }

    public void red(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(750).equals("Red");
        boolean expectedResult = true;

        check(result,expectedResult, "Red test");
    }

    public void invisibleLightOne(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(923).equals("Invisible Light");
        boolean expectedResult = true;

        check(result,expectedResult, "Invisible Light test One");
    }

    public void invisibleLightTwo(){
        LightColorDetector victim = new LightColorDetector();

        boolean result = victim.detect(12).equals("Invisible Light");
        boolean expectedResult = true;

        check(result,expectedResult, "Invisible Light test Two");
    }

    public void check(boolean actualResult,boolean expectedResult,String testName ){
        if(actualResult == expectedResult){
            System.out.println(testName + " Has passed");
        }
        else{
            System.out.println(testName + " Has failed" + " The expected result was: " + expectedResult + " But the actual result is: " + actualResult);
        }
    }
}
