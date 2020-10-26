package student_lilija_g.homework.lesson_6.level_1.task_3;

import teacher.annotations.CodeReview;

/*

Разберитесь, что делает класс указанный ниже.
Это реализация одного из супер тасков предыдущего урока.
Создайте класс FizzBuzzTest и напишите автоматические тесты
на все сценарии. Упростите FizzBuzz класс!
Убедитесь, что после упрощения автоматические тесты все проходят.

PS: а нужно ли свойство класса initialNumber?
Или метод detect можно реализовать без него?
class FizzBuzz {

    private int initialNumber;
    public String detect(int number) {
        this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber; // Integer.toString(initialNumber);
    }

}

Ответ:
Реализует следующие требования:
 - если переданное число делится на три и на пять возвращает "FizzBuzz"
 - если переданное число делится на три возвращает "Fizz"
 - если переданное число делится на пять возвращет "Buzz"
 - иначе возвращает само число в виде строки (return "" + number)

 */
@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else {
            if (number % 3 == 0) {
                return "Fizz";
            } else {
                if (number % 5 == 0) {
                    return "Buzz";
                } else {
                    return Integer.toString(number);
                }
            }
        }
    }
}