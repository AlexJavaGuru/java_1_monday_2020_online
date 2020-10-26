package student_artur_martinenko.homework.lesson_3.level_2;


import java.util.Scanner;

class StringOutTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        String myName = scanner.nextLine(); //Task_9

        System.out.println(myName); //Task_7
        String test = "Hi " + myName + "!";
        System.out.println(test);   //Task_8

        System.out.println("\n" + myName.length()); //Task_10
        System.out.println(myName.compareTo(test)); //Task_10
        System.out.println(myName.equals(test)); //Task_10
    }

    //Task_10
    /*
    Strings are stored on the heap area in a separate memory location known as String Constant pool.
    String constant pool: It is a separate block of memory where all the String variables are held.
     **/




}
