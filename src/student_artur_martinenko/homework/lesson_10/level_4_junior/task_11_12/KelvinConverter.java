package student_artur_martinenko.homework.lesson_10.level_4_junior.task_11_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
