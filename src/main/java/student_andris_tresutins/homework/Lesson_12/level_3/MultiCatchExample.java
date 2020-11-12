package student_andris_tresutins.homework.Lesson_12.level_3;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            //Arithmetic exception is a subClass of RuntimeException and RuntimeException is a
            // subClass of Exception therefore Exception should be in the last catch block
            // otherwise the exception will be caught before ArithmeticException catch block can be executed
        } catch (ArithmeticException e) {

        } catch (Exception a) {

        }
    }
}
