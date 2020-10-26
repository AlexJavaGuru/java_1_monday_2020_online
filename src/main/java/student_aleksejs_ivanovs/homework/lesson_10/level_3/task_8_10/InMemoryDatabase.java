package student_aleksejs_ivanovs.homework.lesson_10.level_3.task_8_10;

/*  Task_8
Создайте реализацию следующего интерфейса.
Класс должен называться InMemoryDatabase и сохранять продукты в памяти
используя для этого массив или список.

Если продукт не найден при поске то вернуть null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}*/
//-------------------------------------------------------------------------------------------------------------------\\
/*  Task_10
В предыдущем задании вы познакомились с классом Optional и узнали для чего он применяется.

Примените Optional для возвращаемого значения метода findByTitle() интерфейса Database.
Сделайте в коде интерфейса необходимые изменения, а так же реализуйте
новую версию этого интерфейса и протестируйте её.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database{

    private List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        /*for (Product product : productList) {
            return product.getTitle().equals(productTitle) ? product : null;
        }
        return null;*/

        //  Task_10
        Optional<Product> optionalProduct = Optional.empty();
        for (Product product : productList) {
            if(product.getTitle().equals(productTitle))
                optionalProduct = Optional.of(product);
        }
        return optionalProduct.orElse(null);
    }

}
