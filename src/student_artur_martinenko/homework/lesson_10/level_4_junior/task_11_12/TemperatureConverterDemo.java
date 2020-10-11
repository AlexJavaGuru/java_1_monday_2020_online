package student_artur_martinenko.homework.lesson_10.level_4_junior.task_11_12;

class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverterDemo victim = new TemperatureConverterDemo();
        victim.fahrenheitConverterTest();
        victim.kelvinConverterTest();
    }

    public void check(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }


    public void fahrenheitConverterTest() {
        TemperatureConverter converterFahrenheit = new FahrenheitConverter();
        double fahrenheits = converterFahrenheit.convert(20);
        check(68.00, fahrenheits, "fahrenheitConverterTest");
    }

    public void kelvinConverterTest() {
        TemperatureConverter converterKelvins = new KelvinConverter();
        double kelvins = converterKelvins.convert(20);
        check(293.15, kelvins, "kelvinConverterTest");
    }


}
