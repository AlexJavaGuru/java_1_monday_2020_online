package student_aleksejs_ivanovs.homework.lesson_11.level_1.task_3;

/*В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.*/

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();

        integerList.add(0, "1");
        integerList.add(integerList.size() - 1, "2");

        int listSize = integerList.size();

        integerList.remove(1);
        integerList.remove("2");

        boolean isListEmpty = integerList.isEmpty();

        for (String list : integerList) {
            System.out.println(list);
        }
    }

}
