package student_aleksejs_ivanovs.homework.lesson_2.level_1;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println ("Enter two integers!");
        Scanner num = new Scanner (System.in);

        int first, second, plus, minus, multiply,split;
        first = num.nextInt();
        second = num.nextInt();

        plus = first + second;
        minus = first - second;
        multiply = first * second;
        split = first / second;

        System.out.println ("\n Plus: "+plus+"\n Minus: "+minus+"\n Multiplication: "+multiply+"\n Division: "+split);
    }

}
