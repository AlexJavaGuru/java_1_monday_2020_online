package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_8_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabaseTests {

    public static void main(String[] args) {
        InMemoryDatabaseTests test = new InMemoryDatabaseTests();
        test.inMemoryDatabaseTest();
    }

    public void inMemoryDatabaseTest() {
        Product product = new Product("Dough");
        InMemoryDatabase database = new InMemoryDatabase();
        database.save(product);
        Product findProduct = database.findByTitle("Dough");
        boolean ifExist = product.equals(findProduct);

        if (ifExist) {
            System.out.println("Product dough exist");
        } else {
            System.out.println("Product dough does not exist");
        }
    }

}
