package student_dmitry_vasiliev.lesson_3.homework.Level_6;

public class Product {

    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.discount = discount;
        this.regularPrice = regularPrice;
    }
        public void printInformation() {
            System.out.println(name + " regular price " + regularPrice + " eur, discount " + discount + " %.");
    }

    }

