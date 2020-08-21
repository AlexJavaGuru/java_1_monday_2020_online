package student_renars_ranka.homwork.lesson_3.level_6;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Maize");
        product.setRegularPrice(150);
        product.setDiscount(25);
        product.printInformation();
    }
}
