package student_dmitry_vasiliev.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    private int num;
    public static void main(String[] args) {

        System.out.println("Enter please integer number for check...");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num>0)
            System.out.println(num + " is a positive number.");
        if (num<0)
            System.out.println(num + " is a negative number.");
        else
            System.out.println("Entered number is 0.");
    }
}