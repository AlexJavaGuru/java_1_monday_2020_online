package student_andris_tresutins.homework.lesson_10.level_3.Task_10;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
class InMemoryDatabaseOptional implements Database {

   public static List<Product> list = new ArrayList<>();

   @Override
  public void save(Product product){
       list.add(product);
   }

   @Override
   public Product findByTitle(String productTitle) {
       Optional <Product> productOptional = Optional.empty();
       for (Product product : list) {
           if (product.getTitle().equals(productTitle)) {
               productOptional = Optional.of(product);
           }
       }
       return productOptional.orElse(null);
   }
}


