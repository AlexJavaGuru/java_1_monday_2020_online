package student_dmitry_vasiliev.lesson_3.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Радиус надо должен считать сам circle.")
class CircleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle circle1 = new Circle(2);

        System.out.println("Please enter radius...");
        double radius = in.nextDouble();

        double calculateArea = Math.PI * (radius*radius);
        System.out.println("Area is  " + calculateArea);

            }
}
