package student_regina_svistunov.lesson_8.level_6;

//Узнать в интернете, что такое varargs.
//        Придумайте пример кода, в котором продемонстрируйте
//        использование varargs.


import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class Calculator {

    public static void main(String... sss) {

        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 10, 12, 16, 24, 523, 6, 234);
    }

    int sum(int... numbers) {
        return Arrays.stream(numbers).sum();

    }
}
