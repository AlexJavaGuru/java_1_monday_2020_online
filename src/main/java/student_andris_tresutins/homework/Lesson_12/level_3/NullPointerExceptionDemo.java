package student_andris_tresutins.homework.Lesson_12.level_3;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String nullPointer = null;

        try{
            //Null pointer exception happens here
            if(nullPointer.equals("Not null")){
                System.out.println("The result is not null");
            }
        }catch(NullPointerException e){
            System.out.println("Null pointer exception was caught");
        }
    }
}
