package student_lilija_g.homework.lesson_6.level_4.task_14;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindNumber();      // lesson_6 level_3 Task_9
        test.shouldHowManyContains(); // lesson_6 level_3 Task_10
        test.shouldReplace();         // lesson_6 level_3 Task_11
        test.shouldReplaceAll();      // lesson_6 level_3 Task_12
        test.shouldRevers();          // lesson_6 level_3 Task_13
        test.shouldSortArray();       // lesson_6 level_3 Task_14

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArrayOne = arrayUtil.createArray(5);
        totalTest(5, myArrayOne.length, "ArrayUtilTest myArrayOne");

        int[] myArrayTwo =arrayUtil.createArray(10);
        totalTest(10, myArrayTwo.length, "ArrayUtilTest myArrayTwo");
    }

    public void shouldFillArrayWithRandomNumbers() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        int sumValue = 0;
        for (int i : myArray) {
            sumValue += i;
        }

        arrayUtil.printArrayToConsole(myArray); // Для себя, чтобы убедиться точно
        System.out.println("Sum: "+sumValue);   // Для себя, чтобы убедиться точно

        totalTest(sumValue, arrayUtil.sumArray(myArray),"shouldFillArrayWithRandomNumbers Test" );

    }

    public void shouldFindMaxNumber() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15};

        //    arrayUtil.printArrayToConsole(myArray);
        totalTest(100, arrayUtil.findMaxNumber(myArray),"shouldFindMaxNumber Test" );
    }

    public void shouldFindMinNumber() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15};

        //   arrayUtil.printArrayToConsole(myArray);
        totalTest(3, arrayUtil.findMinNumber(myArray),"shouldFindMinNumber Test" );
    }

    public void shouldFindNumber() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15};

        totalBooleanTest(true, arrayUtil.findNumber(myArray, 100),"shouldFindNumber 100" );
        totalBooleanTest(false, arrayUtil.findNumber(myArray, 99),"shouldFindNumber 99" );

    }

    public void shouldHowManyContains() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15, 100};

        totalTest(2, arrayUtil.howManyContains(myArray, 100),"shouldHowManyContains 100" );
        totalTest(1, arrayUtil.howManyContains(myArray, 3),"shouldHowManyContains 3" );
        totalTest(0, arrayUtil.howManyContains(myArray, 99),"shouldHowManyContains 99" );
    }

    void shouldReplace() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15, 100};
        totalTest(1, arrayUtil.replace(myArray,100,50), "shouldReplace 100" );

    }

    void shouldReplaceAll() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15, 100};
        totalTest(2, arrayUtil.replaceAll(myArray,100,50), "shouldReplaceAll 100" );
        //  arrayUtil.printArrayToConsole(myArray);  // Проверка для себя
        totalTest(1, arrayUtil.replaceAll(myArray,85,50), "shouldReplaceAll 85" );
        totalTest(3, arrayUtil.replaceAll(myArray,50,33), "shouldReplaceAll 50" );

    }

    void shouldRevers() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        arrayUtil.printArrayToConsole(myArray);
        arrayUtil.printArrayToConsole(arrayUtil.reversArray(myArray));

        totalTest(7, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 0), "7");
        totalTest(6, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 1), "6");
        totalTest(5, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 2), "5");
        totalTest(4, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 3), "4");
        totalTest(3, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 4), "3");
        totalTest(2, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 5), "2");
        totalTest(1, arrayUtil.returnNumberForIndex(arrayUtil.reversArray(myArray), 6), "1");

    }

    void shouldSortArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {56, 100, 85, 3, 45, 15, 100};
        arrayUtil.printArrayToConsole(myArray);

        arrayUtil.sortArray(myArray);           // Проверка для себя
        arrayUtil.printArrayToConsole(myArray); // Проверка для себя

        totalTest(3, arrayUtil.returnNumberForIndex(myArray,0),"First number ");
        totalTest(100, arrayUtil.returnNumberForIndex(myArray,6),"Max number ");

    }

    void totalTest(int expectedValue, int actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
    void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
