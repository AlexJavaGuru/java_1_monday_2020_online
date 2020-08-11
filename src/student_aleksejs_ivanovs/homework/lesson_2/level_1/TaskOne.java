package student_aleksejs_ivanovs.homework.lesson_2.level_1;

import java.util.Scanner;

//TODO: В этом классе у вас довольно много лишних и недостающих пробелов. К примеру: System.out.println ("Enter two integers!"); => System.out.println("Enter two integers!");
public class TaskOne {

    public static void main(String[] args) {
        System.out.println ("Enter two integers!");
        Scanner num = new Scanner (System.in);

        //TODO: Переменные лучше инстанциировать в отдельных строках. Это не грубая ошибка, а скорее просто хорошая практика.
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
