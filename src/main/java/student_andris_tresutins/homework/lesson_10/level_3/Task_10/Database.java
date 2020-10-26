package student_andris_tresutins.homework.lesson_10.level_3.Task_10;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
