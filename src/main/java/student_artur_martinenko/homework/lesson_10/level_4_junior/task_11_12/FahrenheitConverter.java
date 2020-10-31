package student_artur_martinenko.homework.lesson_10.level_4_junior.task_11_12;

import teacher.annotations.CodeReview;

/*
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
- написать юнит тесты для классов KelvinConverter и FahrenheitConverter.
 */
@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }
}
