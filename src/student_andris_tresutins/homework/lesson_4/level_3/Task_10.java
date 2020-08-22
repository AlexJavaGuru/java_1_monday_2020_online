package student_andris_tresutins.homework.lesson_4.level_3;

import java.util.Scanner;

//Плохое название переменных. Не жалейте буквы num = number. 1,2,3 в названиях, это тоже не лучшая идея. Отвыкайте писать цифры в названиях. Лучше пишите numberOne, numberTwo...
public class Task_10 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num3 = input2.nextInt();


        if(num1 < num2 && num2 < num3){
            System.out.println(num3 + " num3 is the biggest");
        }
        else if (num1 > num2 && num2 > num3){
            System.out.println(num1 + " num1 is the biggest");
        }
        else{
            System.out.println(num2 + " num2 is the biggest");
        }
    }
}
