package teacher.lesson_11.lessoncode;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Black", 4);
        Car car2 = new Car("Black", 4);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        car1.setColor("Yellow");
        car2.setDoors(1);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
