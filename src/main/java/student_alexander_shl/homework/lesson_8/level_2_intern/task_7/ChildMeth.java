package student_alexander_shl.homework.lesson_8.level_2_intern.task_7;
/*
Если в методе дочернего класса требуется использовать возможности родительского,
то обращение к родительскому классу происходит через слово "super", т.к. в Java родительский
класс ещё называют суперклассом.
*/

class ChildMeth extends ParentMeth{

    public ChildMeth(String name) {
        super(name);
    }

    public void printStr() {
        System.out.println("Child class");
    }
}
