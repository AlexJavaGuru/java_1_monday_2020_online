package student_artur_martinenko.homework.lesson_10.level_3_junior.task_7;

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
interface Database {

    //this interface is not functional because it has two abstract methods.
    void save(Product product);

    Product findByTitle(String productTitle);

}
