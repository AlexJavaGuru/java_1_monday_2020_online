package student_elizabete_ket.homework.lesson_3.level_6.task_26;
//Форматирование страдает опять
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
