package student_alexander_shl.homework.lesson_3.level_6.task_28;

import teacher.annotations.CodeReview;

/*
Дописать код программы, что бы она запускалась
и выводила на консоль производителя и модель компьютера.
Менять можно только класс Computer.

class Computer {

    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}

 */
@CodeReview(approved = true)
class Computer {

    public String manufacturer;
    public String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
