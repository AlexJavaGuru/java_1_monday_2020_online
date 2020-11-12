package student_lilija_g.homework.lesson_10.level_3_junior.task_7_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {

    private final String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
