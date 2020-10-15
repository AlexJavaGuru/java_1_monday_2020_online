package student_alexander_shl.homework.lesson_3.level_2;
/* Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        String myName = "Aleksander";
        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);
    }
}
