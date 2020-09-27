package student_artur_martinenko.homework.lesson_8.level_1_intern.task_3;

class PersonDemo {

    public static void main(String[] args) {
        Person personOne = new Person();

        Address address = new Address("Latvia", "Riga", "Brivibas", 1, 1);
        Person personTwo = new Person("Ivan", 55, address);
    }
}
