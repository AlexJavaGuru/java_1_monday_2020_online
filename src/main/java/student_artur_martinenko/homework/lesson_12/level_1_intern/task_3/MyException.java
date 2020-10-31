package student_artur_martinenko.homework.lesson_12.level_1_intern.task_3;

import teacher.annotations.CodeReview;

/*
Исправьте код:

class MyException extends Throwable, Exception, RuntimeException {

}
 */
@CodeReview(approved = true)
class MyException extends RuntimeException {  //cannot extend multiple classes

}
