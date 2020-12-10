package student_alexander_shl.homework.lesson_5.level_1;
/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}

 */

class ArrayLength1 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[1]);
    }
}
