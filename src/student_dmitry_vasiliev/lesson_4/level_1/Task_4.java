package student_dmitry_vasiliev.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    private int num;
    public static void main(String[] args) {

        System.out.println("Enter please integer number for check...");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int result = num % 2;
        if (result>0)
            System.out.println(num + " is odd number.");
        else
            System.out.println(num + " is a even number.");
    }
}
