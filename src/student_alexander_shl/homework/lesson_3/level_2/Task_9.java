package student_alexander_shl.homework.lesson_3.level_2;
/* Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        System.out.println("enter your name: ");
        Scanner myName = new Scanner(System.in);

        String yourName = myName.nextLine();
        System.out.println("Hello " + yourName + "!");
    }
}
