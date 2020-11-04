package student_regina_svistunov.lesson_6.level_4;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumArrayWithRandomNumbers();

    }

    void sumArrayWithRandomNumbers() {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] newArray = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int sum = array.sumArrays(newArray);

        if (sum == 18) {
            System.out.println("Arrays Sum test is PASSED");
        } else {
            System.out.println("Arrays sum test is FAILED");
        }
    }
}
