package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class ArrayUtil {

    public int getArrayLengthFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length!");
        int arrLength = sc.nextInt();
        return  arrLength;
    }

    public int[] createArray(int arrayLength) {
        return  new int[arrayLength];
    }

    public void fillArrayWithNumbersFromUser(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element: ");
            arr[i] = sc.nextInt();
        }
    }

    public void printArrayToConsole(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr element = " + arr[i]);
        }
    }


}
