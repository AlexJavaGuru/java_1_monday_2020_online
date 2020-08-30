package student_elizabete_ket.homework.lesson_3.level_6.task_26;
//Форматирование страдает опять

class Product {

    private String productName = "Cat";
    private double regularPrice;
    private double discount;

    Product (double regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.discount = discount;
    }


        public double actualPrice(double regularPrice, double discount) {
            double actualPrice = regularPrice - (regularPrice * (discount / 100));
            return actualPrice;
        }
        public void  printInformation() {
        System.out.println("Product name is " + productName);
        System.out.println("Product regular price is " + regularPrice);
        System.out.println("Discount is " + discount);
        System.out.println("Product actual price is " + actualPrice(regularPrice, discount));
        }





}
