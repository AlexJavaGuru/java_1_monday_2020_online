package teacher.lesson_3.lessoncode;

public class DogDemo {

    public static void main(String[] args) {

        Dog sharik = new Dog();
        sharik.setName("Sharik");
        sharik.setAge(2);
        sharik.setHunger(true);

        System.out.println("My name is: " + sharik.getName());
        System.out.println("My age: " + sharik.getAge());
        System.out.println("Hungry?: " + sharik.getHunger());


        Dog bobik = new Dog();
        bobik.setName("Bobik");
        bobik.setAge(4);
        bobik.setHunger(false);


        System.out.println("My name is: " + bobik.getName());
        System.out.println("My age: " + bobik.getAge());
        System.out.println("Hungry?: " + bobik.getHunger());

        bobik.setHunger(true);

        System.out.println("Dog name: " + bobik.getName() + " Hungry?: " + bobik.getHunger());
        System.out.println("Dog name: " + sharik.getName() + " Hungry?: " + sharik.getHunger());

//        sharik.bark();
//        sharik.bark();
//        sharik.sleep();
//        sharik.sleep();
//        sharik.sleep();
//        sharik.eat();
    }

}
