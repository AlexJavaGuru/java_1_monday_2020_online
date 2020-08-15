package student_artur_martinenko.homework.lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Tuzik", 5, Dog.Colors.White);
        dog.voice();
        dog.happyBirthday();
        dog.changeColor(Dog.Colors.Black);
        dog.voice();
    }

}
