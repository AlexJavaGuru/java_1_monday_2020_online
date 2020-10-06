package student_artur_martinenko.homework.lesson_8.level_1_intern.task_3;

class Address {
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int aptNumber;

    public Address(String country, String city, String street, int houseNumber, int aptNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.aptNumber = aptNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", aptNumber=" + aptNumber +
                '}';
    }
}
