package teacher.lesson_6.lessoncode;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] arrayWithLengthFromUser = arrayUtil.createArrayWithLengthFromUser();
        arrayUtil.fillArrayWithRandomNumbers(arrayWithLengthFromUser);
        String str = arrayUtil.convertArrayToString(arrayWithLengthFromUser);

        System.out.println(str);
    }
}
