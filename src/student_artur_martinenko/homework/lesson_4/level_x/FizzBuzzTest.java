package student_artur_martinenko.homework.lesson_4.level_x;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.otherNumberTest();

    }

    public void fizzTest(){
        FizzBuzz temp = new FizzBuzz();
        String output = temp.detect(6);
        if(output.equalsIgnoreCase("Fizz")){
            System.out.println("Fizz (3) Test - OK");
        }else{
            System.out.println("Fizz (3) Test - FAIL");
        }
    }

    public void buzzTest(){
        FizzBuzz temp = new FizzBuzz();
        String output = temp.detect(10);
        if(output.equalsIgnoreCase("Buzz")){
            System.out.println("Buzz (5) Test - OK");
        }else{
            System.out.println("Buzz (5) Test - FAIL");
        }
    }

    public void fizzBuzzTest(){
        FizzBuzz temp = new FizzBuzz();
        String output = temp.detect(15);
        if(output.equalsIgnoreCase("FizzBuzz")){
            System.out.println("FizzBuzz (15) Test - OK");
        }else{
            System.out.println("FizzBuzz (15) Test - FAIL");
        }
    }

    public void otherNumberTest(){
        FizzBuzz temp = new FizzBuzz();
        String output = temp.detect(28);
        if(output.equalsIgnoreCase("28")){
            System.out.println("Other Number Test - OK");
        }else{
            System.out.println("Other Number Test - FAIL");
        }
    }





}
