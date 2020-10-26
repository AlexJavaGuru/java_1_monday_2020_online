package student_artur_martinenko.homework.lesson_3.level_6;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Kefir");
        product.setRegularPrice(100);
        product.setDiscount(30);
        product.printInformation();
    }
}
