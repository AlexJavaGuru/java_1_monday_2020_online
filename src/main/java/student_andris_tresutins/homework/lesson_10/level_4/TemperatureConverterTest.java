package student_andris_tresutins.homework.lesson_10.level_4;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();

        test.kelvinTest();
        test.fahrenheitTest();

    }

    public void kelvinTest(){
        TemperatureConverter celsius = new CelsiusConverter();
        TemperatureConverter kelvin = new KelvinConverter();

        double cTemp = celsius.convert(20.5);
        double result = kelvin.convert(cTemp);
        double expected = 293.65;

        check(expected, result, "Kelvin conversion Test");
    }
    public void fahrenheitTest(){
        TemperatureConverter celsius = new CelsiusConverter();
        TemperatureConverter fahrenheit = new FahrenheitConverter();

        double cTemp = celsius.convert(20.5);
        double result = fahrenheit.convert(cTemp);
        double expected = 68.9;

        check(expected, result, "Fahrenheit conversion Test");

    }

    public void check(double expectedResult, double actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }
}
