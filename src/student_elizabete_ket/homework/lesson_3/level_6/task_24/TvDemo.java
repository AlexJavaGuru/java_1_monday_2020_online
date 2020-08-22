package student_elizabete_ket.homework.lesson_3.level_6.task_24;

public class TvDemo {

    public static void main(String[] args) {
        Tv newTV = new Tv();
        newTV.setModel("Sony");
        System.out.println("TV model is " + newTV.getModel());
        newTV.setScreenSize(82.3);
        System.out.println("TV screen size is " + newTV.getScreenSize());
        newTV.isSwitchedOn(true);

    }
}
