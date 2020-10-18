package student_artur_martinenko.homework.lesson_11.level_1_intern.task_3;

import java.util.ArrayList;
import java.util.List;

/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */
class IntegerListDemo {
    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();

        integerList.add(0, "1100");
        integerList.add(integerList.size() - 1, "100");
        integerList.add("0000");

        int arrSize = integerList.size();

        integerList.remove(1);
        integerList.remove("100");

        boolean flag = integerList.isEmpty();

        for (String s : integerList) {
            System.out.println(s);
        }


    }
}
