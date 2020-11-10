package student_andris_tresutins.homework.Lesson_12.level_1.Task_5;

 class ExceptionDemo extends Exception {

     public ExceptionDemo(String message) {
         super(message);
     }

     public static void main(String args[])
     {
         try {
             int a = 30, b = 0;
             int c = a/b;  // cannot divide by zero
             System.out.println ("Result = " + c);
         }
         catch(ArithmeticException e) {
             System.out.println ("Can't divide a number by 0");
         }
     }
 }




