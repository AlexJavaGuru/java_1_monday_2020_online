package student_dmitry_vasiliev.lesson_9.level_2;

// - Task_11
//Создайте иерархию наследования из двух уровней (родительский и дочерний).
//Продемонстрируйте использование протектед конструктора в родительском классе.
//Продемонстрируйте вызов протектед конструктора из класса потомка.
class Parent {
    String nameA;
    protected Parent(String nameA) {
        this.nameA = nameA;

    }
    Parent(String name,int age) {
        this.nameA = name;


    }
}
