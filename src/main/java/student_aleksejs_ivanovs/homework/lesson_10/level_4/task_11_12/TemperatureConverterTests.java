package student_aleksejs_ivanovs.homework.lesson_10.level_4.task_11_12;

/*  Task_11
Сайт прогноза погоды на данный момент показывает
температуру в градусах по цельсию.
Для выхода на международный рынок сайту нужно
уметь конвертировать температуру в кельвины и форенгейты.
Попробуйте самостоятельно спроектировать (придумать)
и реализовать решение для данной задачи.*/

/*  Task_12
Сайт прогноза погоды на данный момент показывает
температуру в градусах по цельсию.
Для выхода на международный рынок сайту нужно
уметь конвертировать температуру в кельвины и форенгейты.

Ведущий программист для описания процесса конвертации
температуры в градусах по цельсию в кельвины и форенгейты
создал следующий интерфейс:

interface TemperatureConverter {

    double convert(double celsiusTemperature);

}

И две имплементации данного интерфейса:

class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }

}

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}

Ваша задача:
- по аналогии с классом KelvinConverter создать класс FahrenheitConverter
  (формула: 1.8 * celsiusTemperature + 32);
- написать юнит тесты для классов KelvinConverter и FahrenheitConverter.*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TemperatureConverterTests {

    public static void main(String[] args) {
        TemperatureConverterTests test = new TemperatureConverterTests();
        test.kelvinConverterTest();
        test.fahrenheitConverterTest();
    }

    public void kelvinConverterTest() {
        KelvinConverter kelvin = new KelvinConverter();
        double result = kelvin.convert(30);

        if (result == 303.15) {
            System.out.println("kelvinConverterTest passed");
        } else {
            System.out.println("kelvinConverterTest failed");
        }
    }

    public void fahrenheitConverterTest() {
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        double result = fahrenheit.convert(30);

        if (result == 86) {
            System.out.println("fahrenheitConverterTest passed");
        } else {
            System.out.println("fahrenheitConverterTest failed");
        }
    }

}
