package student_arturs_arusanovs.lesson_3.level_5;

//Похвально, что вы идете вперед, но я бы очень хотел чтобы вы поработали над форматом кода. Лучше отделять структуры при помощи новых строк. Так же, лучше делить секции (переменные, конструкторы, методы).
//Вот так должен выглядеть ваш класс. Так, его на много проще читать.
public class Dog {

    private String name;
    private int age;
    private String colour;

    public enum Colors {Brown, Black, White}

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void voice() {
        System.out.println("Hello. My name is " + getName() + "!" + " I am " + getAge() + " years old.");
        System.out.println("Hello. My name is " + getName() + "!" + " I am " + getAge() + " years old.");
        System.out.println("Hello. My name is " + getName() + "!" + " I am " + getAge() + " years old.");
    }

    private void plusOneYear() {
        this.age += 1;
    }

    public void happyBirthday() {
        plusOneYear();
    }

    public void voice1() {
        System.out.println("Hello. My name is " + getName() + "!" + " Today my birthday and I am " + age + " years old.");

    }

    public void voice2() {
        System.out.println("Hello. My name is " + getName() + "!" + " I am " + getAge() + " years old. My color was "
                + getColour() + ".");
    }

    public String getColour() {
        return colour;
    }
}