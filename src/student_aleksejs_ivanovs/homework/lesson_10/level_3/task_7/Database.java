package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_7;

/*Является ли следующий интерфейс функциональным?

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

}*/

interface Database {   // No this is not a functional interface because there are two abstract methods

    void save(Product product);

    Product findByTitle(String productTitle);

}
