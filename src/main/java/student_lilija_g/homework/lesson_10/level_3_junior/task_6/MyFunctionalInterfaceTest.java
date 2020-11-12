package student_lilija_g.homework.lesson_10.level_3_junior.task_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class MyFunctionalInterfaceTest implements MyFunctionalInterface{

    public static void main(String[] args) {

        int numberTest = 5;
        MyFunctionalInterface mySquare = (int number) -> number * number; //лямбда-выражение для определения метода вычисления

        int resultTest = mySquare.calculate(numberTest);
        String resultText = "Result square with number " + numberTest + " is " + resultTest;
        mySquare.myPrint(resultText);
    }

}

