package student_andris_tresutins.homework.lesson_10.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_7 {
    /*
    Является ли следующий интерфейс функциональным?

    interface Database {

        void save(Product product);

        Product findByTitle(String productTitle);

    }


    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

    }
    */

    // The Database interface doesnt follow the Functional interface principles
    // and the class Product doesnt use a lambda expression
}
