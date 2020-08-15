package student_artur_martinenko.homework.lesson_3.level_6;

class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double actualPrice(){
        regularPrice -= (regularPrice * (discount / 100));
        return regularPrice;
    }
    public void printInformation(){
        System.out.println("The price for product " + name + " is " +String.format("%.2f", actualPrice()) + "€");
    }
}
