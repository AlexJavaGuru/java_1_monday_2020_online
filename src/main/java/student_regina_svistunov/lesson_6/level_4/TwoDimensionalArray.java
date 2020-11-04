package student_regina_svistunov.lesson_6.level_4;

//Как объявить двумерный массив?
//        Найти в интернете и написать пример кода в котором:
//        - создать класс TwoDimensionalArray,
//        - создать метод для заполнения массива случайными числами,
//        - создать метод для подсчёта суммы всех чисел в массиве.
//
//        Создать класс TwoDimensionalArrayTest и написать
//        автоматические тесты для метода подсчёта суммы всех
//        чисел в массиве.


import java.util.Random;

public class TwoDimensionalArray {

 public void randomArrays(int[][] array) {

     Random random = new Random();

     for (int i = 0; i < array.length; i++) {
         for (int j=0; j < array[i].length; j++) {
             array[i][j]= random.nextInt(9) +1;
         }
     }
 }

 public int sumArrays(int[][] array) {
     int sum =0;
     for (int[] ints : array) {
         for (int j = 0; j < array.length; j++) {
             sum += ints[j];
         }
     }
     return sum;
 }

}
