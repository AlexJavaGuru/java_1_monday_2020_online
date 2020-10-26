package teacher.lesson_12.lessoncode;

import java.util.Scanner;

public class ProductService {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        System.out.println("Type Product Name...");
        String productName = productService.userInput();

        System.out.println("Type Product Description...");
        String productDescription = productService.userInput();

        productService.validateName(productName);
    }

    private void validateName(String productName) {
        if (!productName.isEmpty()) {
//            throw new
        }
    }

    public String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
