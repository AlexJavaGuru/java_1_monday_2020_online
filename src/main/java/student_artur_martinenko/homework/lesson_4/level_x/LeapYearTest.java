package student_artur_martinenko.homework.lesson_4.level_x;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTest1();
        leapYearTest.leapYearTest2();
        leapYearTest.regularYearTest1();
        leapYearTest.regularYearTest2();

    }

    public void leapYearTest1(){
        LeapYear temp = new LeapYear();
        boolean output = temp.isLeapYear(1600);
        if (output){
            System.out.println("Leap Year 1600 Test - OK");
        }else {
            System.out.println("Leap Year 1600 Test - FAIL");
        }

    }

    public void leapYearTest2(){
        LeapYear temp = new LeapYear();
        boolean output = temp.isLeapYear(2152);
        if (output){
            System.out.println("Leap Year 2152 Test - OK");
        }else {
            System.out.println("Leap Year 2152 Test - FAIL");
        }

    }

    public void regularYearTest1(){
        LeapYear temp = new LeapYear();
        boolean output = temp.isLeapYear(2019);
        if (!output){
            System.out.println("Regular Year 2019 Test - OK");
        }else {
            System.out.println("Regular Year 2019 Test - FAIL");
        }

    }

    public void regularYearTest2(){
        LeapYear temp = new LeapYear();
        boolean output = temp.isLeapYear(2149);
        if (!output){
            System.out.println("Regular Year 2149 Test - OK");
        }else {
            System.out.println("Regular Year 2149 Test - FAIL");
        }

    }

}
