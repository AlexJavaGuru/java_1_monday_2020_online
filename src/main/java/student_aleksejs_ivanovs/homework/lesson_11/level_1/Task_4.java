package student_aleksejs_ivanovs.homework.lesson_11.level_1;

/*Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.*/

import java.util.ArrayList;
import java.util.List;

class Task_4 {

    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();

        integerList.add("3");
        integerList.add("3");

        System.out.println(integerList);
    }

}
