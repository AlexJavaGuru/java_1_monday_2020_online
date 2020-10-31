package student_artur_martinenko.homework.lesson_10.level_3_junior.task_8;

import teacher.annotations.CodeReview;

/*
Создайте реализацию следующего интерфейса.
Класс должен называться InMemoryDatabase и сохранять продукты в памяти
используя для этого массив или список.

Если продукт не найден при поске то вернуть null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.

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

} */
@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
