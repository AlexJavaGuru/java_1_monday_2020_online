package student_dmitry_vasiliev.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_9 { public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
    int a = in.nextInt();
    int b = 1;

        do {
            int c = a * b;
            System.out.println(a+" * "+b+" = "+c);
            b++;
        }while (b < 11);

}
}
