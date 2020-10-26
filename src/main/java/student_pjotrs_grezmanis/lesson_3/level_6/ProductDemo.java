package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product phone = new Product("Phone");
        phone.actualPrice(800, 15);
        phone.printInformation();
    }
}