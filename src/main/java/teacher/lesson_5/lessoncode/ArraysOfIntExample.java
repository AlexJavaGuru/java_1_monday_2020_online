package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class ArraysOfIntExample {

    public static void main(String[] args) {
        ArraysOfIntExample arraysOfIntExample = new ArraysOfIntExample();

        int[] myFirstArray = new int[4];

        System.out.println(Arrays.toString(myFirstArray));

        //myFirstArray ->   0 1 2 3
        //                 |_|_|_|_|
        //

        myFirstArray[0] = 10;
        myFirstArray[1] = 15;
        myFirstArray[2] = 2;
        myFirstArray[3] = 34;

        arraysOfIntExample.printArray(myFirstArray);


        myFirstArray[3] = 100;

        arraysOfIntExample.printArray(myFirstArray);

    }

    public void printArray(int[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
    }

}
