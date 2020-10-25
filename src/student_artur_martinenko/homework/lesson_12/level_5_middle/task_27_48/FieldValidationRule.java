package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}

//Task_39
/*
Теперь, когда у нас есть тесты пора приступать к реализации нашего дизайна.

Создайте интерфейс

interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
 */

//Task_47
/*
Последний шаг - это рефакторинг! Наше решение протестировано и работает.
Теперь мы его можем улучшить без изменения функциональности.

В классе ProductValidatorImpl есть повторяющийся код - три блока try.
Для избавления от дублирования кода воспользуемся интерфейсом ProductValidationRule:

class ProductValidatorImpl implements ProductValidator {

    private List<ProductValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (ProductValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }

}

Убедитесь, что после нашего рефакторинга все тесты по прежнему проходят!

Поздравляем, вы успешно завеншили разработку прототипа функциональности
по валидации данных продукта! Вы большие молодцы!
 */

//Task_48
/*
Последний шаг - это рефакторинг! Наше решение протестировано и работает.
Теперб мы его можем улучшить без изменения функциональности.

В классе ProductValidatorImpl есть повторяющийся код - три блока try:

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
        this.descriptionValidationRule = descriptionValidationRule;
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            priceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            descriptionValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}

Придумайте способ как упростить этот код!
 */

