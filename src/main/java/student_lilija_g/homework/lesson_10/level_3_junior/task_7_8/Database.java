package student_lilija_g.homework.lesson_10.level_3_junior.task_7_8;

interface Database { // Нет, так как интерфейс содержит два абстрактных класса (Task_7)

    void save(Product product);

    Product findByTitle(String productTitle);
}
