package student_dmitry_vasiliev.lesson_3.level_2;

import java.util.Scanner;

class StringScan {
    public static void main(String[] args) {
        System.out.println("Enter Yor name please...");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
