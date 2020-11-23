package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему скидка, это не часть продукта? Вы спрашиваете скидку у пользователя но в продукте не меняете состояние скидки. Так не должно быть. " +
        "Продкут САМ должен расчитывать скидку. Вы должны просто вызвать метод расчета цены у продукта, а он должен её вернуть")
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Fan", 120, 0);
        product.printInformation();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter discount in %...");
        product.discount = in.nextInt();

        double newPrice = product.regularPrice - ((product.regularPrice / 100) * product.discount);
        System.out.println("Discount " + product.discount + " %, new price - " + newPrice + " eur." );


    }
}
