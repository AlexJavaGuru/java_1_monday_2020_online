package student_alexander_shl.homework.lesson_7.level_6_middle;
/*
Task_10:
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class PowerCalculator {

    public double power(double number, int degree) {

        double result = 1;
        if (degree >= 0) {
            for (int i = 0; i < degree; i++) {
                result *= number;
            }
        } else {
            for (int i = 0; i < Math.abs(degree); i++) {
                result /= number;
            }
        }
        return result;
    }
}

