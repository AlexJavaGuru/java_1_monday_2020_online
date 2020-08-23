package student_dmitry_vasiliev.lesson_3.homework.Level_6;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Fan", 120, 0);
        product.printInformation();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter discount in %...");
        double discount = in.nextInt();

        double newPrice = product.regularPrice - ((product.regularPrice / 100) * discount);
        System.out.println("Discount " + discount + " %, new price - " + newPrice + " eur." );


    }
}
