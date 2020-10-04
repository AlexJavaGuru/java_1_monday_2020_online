package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;
/*
Продолжаем работу над системой автоматического обнаружения мошенничества.

Бизнес хочет, что бы обнаруженные мошеннические транзакции печатались на консоль
с полной информацией о них. Для этого переопределите у классов Trader и Transaction метод toString().
Воспользуйтесь переопределённым методом toString() объекта Transaction и при
обнаружении мошенничества в классе FraudDetector печатайте на консоль все свойства
транзакции (включая те которые находятся в классе Trader).
 */
class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

}
