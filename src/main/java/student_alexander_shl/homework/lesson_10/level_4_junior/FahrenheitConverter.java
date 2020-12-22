package student_alexander_shl.homework.lesson_10.level_4_junior;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
