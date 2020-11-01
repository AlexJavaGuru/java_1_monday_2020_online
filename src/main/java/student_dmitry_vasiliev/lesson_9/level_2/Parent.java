package student_dmitry_vasiliev.lesson_9.level_2;

import teacher.annotations.CodeReview;

// - Task_11
//Создайте иерархию наследования из двух уровней (родительский и дочерний).
//Продемонстрируйте использование протектед конструктора в родительском классе.
//Продемонстрируйте вызов протектед конструктора из класса потомка.
@CodeReview(approved = true)
class Parent {
    String nameA;
    protected Parent(String nameA) {
        this.nameA = nameA;

    }
    Parent(String name,int age) {
        this.nameA = name;


    }
}
