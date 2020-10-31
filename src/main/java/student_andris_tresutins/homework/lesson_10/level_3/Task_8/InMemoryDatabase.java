package student_andris_tresutins.homework.lesson_10.level_3.Task_8;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
 class InMemoryDatabase implements Database {

    public static List<Product> list = new ArrayList<>();
    public static void main(String[] args) {
    }

    @Override
   public void save(Product product){
        list.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : list) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}


