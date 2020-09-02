package teacher.lesson_5.lessoncode;

public class ForExample {

    public static void main(String[] args) {
        //1
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }

        //2
        int[] myIntArray = {6, 23, 4, 0, -6};
        int min = myIntArray[0];

        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }
        }

        System.out.println(min);
    }

}
