package student_regina_svistunov.lesson_3.level_6;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    Product (String name) {
        this.name = name;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double actualPrice() {
        regularPrice -= ((regularPrice/100)*discount);
        return regularPrice;
    }
    public void printInfomation() {
        System.out.println(name + " price is " + regularPrice + " euro. " );
    }

}
