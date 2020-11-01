package student_artur_martinenko.homework.lesson_10.level_3_junior.task_8;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    public static List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productList) {
            return product.getTitle().equalsIgnoreCase(productTitle) ? product : null;
        }
        return null;
    }
}
