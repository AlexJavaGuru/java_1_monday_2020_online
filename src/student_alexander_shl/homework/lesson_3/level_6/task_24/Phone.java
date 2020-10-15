package student_alexander_shl.homework.lesson_3.level_6.task_24;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
class Phone {

    public String model;
    public String color;
    public int weight;
    public double price;

        public Phone(String model, String color, int weight, double price) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

      public void phoneInfo() {
            System.out.println("Phone model: " + model + ", Phone color: " + color + ", Phone weight: " + weight + ", Phone price: " + price);}
}
