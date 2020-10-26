package student_pjotrs_grezmanis.lesson_6.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.testSumArray();
        twoDimensionalArrayTest.testSumArrayTwo();
        twoDimensionalArrayTest.randomNumberTwoArray();

    }

    public void randomNumberTwoArray() {
        int[][] testArray = new int[5][5];
        TwoDimensionalArray.fillArrayRandomNumbers(testArray);
        System.out.println("randomNumberTwoArray: " + Arrays.deepToString(testArray));
    }

    public void testSumArray() {
        int[][] myArray = new int[2][3];
        myArray[0][0] = 10;
        myArray[0][1] = 20;
        myArray[0][2] = 30;
        myArray[1][0] = 40;
        myArray[1][1] = 50;
        myArray[1][2] = 60;
        if (TwoDimensionalArray.sumTwoArray(myArray) == 210) {
            System.out.println("testSumArray() - OK");
        } else {
            System.out.println("testSumArray() - FAILED");
        }


    }
    public void testSumArrayTwo(){
        int[][] myArray = new int[3][3];
        myArray[0][0] = 10;
        myArray[0][1] = 20;
        myArray[0][2] = 30;
        myArray[1][0] = 40;
        myArray[1][1] = 50;
        myArray[1][2] = 60;
        myArray[2][0] = 70;
        myArray[2][1] = 80;
        myArray[2][2] = 90;
        if (TwoDimensionalArray.sumTwoArray(myArray) == 450) {
            System.out.println("testSumArrayTwo() - OK");
        } else {
            System.out.println("testSumArrayTwo() - FAILED");
        }
    }
}

