package student_lilija_g.homework.lesson_4.level_x.super_task_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не тесты. Это просто вывод на консоль")
class CalculatorTest {

        public static void main(String[] args) {
            CalculatorTest calculatorTest = new CalculatorTest();

//            calculatorTest.sumTest();
//            calculatorTest.subTest();
//            calculatorTest.mulTest();
//            calculatorTest.divTest();
//            calculatorTest.isEvenTest1();
//            calculatorTest.isEvenTest2();

            calculatorTest.testOperation(35, 40, 75, "Sum");
            calculatorTest.testOperation(35, 15, 20, "Sub");
            calculatorTest.testOperation(5, 5, 25, "Mul");
            calculatorTest.testOperation(40, 8, 5, "Div");
            calculatorTest.isEventTest(40,true);
            calculatorTest.isEventTest(41,false);
        }

     void testOperation(int firstNumber,int secondNumber,int result, String function) {

         Calculator calculator = new Calculator();

         boolean totalResult = false;

         switch (function) {
             case "Sum": {
                 if (result == calculator.sum(firstNumber, secondNumber)) {
                     totalResult = true;
                     break;
                 }
             }
             case "Sub": {
                 if (result == calculator.sub(firstNumber, secondNumber)) {
                     totalResult = true;
                     break;
                 }
             }
             case "Mul": {
                 if (result == calculator.mul(firstNumber, secondNumber)) {
                     totalResult = true;
                     break;
                 }
             }
             case "Div": {
                 if (result == calculator.div(firstNumber, secondNumber)) {
                     totalResult = true;
                     break;

                 }
             }


         }
         System.out.println(function + " function from " + firstNumber + " and " + secondNumber
                 + " with result " + result + ";  test = " + totalResult);
     }

     void isEventTest(int number, boolean result) {

         boolean totalResult = false;

         Calculator calculator = new Calculator();
            if (result == calculator.isEven(number)) {
                totalResult = true;
            }
         System.out.println("isEvent function " + number + " with result " + result + ";  test = " + totalResult);
     }

//
//        public void sumTest() {
//            int firstNumber = 35;
//            int secondNumber = 40;
//            Calculator calculator = new Calculator();
//            int result = calculator.sum(firstNumber, secondNumber);
//            if (result == 75) {
//                System.out.println("Sum test = OK");
//            } else {
//                System.out.println("Sum test = FAIL");
//            }
//        }
//
//        public void subTest() {
//            int firstNumber = 35;
//            int secondNumber = 15;
//            Calculator calculator = new Calculator();
//            int result = calculator.sub(firstNumber, secondNumber);
//            if (result == 20) {
//                System.out.println("Sub test = OK");
//            } else {
//                System.out.println("Sub test = FAIL");
//            }
//        }
//
//        public void mulTest() {
//            int firstNumber = 5;
//            int secondNumber = 5;
//            Calculator calculator = new Calculator();
//            int result = calculator.mul(firstNumber, secondNumber);
//            if (result == 25) {
//                System.out.println("Mul test = OK");
//            } else {
//                System.out.println("Mul test = FAIL");
//            }
//        }
//
//        public void divTest() {
//            int firstNumber = 40;
//            int secondNumber = 8;
//            Calculator calculator = new Calculator();
//            int result = calculator.div(firstNumber, secondNumber);
//            if (result == 5) {
//                System.out.println("Div test = OK");
//            } else {
//                System.out.println("Div test = FAIL");
//            }
//        }
//
//        public void isEvenTest1() {
//            Calculator calculator = new Calculator();
//            boolean result = calculator.isEven(40);
//            if (result) {
//                System.out.println("isEven test = OK");
//            } else {
//                System.out.println("isEven test = FAIL");
//            }
//        }
//
//        public void isEvenTest2() {
//            Calculator calculator = new Calculator();
//            boolean result = calculator.isEven(41);
//            if (result == false) {
//                System.out.println("isEven test = OK");
//            } else {
//                System.out.println("isEven test = FAIL");
//            }
//        }
    }

