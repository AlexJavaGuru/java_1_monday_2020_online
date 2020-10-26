package teacher.lesson_3.lessoncode;

public class Dog {

    private String name;
    private int age;
    private boolean hunger;

    public void bark() {
        System.out.println("Wof...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getHunger() {
        return hunger;
    }


}
