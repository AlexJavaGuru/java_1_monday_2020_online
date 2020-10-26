package student_artur_martinenko.homework.lesson_12.level_1_intern.task_5;

/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */

import java.util.EmptyStackException;

class ExceptionDemo extends Exception {
    /*
    Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown
    by the execution of the method or constructor and propagate outside the method or constructor boundary.
     */

    public ExceptionDemo() {
    }

    public ExceptionDemo(String message) {
        super(message); //<--
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause); //<--
    }

    public ExceptionDemo(Throwable cause) {
        super(cause); //<--
    }

    public ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace); //<--
    }


    public void test1() throws Exception {

    }

    public void test2() {
        try {
            //some code
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
