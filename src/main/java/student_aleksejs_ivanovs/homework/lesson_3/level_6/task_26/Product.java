package student_aleksejs_ivanovs.homework.lesson_3.level_6.task_26;

class Product {

    public String name;
    public double regularPrice;
    public double discount;

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
        regularPrice = ((100 - discount) * regularPrice / 100);
        return regularPrice;
    }
    public void printInformation(){
        System.out.println(name + " cost " + actualPrice() + " €");
    }
}
