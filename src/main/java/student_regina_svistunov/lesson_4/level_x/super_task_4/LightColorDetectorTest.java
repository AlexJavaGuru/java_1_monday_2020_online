package student_regina_svistunov.lesson_4.level_x.super_task_4;

//Дан класс LightColorDetector и его тест LightColorDetectorTest.
//        Найдите способ упростить тесты в LightColorDetectorTest.
//
//        Тесты тоже должны быть написаны как можно лучше и качественнее!
//        Дублирование кода - это почти всегда плохая идея в программировании.
//        Поэтому от дублирования кода нужно избавляться.
//
//        Подсказка: вынесите в отдельный метод проверку
//        результата и замените её вызовом метода в каждом тесте.
//
//        Инстанция класса LightColorDetector не имеет состояния,
//        она stateless. Найдите в интернете, что такое stateless класс
//        в программировании. Найдите способ использовать одну
//        инстанцию класса LightColorDetector для всех тестов.

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.colorTest();
    }

    void test(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test is PASSED");
        } else {
            System.out.println(testName + " test is FAILED");
        }
    }

    void colorTest() {
        test("Violet", lightColorDetector.detect(405), "Violet" );
        test("Blue", lightColorDetector.detect(475), "Blue" );
        test("Green", lightColorDetector.detect(505), "Green" );
        test("Yellow", lightColorDetector.detect(585), "Yellow" );
        test("Orange", lightColorDetector.detect(619), "Orange" );
        test("Red", lightColorDetector.detect(620), "Red" );
        test("Invisible Light", lightColorDetector.detect(760), "Invisible Light" );
    }

}
