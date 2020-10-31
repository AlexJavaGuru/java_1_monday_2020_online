package student_andris_tresutins.homework.lesson_10.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
