package student_andris_tresutins.homework.lesson_3.level_6;

 class Product {

    String name;
    double price;
    double discount;

    public Product(String name ){
       this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double actualPrice(){
        double s = 100 - discount;
        return (s*price)/100;
    }

    public void printInformation(){
        System.out.println("the initial price for "+ name + " is: "+ price +" the discount is: " + discount + "% and the final price is: " + actualPrice() );
    }

}
