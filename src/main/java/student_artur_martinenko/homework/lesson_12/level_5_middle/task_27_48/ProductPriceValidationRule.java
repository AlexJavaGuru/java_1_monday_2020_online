package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        Integer price = product.getPrice();
        if (!rule5(price)) throw new ValidationException("RULE-5", "Price can not be empty", "title");
        if (!rule6(price)) throw new ValidationException("RULE-6", "Price can not be negative or 0", "title");
    }

    //priceFieldIsNotEmpty
    public boolean rule5(Integer price) {
        return price != null;
    }

    //priceFieldNotEqualToZero
    public boolean rule6(Integer price) {
        return price > 0;
    }

}

//Task_42
/*
Создайте класс ProductPriceValidationRule:

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации цены продукта:
        К цене продукта выдвигаются следующие требования:
            - RULE-5: не должна быть пустой
            - RULE-6: должна быть больше 0
    }

}

Если срабатывает одно из правил, то создавайте объект ValidationException,
заполняйте его правильными данными и кидайте его.
 */
