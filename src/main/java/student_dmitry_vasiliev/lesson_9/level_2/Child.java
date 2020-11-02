package student_dmitry_vasiliev.lesson_9.level_2;
// - Task_11
//Создайте иерархию наследования из двух уровней (родительский и дочерний).
//Продемонстрируйте использование протектед конструктора в родительском классе.
//Продемонстрируйте вызов протектед конструктора из класса потомка.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Child extends Parent {

    Child (String name, int age) {
        super(name);
    }
}
