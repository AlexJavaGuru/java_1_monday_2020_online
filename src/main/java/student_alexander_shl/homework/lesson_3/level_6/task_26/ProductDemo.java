package student_alexander_shl.homework.lesson_3.level_6.task_26;

import teacher.annotations.CodeReview;

@CodeReview(approved = false)
class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Pomodoro", 2.50, 10);
        product.printInformation();
    }
}
