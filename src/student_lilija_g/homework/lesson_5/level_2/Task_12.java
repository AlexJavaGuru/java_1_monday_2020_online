package student_lilija_g.homework.lesson_5.level_2;

class Task_12 {

    public static void main(String[] args) {

        int[] myNumbers = new int[3];

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array of integers with dimension 3 is {" +
                myNumbers[0] + ", " +
                myNumbers[1] + ", " +
                myNumbers[2] + "} ");
    }
}
