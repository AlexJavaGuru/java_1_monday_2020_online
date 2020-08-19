package student_lilija_g.homework.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {

        public static void main(String[] args) {

            System.out.println("Enter your name: ");
            Scanner yourName = new Scanner(System.in);

            String userName = yourName.nextLine();
            System.out.print("Hello " + userName + "!");
        }
    }

