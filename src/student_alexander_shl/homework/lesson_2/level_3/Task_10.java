package student_alexander_shl.homework.lesson_2.level_3;

/* Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter double radius: ");
        double firstNumber = scanner.nextDouble();

        final double Pi = 3.1415926536;

        double  perimeterResult = firstNumber * 2 * Pi;
        System.out.println("Perimeter is: " + perimeterResult);

        double  areaResult = perimeterResult * 0.5 * firstNumber;
        System.out.println("Area is: " + areaResult);
    }
}
