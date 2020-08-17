package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchMenuExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SwitchMenuExample switchExample = new SwitchMenuExample();
        switchExample.typeMenu();

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("User pick = 1");
                break;
            case 2:
                System.out.println("User pick = 2");
                break;
            case 3:
                System.out.println("User pick = 3");
                break;
            default:
                System.out.println("No such number");
        }
    }

    public void typeMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Sum");
        System.out.println("2 - ...");
        System.out.println("Type your option...");
    }
}
