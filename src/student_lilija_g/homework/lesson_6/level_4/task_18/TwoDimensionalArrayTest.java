package student_lilija_g.homework.lesson_6.level_4.task_18;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest myTest = new TwoDimensionalArrayTest();
        myTest.shouldCreateTwoDimensionalArray();
        myTest.shouldFillArrayWithRandomNumbers();
        myTest.shouldSumTwoDimensionalArrayNumbers();
    }

    public void shouldCreateTwoDimensionalArray() {
        TwoDimensionalArray myTwoDimensionalArray = new TwoDimensionalArray();

        int[][] myArray = myTwoDimensionalArray.createArray(3, 4);

        totalTest(3, myArray.length, "myArray i=3 ");
        totalTest(4, myArray[0].length, "myArray j=4 ");
        myTwoDimensionalArray.printTwoDimensionalArrayToConsole(myArray);
    }

    public void shouldFillArrayWithRandomNumbers() {
        TwoDimensionalArray myTwoDimensionalArray = new TwoDimensionalArray();

        int[][] myArray = myTwoDimensionalArray.createArray(5, 3);

        totalTest(5, myArray.length, "myArray i=5 ");
        totalTest(3, myArray[0].length, "myArray j=3 ");
        myTwoDimensionalArray.printTwoDimensionalArrayToConsole(myArray);

        myTwoDimensionalArray.fillArrayWithRandomNumbers(myArray);

        myTwoDimensionalArray.printTwoDimensionalArrayToConsole(myArray);

        int sumValue = 0;
        for (int[] ints : myArray) {
            for (int j = 0; j < myArray[0].length; j++) {
                sumValue += ints[j];
            }
        }
        totalTest(sumValue, myTwoDimensionalArray.sumTwoDimensionalArrayNumbers(myArray), "shouldFillArrayWithRandomNumbers Test");
    }

    public void shouldSumTwoDimensionalArrayNumbers() {

        TwoDimensionalArray myTwoDimensionalArray = new TwoDimensionalArray();
        int[][] myArray = myTwoDimensionalArray.createArray(6, 8);

        myTwoDimensionalArray.fillArrayWithRandomNumbers(myArray);
        myTwoDimensionalArray.printTwoDimensionalArrayToConsole(myArray);

        int sumValue = 0;
        for (int[] ints : myArray) {
            for (int j = 0; j < myArray[0].length; j++) {
                sumValue += ints[j];
            }
        }
        System.out.println("Sum: "+ sumValue);
        totalTest(sumValue, myTwoDimensionalArray.sumTwoDimensionalArrayNumbers(myArray), "shouldSumTwoDimensionalArrayNumbers Test");
    }

    void totalTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
