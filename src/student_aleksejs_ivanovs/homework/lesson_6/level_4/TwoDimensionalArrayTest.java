package student_aleksejs_ivanovs.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumDoubleArrayTest();
    }

    public void sumDoubleArrayTest() {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] newArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = array.sumDoubleArray(newArray);

        if (sum == 45) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }
}
