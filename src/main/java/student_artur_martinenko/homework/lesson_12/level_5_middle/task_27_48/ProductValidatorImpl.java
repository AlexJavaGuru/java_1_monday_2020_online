package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class ProductValidatorImpl implements ProductValidator {

    private List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();

        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }

}

//Task_34
/*
Создайте класс ProductValidatorImpl который реализует интерфейс ProductValidator.

Приведём ещё раз все выбвинутые на данный момент требования к валидации:

К названию продукта выдвигаются следующие требования:
- не должно быть пустым
- не должно быть короче 3 символов
- не должно быть длиннее 100 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- не должна быть пустой
- должна содержать только цифры
- не может быть 0

К описанию продукта выдвигаются следующие требования:
- не должно быть длиннее 2000 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы


Что вы будете делать дальше после того как внешний интерфейс системы уже определён?
 */

//Task_37
/*
Дизайн решения мы придумали.

Теперь пришло время ... написать тесты (acceptance tests)! :)

Почему бы и нет? Давайте попробуем воспользоваться такой техникой
как TDD - Test Driven Design. Напиши тесты сначала, а потом пиши сам код.

Создайте класс ProductValidatorImpl implements ProductValidator {

    List<ValidationException> validate(Product product) {
        return null; // просто что бы код компилировался
    }

}

Создайте класс ProductValidatorImplTest и напишите тесты на все требования
(все тесты будут фейлиться - это нормально, у нас же нет имплементации):

К названию продукта выдвигаются следующие требования:
- не должно быть пустым
- не должно быть короче 3 символов
- не должно быть длиннее 100 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- не должна быть пустой
- должна содержать только цифры
- не может быть 0

К описанию продукта выдвигаются следующие требования:
- не должно быть длиннее 2000 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы

При написании тестов перед написанием кода заставляет вас думать о самом
бизнес требовании, а не о его реализации в коде. Это две разне вещи!
Если нет кода, то при написании теста вы пользуетесь только выбвинутыми
требованиями. Ваши тесты будут отображать/фиксировать требования, которым
должно удовлетворять ваше решение. Это и есть acceptance tests! Самые лучшие
тесты, которые только возможны. Тесты фиксирующие бизнес требования к вашему
программному обеспечению.

Напишите тесты на все требования указанные выше!

Дайте каждому правилу своё название, например: Rule_1, Rule_2, etc.
Оно вам потребуется, так как объект ValidationException должен содержать
название правила.
 */

//Task_41
/*
Добавьте класс ProductTitleValidationRule в класс ProductValidatorImpl
как зависимость следующим образом:

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}

Убедитесь, что тесты, которые относятся к названию продукта начали проходить.
 */

//Task_43
/*
Добавьте класс ProductPriceValidationRule в класс ProductValidatorImpl
как зависимость следующим образом:

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;
    private ProductPriceValidationRule priceValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
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
        return exceptions;
    }

}

Убедитесь, что тесты, которые относятся к цене продукта начали проходить.
 */

//Task_45
/*
Добавьте класс ProductDescriptionValidationRule в класс ProductValidatorImpl
как зависимость следующим образом:

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

Убедитесь, что тесты, которые относятся к описанию продукта начали проходить.
 */


