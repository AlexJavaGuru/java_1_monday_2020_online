package student_dmitry_vasiliev.lesson_8.level_5;

abstract class Shape {

        private String title;

        Shape(String title) {
            this.title = title;
        }
        Shape() {

        }
        abstract String name();
        abstract double calculateArea();
        abstract double calculatePerimeter();

    }



