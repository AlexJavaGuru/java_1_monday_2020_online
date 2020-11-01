package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_8_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
