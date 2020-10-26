package student_artur_martinenko.homework.lesson_12.level_3_junior.task_18;
//Task_18
/*
Создайте класс NullPointerExceptionDemo
и в main() методе этого класса напишите код,
который приводит к появлению NullPointerException.
В комментариях напишите, когда происходит NullPointerException.
 */

import java.util.List;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        List<String> list = null;
        list.get(0);
        //когда указываем на или хотим использовать несуществующий (null) объект
    }
}
