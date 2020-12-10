package student_alexander_shl.homework.lesson_5.level_1;
/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition3 {

    public static void main(String[] args) {
        boolean numbers = new int[10];
    }

}

 */

class ArrayDefinition3 {
    public static void main(String[] args) {
        boolean[] numbers = new boolean[10]; //  int[] numbers = new int[10];
    }
}
