package student_aleksejs_ivanovs.homework.lesson_10.level_2.task_4_5;

/*   Task_5
Создайте класс DayOfTheWeekDetectorDemo.

Цель этой программы:
- запросить у пользователя число;
- с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
- вывести на консоль найденное название.

В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
имплементация интерфейса, которую программа должна использовать для нахождения названия
дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
чтобы использовать её в дальнейшем.

В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.

Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
из трёх имплементаций интерфейса.

Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.

Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.*/

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayDetector) {
        this.dayDetector = dayDetector;
    }

    public void run() {
        System.out.print("Enter the number of the week day : ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        System.out.println("Day number : " + dayNumber + ", equals : " + dayDetector.detectDayName(dayNumber));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifDetector.run();

        DayOfTheWeekDetectorDemo switchDetector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchDetector.run();
    }

}
