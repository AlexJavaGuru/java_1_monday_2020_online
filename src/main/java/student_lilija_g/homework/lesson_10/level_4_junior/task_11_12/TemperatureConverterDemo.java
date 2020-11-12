package student_lilija_g.homework.lesson_10.level_4_junior.task_11_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TemperatureConverterDemo {

    public static void main(String[] args) {

        TemperatureConverterDemo myTemperatureConverterDemo = new TemperatureConverterDemo();
        myTemperatureConverterDemo.kelvinConverterTest();
        myTemperatureConverterDemo.fahrenheitTest();

    }

    void totalDoubleTest(Double expectedValue, Double actualValue, String testName) {

        if (Double.compare(expectedValue, actualValue) == 0) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("ExpectedValue=" + expectedValue);
            System.out.println("ActualValue=" + actualValue);
        }
    }

    public void kelvinConverterTest() {
        TemperatureConverter kelvinConverter = new KelvinConverter();
        totalDoubleTest(293.15, kelvinConverter.convert(20.00), "Kelvin Converter Test");
    }

    public void fahrenheitTest() {
        TemperatureConverter fahrenheitConverter = new FahrenheitConverter();
        totalDoubleTest(68.00, fahrenheitConverter.convert(20.00), "Fahrenheit Converter Test");
    }

}
