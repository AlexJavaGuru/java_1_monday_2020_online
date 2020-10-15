package student_lilija_g.homework.lesson_8.level_6_middle.task_30;
/*
Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.
 */
class VarargDemo {

    public int addAll(int ... numbers) {

        int sumResult = 0;
        for (int number : numbers) {
            sumResult += number;
            System.out.println("Adding " + number + " result = " + sumResult);
        }
        return sumResult;
    }
    public static void main(String[] args) {

        VarargDemo myVarargDemo = new VarargDemo();
        myVarargDemo.addAll(10,20,30,40,50,1,2,3,4,5,6);
    }
}
