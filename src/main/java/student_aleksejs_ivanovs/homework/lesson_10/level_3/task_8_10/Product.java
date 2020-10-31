package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_8_10;

import teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

}
