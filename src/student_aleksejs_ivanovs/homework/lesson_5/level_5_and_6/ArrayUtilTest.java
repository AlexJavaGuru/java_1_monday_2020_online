package student_aleksejs_ivanovs.homework.lesson_5.level_5_and_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(3);

        if (newArray.length == 3) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(3);
        array.fillArrayWithRandomNumbers(newArray);

        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }

        if (sum > 0) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {52, 59, 56, 67, 48};
        int arrayMax = array.findMaxNumber(newArray);

        if (arrayMax == 67) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {18, 24, 33, 36, 41};
        int arrayMax = array.findMinNumber(newArray);

        if (arrayMax == 18) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }
}
