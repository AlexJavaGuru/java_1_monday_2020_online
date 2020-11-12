package student_lilija_g.homework.lesson_3.level_6.task_26;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Product {
    /*
        Свойства:
                - Наименование (String name)
    - Стандартная цена (double regularPrice)
    - Скидка в процентах (double discount)

        Методы:
                1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
        Вывод информации о продукте в консоль (void printInformation())1P
    2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
    */
    String productName; // Я просто по началу думала, что так можно устанавливать default значение для переменных :((( Но не списывала...
    double regularPrice;
    double discount;

    Product(String productName, double regularPrice, double discount) {
        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice(double regularPrice, double discount) {
        return (regularPrice * discount / 100);
    }

    void printInformation() {
        System.out.println("Product name: " + '"' + productName + '"');
        System.out.println("Regular price: " + regularPrice + " €");
        System.out.println("Discount: " + discount + "% \n");
        System.out.println("Actual price: " + actualPrice(regularPrice, discount) + " €");
    }

}
