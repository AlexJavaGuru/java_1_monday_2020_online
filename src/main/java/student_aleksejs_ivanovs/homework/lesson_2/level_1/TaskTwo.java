package student_aleksejs_ivanovs.homework.lesson_2.level_1;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println ("Enter two fractional numbers!");
        Scanner num = new Scanner (System.in);

        double first, second, plus, minus, multiply,split;
        first = num.nextDouble();
        second = num.nextDouble();

        plus = first + second;
        minus = first - second;
        multiply = first * second;
        split = first / second;

        System.out.println (" Plus: "+plus+"\n Minus: "+minus+"\n Multiplication: "+multiply+"\n Division: "+split);
    }

}
