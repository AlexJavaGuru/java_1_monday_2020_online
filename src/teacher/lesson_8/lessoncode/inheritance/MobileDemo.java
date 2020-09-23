package teacher.lesson_8.lessoncode.inheritance;

public class MobileDemo {

    public static void main(String[] args) {
        MobilePhone oldMobile = new MobilePhone("Nokia 3310", true);
        Samsung s10 = new Samsung("S10", false, "Android");
        Apple x = new Apple("X", false, "iOS");

        System.out.println(oldMobile);
        System.out.println(s10);
        System.out.println(x);

        s10.transferData();
        x.transferData();
    }
}
