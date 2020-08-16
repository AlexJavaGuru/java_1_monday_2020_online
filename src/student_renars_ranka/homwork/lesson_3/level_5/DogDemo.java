package student_renars_ranka.homwork.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Suns", 1, Dog.Colors.Red);
        dog.voice();
        dog.happyBirthday();
        dog.changeColor(Dog.Colors.White);
        dog.voice();
    }

}
