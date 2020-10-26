package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Ознакомиться с комментарием в классе Circle")
class CircleDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius...");
        double radius = in.nextDouble();

        Circle circle1 = new Circle();
        double print = circle1.circle(radius);
        System.out.println("Area is  " + print);

        }
}
