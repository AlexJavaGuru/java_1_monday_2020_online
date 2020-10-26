package student_aleksejs_ivanovs.homework.lesson_10.level_4.task_11_12;

class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
