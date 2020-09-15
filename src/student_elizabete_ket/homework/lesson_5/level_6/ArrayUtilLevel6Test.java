package student_elizabete_ket.homework.lesson_5.level_6;

class ArrayUtilLevel6Test {

    public static void main(String[] args) {
        ArrayUtilLevel6Test test = new ArrayUtilLevel6Test();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtilLevel6 arrayUtil = new ArrayUtilLevel6();

        int[] newArray = arrayUtil.createArray(3);
        if (newArray.length == 3) {
            System.out.println("Test array length is passed");
        } else {
            System.out.println("Test array length is failed");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtilLevel6 arrayUtil = new ArrayUtilLevel6();

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

        arrayUtil.printArrayToConsole(newArray);
    }

    public void shouldFindMaxNumber() {
        ArrayUtilLevel6 arrayUtil = new ArrayUtilLevel6();
        int[] newArray = {5, 15, 32};
        int expectedResult = 32;
        int actualResult = arrayUtil.findMaxNumber(newArray);
        if (expectedResult == actualResult) {
            System.out.println("Test max number is passed");
        } else {
            System.out.println("Test max number is failed, expected result is " + expectedResult + " and actual result is " + actualResult);
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtilLevel6 arrayUtil = new ArrayUtilLevel6();
        int[] newArray = {89, 56, 5};
        int expectedResult = 5;
        int actualResult = arrayUtil.findMinNumber(newArray);
        if (expectedResult == actualResult) {
            System.out.println("Test min number is passed");
        } else {
            System.out.println("Test min number is failed, expected result is " + expectedResult + " and actual result is " + actualResult);
        }
    }
}







