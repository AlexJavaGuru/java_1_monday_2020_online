package student_pjotrs_grezmanis.lesson_6.level_4;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[6][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 10);
                sum += array[i][j];
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" Sum " + sum);
    }
}