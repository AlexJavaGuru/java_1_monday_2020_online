package student_alexander_shl.homework.lesson_3.level_6.task_26;
/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку
через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не совсем верно. Вы делаете вызов внутреннего метода, " +
        "передавая туда атрибуты, которые и так видны в области видимости этому методу" +
        "Нет смысла это делать, т.к. это просто лишний расход памяти. " +
        "Вы можете просто в вашей формуле использовать состояния объекта, которые и так доступны.")
class Product {

    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice(){
        return regularPrice*(100-discount)*0.01;
    }

    void printInformation(){
        System.out.println("Product:" + name);
        System.out.println("Regular price:" + regularPrice);
        System.out.println("Discount:" + discount);
        System.out.println("Actual price:" + actualPrice());
    }
}
