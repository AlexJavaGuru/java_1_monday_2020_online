package student_regina_svistunov.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Lucy", 2, "Black");

        myDog.voice();
        myDog.happyBirthday();
        myDog.changeColor("White");
        myDog.voice();

    }
}
