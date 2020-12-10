package student_alexander_shl.homework.lesson_5.level_1;
/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition2 {

    public static void main(String[] args) {
        int numbers = new byte[10];
    }

}

 */

class ArrayDefinition2 {
    public static void main(String[] args) {
        byte[] numbers = new byte[10];   // int[] numbers = new int[10];
    }
}
