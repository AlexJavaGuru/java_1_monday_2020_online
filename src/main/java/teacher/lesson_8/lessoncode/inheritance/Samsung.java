package teacher.lesson_8.lessoncode.inheritance;

public class Samsung extends MobilePhone {

    public String OS;

    public Samsung(String model, boolean withButtons, String OS) {
        super(model, withButtons);
        this.OS = OS;
    }

    public void transferData() {
        System.out.println("Using Bluetooth");
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "OS='" + OS + '\'' +
                ", model='" + model + '\'' +
                ", withButtons=" + withButtons +
                '}';
    }
}
