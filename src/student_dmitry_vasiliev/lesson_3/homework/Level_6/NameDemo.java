package student_dmitry_vasiliev.lesson_3.homework.Level_6;
import java.util.Scanner;
public class NameDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Name names = new Name();

        System.out.println("Hello, You are on the integration box.");
        System.out.println("Please enter Your first name...");
        String firstName = in.next();
        names.setFirstName(firstName);

        System.out.println("Please enter Your second name...");
        String secondName = in.next();
        names.setSecondName(secondName);

        System.out.println("Are You Latvian - 1 or Estonian - 2?");
        int sitizenship = in.nextInt();

        boolean stat = 1 == sitizenship;
        if (stat) {
            System.out.println("Your new name is " + names.getFirstName() + "s " + names.getSecondName() + "s, congratulations!");

        }
        else {
            System.out.println("Your new name is Aivar Karu, palju onne!");
    }
    }
}

