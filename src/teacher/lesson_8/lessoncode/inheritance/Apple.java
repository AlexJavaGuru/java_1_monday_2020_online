package teacher.lesson_8.lessoncode.inheritance;

public class Apple extends MobilePhone {

    public String OS;

    public Apple(String model, boolean withButtons, String OS) {
        super(model, withButtons);
        this.OS = OS;
    }

    public void transferData() {
        System.out.println("AirDrop");
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "OS='" + OS + '\'' +
                ", model='" + model + '\'' +
                ", withButtons=" + withButtons +
                '}';
    }
}
