package teacher.lesson_12.lessoncode;

public class CallStackExample {

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {

    }
}
