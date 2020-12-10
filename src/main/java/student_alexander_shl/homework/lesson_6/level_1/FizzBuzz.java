package student_alexander_shl.homework.lesson_6.level_1;
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
 */

class FizzBuzz {

    public int initialNumber;

    public String detect(int number) { // метод, который надо переделать
        this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz"; // число делится на три и на пять возвращает "FizzBuzz"
        else if (initialNumber % 3 == 0) return "Fizz"; // число делится на три возвращает "Fizz"
        else if (initialNumber % 5 == 0) return "Buzz"; // число делится на пять возвращет "Buzz"
        else return String.valueOf(initialNumber); // иначе возвращает само число
    }

    public String detectNew(int number) { // переделанный метод
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } return (number % 5 == 0) ? "Buzz" : String.valueOf(number);
    }

}
