package student_artur_martinenko.homework.lesson_12.level_3_junior.task_21;
//Task_21
/*
Дано

class TestException extends Exception { }

class Main {
   public static void main(String args[]) {
      try {
         throw new TestException();
      } catch(TestException t) {
         System.out.println("Got the Test Exception");
      } finally {
         System.out.println("Inside finally block ");
      }
  }
}

Какой результат мы получим?
1. Got the Test Exception
   Inside finally block

2. Got the Test Exception

3. Inside finally block

4. Compiler Error
 */
class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

//Result ->
//1. Got the Test Exception
//        Inside finally block
