package student_artur_martinenko.homework.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersOneTest();
        calculatorTest.maxOfTwoNumbersTwoTest();
        calculatorTest.maxOfTwoNumbersEvenTest();
        calculatorTest.maxOfThreeNumbersOneTest();
        calculatorTest.maxOfThreeNumbersTwoTest();
        calculatorTest.maxOfThreeNumbersThreeTest();
        calculatorTest.maxOfThreeNumbersTwoTwoTest();
        calculatorTest.maxOfThreeNumbersAllEvenTest();

    }

    public void sumTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if(result == 15){
            System.out.println("Sum test = OK");
        }else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if(result == 5){
            System.out.println("Subtraction test = OK");
        }else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if(result == 50){
            System.out.println("Multiplication test = OK");
        }else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if(result == 2){
            System.out.println("Division test = OK");
        }else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest(){
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if(result){
            System.out.println("isEven test = OK");
        }else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersOneTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if(result == 10){
            System.out.println("maxOfTwoNumbersOne test = OK");
        }else {
            System.out.println("maxOfTwoNumbersOne test = FAIL");
        }
    }

    public void maxOfTwoNumbersTwoTest(){
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if(result == 10){
            System.out.println("maxOfTwoNumbersTwo test = OK");
        }else {
            System.out.println("maxOfTwoNumbersTwo test = FAIL");
        }
    }

    public void maxOfTwoNumbersEvenTest(){
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if(result == 0){
            System.out.println("maxOfTwoNumbersEven test = OK");
        }else {
            System.out.println("maxOfTwoNumbersEven test = FAIL");
        }
    }

    public void maxOfThreeNumbersOneTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(result == 10){
            System.out.println("maxOfThreeNumbersOne test = OK");
        }else {
            System.out.println("maxOfThreeNumbersOne test = FAIL");
        }
    }

    public void maxOfThreeNumbersTwoTest(){
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(result == 10){
            System.out.println("maxOfThreeNumbersTwo test = OK");
        }else {
            System.out.println("maxOfThreeNumbersTwo test = FAIL");
        }
    }

    public void maxOfThreeNumbersThreeTest(){
        int firstNumber = 5;
        int secondNumber = 8;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(result == 10){
            System.out.println("maxOfThreeNumbersThree test = OK");
        }else {
            System.out.println("maxOfThreeNumbersThree test = FAIL");
        }
    }

    public void maxOfThreeNumbersTwoTwoTest(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(result == 10){
            System.out.println("maxOfThreeNumbersTwoTwo test = OK");
        }else {
            System.out.println("maxOfThreeNumbersTwoTwo test = FAIL");
        }
    }

    public void maxOfThreeNumbersAllEvenTest(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(result == 0){
            System.out.println("maxOfThreeNumbersAllEven test = OK");
        }else {
            System.out.println("maxOfThreeNumbersAllEven test = FAIL");
        }
    }


}
