package student_elizabete_ket.homework.lesson_3.level_6.task_28;

 class Computer {
     //Дописать код программы, что бы она запускалась
     //и выводила на консоль производителя и модель компьютера.
     //Менять можно только класс Computer.

     private String manufacturer;
     private String model;

     public Computer(String manufacturer, String model) {
         this.manufacturer = manufacturer;
         this.model = model;
     }

     public String getManufacturer() {
         return manufacturer;
     }

     public String getModel () {
         return model;
     }
}
