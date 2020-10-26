package teacher.lesson_8.lessoncode.inheritance;

public class MobilePhone {

    public String model;
    public boolean withButtons;

    public MobilePhone(String model, boolean withButtons) {
        this.model = model;
        this.withButtons = withButtons;
    }

    public void call() {
        System.out.println("Ring ring");
    }

    public void interaction() {
        System.out.println("Push the buttons");
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", withButtons=" + withButtons +
                '}';
    }
}
