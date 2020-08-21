package student_arturs_arusanovs.lesson_3.level_1;

//Вам надо поработать над форматированием. Все уехало. Трудно читать. Начало метода должно быть выровнено до одного отступа в теле класса.
// Так же, мы в слайдах видели структуру классов. Для простоты чтения, сначала, должны идти переменные, потом конструкторы а затем методы.
public class Robot {
    public Robot(){

    }
        public void sayHello() {
        System.out.println("Hello");
    }
        public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
        private String name;
        public Robot(String robotName) {
        this.name = robotName;
    }
    }

