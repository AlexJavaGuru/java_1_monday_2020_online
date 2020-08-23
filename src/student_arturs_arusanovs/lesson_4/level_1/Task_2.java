package student_arturs_arusanovs.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number please.");
        int number = scanner.nextInt();

        //Последние условие у вас всегда будет true, потому, что все другие варианты вы уже исключили. Можно было просто использовать else в конце
        if (number > 0) {
            System.out.println("Your number is positive.");
        } else if (number < 0) {
            System.out.println("Your number is negative.");
        } else {
            System.out.println("Your number is zero.");
        }
    }
}
