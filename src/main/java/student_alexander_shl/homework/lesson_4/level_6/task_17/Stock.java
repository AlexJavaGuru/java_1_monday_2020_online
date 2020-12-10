package student_alexander_shl.homework.lesson_4.level_6.task_17;
/*
Необходимо реализовать класс Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Класс Stock должен обладать следующими характеристиками:

Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice()
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().

Написать тестовые сценарии для класса Stock в классе StockTest.


10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27


Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

После выполнения кода вывод в консоли должет быть следующим:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
 */

public class Stock {

    String companyName;
    double currentPrice;
    double maxPrice;
    double minPrice;

    Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    public void updatePrice(double newPrice) {

        currentPrice = newPrice;

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void getPriceInformation() {
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max price = " + maxPrice);
    }
}
