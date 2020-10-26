package student_lilija_g.homework.lesson_10.level_3_junior.task_7_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database {

    public static List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
