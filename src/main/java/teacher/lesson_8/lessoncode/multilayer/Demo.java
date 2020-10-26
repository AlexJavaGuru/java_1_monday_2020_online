package teacher.lesson_8.lessoncode.multilayer;

public class Demo {

    public static void main(String[] args) {
        UI myUI = new UI();

        myUI.askUser("Hey, It's me!");

        String result = myUI.giveUserInfo(10);
        System.out.println(result);
    }
}
