package student_regina_svistunov.lesson_3.level_6;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Apple");
        product.setRegularPrice(1000);
        product.setDiscount(25);
        product.actualPrice();
        product.printInfomation();

    }
}
