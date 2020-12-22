package student_alexander_shl.homework.lesson_10.level_3_junior.task_7_8;
/*
Task_7:

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

interface Database {                      // не является функциональным, т.к. 2 абстракных метода

    void save(Product product);

    Product findByTitle(String productTitle);

}
