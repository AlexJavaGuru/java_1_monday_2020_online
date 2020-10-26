package student_elizabete_ket.homework.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        firstDog.setDogColour("Gold");
        firstDog.setAge(2);


        firstDog.voice();
        firstDog.voice2();


        int age = firstDog.dogAge(1);
        firstDog.happyBirthday();

        firstDog.changeColor("Red");



    }
}
