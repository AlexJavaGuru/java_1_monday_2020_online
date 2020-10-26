package student_aleksejs_ivanovs.homework.lesson_3.level_6.task_25;

class CircleDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(57);
        double radius = circle.radius;
        System.out.print("Radius is: " + radius + "\nArea is: ");
        circle.calculateArea();
    }
}
