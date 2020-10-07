package student_lilija_g.homework.lesson_7.level_6_middle.task_10;

import teacher.annotations.CodeReview;

/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */
@CodeReview(approved = true)
class PowerCalculator {

    public double powerOfNumber(double number, int power) {

        double resultOfPower = 1;
        boolean IsPowerNegative = false;

        if (power < 0) {
            IsPowerNegative = true;
            power = -power;
        }

        for (int i = 1; i <= power; i++) {
            resultOfPower = resultOfPower * number;
        }
        if (IsPowerNegative) {
            return 1 / resultOfPower;
        } else {
            return resultOfPower;
        }

    }

}
