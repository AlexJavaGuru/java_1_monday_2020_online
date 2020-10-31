package student_andris_tresutins.homework.lesson_10.level_3.Task_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
