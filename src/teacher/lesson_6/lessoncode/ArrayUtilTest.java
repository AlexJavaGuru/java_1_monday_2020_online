package teacher.lesson_6.lessoncode;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
//        test.shouldCreateArray();
//        test.shouldFillArrayWithRandomNumbers();
        test.shouldConvertArrayToString();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(5);

        if (myArray.length == 5) {
            System.out.println("Passed!");
        } else {
            System.out.println("Not");
        }
    }

    public void shouldConvertArrayToString() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        String str = arrayUtil.convertArrayToString(myArray);

        System.out.println(str);

    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(myArray);

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        if (sum > 0) {
            System.out.println("Passed!");
        } else {
            System.out.println("not this time");
        }
    }
}
