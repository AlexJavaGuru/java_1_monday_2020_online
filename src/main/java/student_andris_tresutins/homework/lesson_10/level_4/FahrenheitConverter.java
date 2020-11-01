package student_andris_tresutins.homework.lesson_10.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
