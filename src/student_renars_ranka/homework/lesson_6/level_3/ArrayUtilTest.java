package student_renars_ranka.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "А чего метод findNumber не тестируется? =)")
public class ArrayUtilTest {

    public static void main(String[] args) {
       ArrayUtilTest test = new ArrayUtilTest();
       test.shouldCreateArray();
       test.shouldFillArrayWithRandomNubers();
       test.shouldConvertArryToString();
       test.sholdfindNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(10);

        if (myArray.length == 10) {
            System.out.println("Create Array - Passed!");
        } else {
            System.out.println("CreateArray - Not passed!");
        }
    }

    public void shouldFillArrayWithRandomNubers() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNubers(myArray);

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        if (sum > 0) {
            System.out.println("Fill Array With Random Nubers - Passed!");
        } else {
            System.out.println("Fill Array With Random Nubers - Not passed!");
        }
    }

    public void shouldConvertArryToString () {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNubers(myArray);
        String string = arrayUtil.convertArrayToString(myArray);

        System.out.println(string);
    }

    public void sholdfindNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = {10, 15, 30, 100, 50, 70, 1, 7, 90, 30};


    }

}
