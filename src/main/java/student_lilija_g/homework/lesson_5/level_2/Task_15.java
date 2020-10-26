package student_lilija_g.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_15 {
    public static void main(String[] args) {

        int[] myNumbers = new int[3];
        int[] myResult = new int[3];

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = (int) (Math.random() * 100);
            myResult[i] = myNumbers[i] + 2;
        }

        System.out.println("Primary array of integers with dimension 3 is {" +
                myNumbers[0] + ", " +
                myNumbers[1] + ", " +
                myNumbers[2] + "}");

        System.out.println("Resulting array of integers with dimension 3 is {" +
                myResult[0] + ", " +
                myResult[1] + ", " +
                myResult[2] + "}");
    }

}
