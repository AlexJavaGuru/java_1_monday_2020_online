package student_artur_martinenko.homework.lesson_10.level_3_junior.task_10;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    public static List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        Optional<Product> optionalProduct = Optional.empty();
        for (Product product : productList) {
            if(product.getTitle().equalsIgnoreCase(productTitle))
                optionalProduct = Optional.of(product);
        }
        return optionalProduct.orElse(null);
    }
}
