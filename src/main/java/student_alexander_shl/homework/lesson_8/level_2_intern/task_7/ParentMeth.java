package student_alexander_shl.homework.lesson_8.level_2_intern.task_7;
/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */

class ParentMeth {

    public String name;

    public ParentMeth(String name) {
        this.name = name;
    }

    public void printStr() {
        System.out.println("Parent class");
    }

    public static void main(String[] args) {

        ParentMeth parentMeth = new ParentMeth("Parent");
        parentMeth.printStr();

        ChildMeth childMeth = new ChildMeth("ChildMeth");
        childMeth.printStr();
    }
}

/*
Если в методе дочернего класса требуется использовать возможности родительского,
то обращение ко второму происходит через слово "super", после которого пишется
необходимый метод.

В Java есть особенность, связанная с наследованием конструкторов и их вызовом.
В конструкторе дочернего класса, перед тем как будут выполнены выражения тела,
неявно вызывается дефолтный (без параметров) конструктор предка.

Причем конструктор без параметров обязательно должен быть в родительском классе,
если в дочернем предполагаются только конструкторы с аргументами, а родительские
конструкторы не вызываются явно. В этом случае, если в родительском классе будут
только конструкторы с аргументами, то в дочернем будет возникать ошибка.
 */