package student_aleksejs_ivanovs.homework.lesson_3.level_6.task_26;

class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Toilet paper");
        product.setRegularPrice(2.50);
        product.setDiscount(10);
        product.printInformation();
    }
}
