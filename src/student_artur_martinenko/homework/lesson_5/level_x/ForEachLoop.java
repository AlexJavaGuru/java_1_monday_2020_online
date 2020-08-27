package student_artur_martinenko.homework.lesson_5.level_x;

class ForEachLoop {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //default for()
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //enhanced for() or foreach
        for (int i : myArray) {
            System.out.println(i);
        }

    }

}
