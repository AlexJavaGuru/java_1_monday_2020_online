package student_artur_martinenko.homework.lesson_10.level_3_junior.task_10;

import teacher.annotations.CodeReview;

import java.util.Optional;

/*
В предыдущем задании вы познакомились с классом Optional и узнали для чего он применяется.

Примените Optional для возвращаемого значения метода findByTitle() интерфейса Database.
Сделайте в коде интерфейса необходимые изменения, а так же реализуйте
новую версию этого интерфейса и протестируйте её.

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
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
