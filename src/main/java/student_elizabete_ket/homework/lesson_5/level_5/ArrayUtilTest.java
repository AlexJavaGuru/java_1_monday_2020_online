package student_elizabete_ket.homework.lesson_5.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] newArray = arrayUtil.createArray(3);
        if (newArray.length == 3) {
            System.out.println("Test array length is passed");
        } else {
            System.out.println("Test array length is failed");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] newArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(newArray);

        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
        if (sum > 0) {
            System.out.println("Test random numbers is passed");
        } else {
            System.out.println("Test random number is failed");
        }


    }

}
