package student_aleksejs_ivanovs.homework.lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Puska", 3, "Green");
        String voice = dog.getDogName();
        int age = dog.getDogAge();
        System.out.println(voice + " " + age + "\n" + voice + "\n" + voice);
        dog.happyBirthday();
        dog.voice();
        dog.voiceOne();
        dog.changeColor("Grey");
        dog.voiceTwo();

    }
}
