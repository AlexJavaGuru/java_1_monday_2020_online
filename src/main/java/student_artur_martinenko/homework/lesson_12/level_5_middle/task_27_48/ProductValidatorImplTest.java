package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
class ProductValidatorImplTest {
    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
            new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.multiRuleTest_v1();
        test.multiRuleTest_v2();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("aa", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule2");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be less then 3 symbols"), "rule2");
    }

    public void rule3_v1() {
        String productTitle = fillTest(100);
        Product product = new Product(productTitle, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule3");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be more than 100 symbols"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("_ti$t%lЖe", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule4");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResults(exceptions.get(0).getDescription().equals("Title can contain " +
                "only numbers and LATIN letters only"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("test", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule5");
        checkResults(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("test", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule6");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule6");
        checkResults(exceptions.get(0).getDescription().equals("Price can not be negative or 0"), "rule6");
    }

    public void rule7_v1() {
        String productDescription = fillTest(2000);
        Product product = new Product("test", 1, productDescription);
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule7");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule7");
        checkResults(exceptions.get(0).getDescription().equals("Description can not be more than 2000 symbols"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("test", 1, "dЖescri@pt%io!n");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule8");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule8");
        checkResults(exceptions.get(0).getDescription().equals("Description can contain " +
                "only numbers and LATIN letters only"), "rule8");
    }

    public void multiRuleTest_v1() {
        Product product = new Product("te", 0, "dЖescri@pt%io!n");
        List<ValidationException> exceptions = validator.validate(product);
        ValidationException titleException = new ValidationException("RULE-2", "Title can not be less then 3 symbols", "title");
        ValidationException priceException = new ValidationException("RULE-6", "Price can not be negative or 0", "title");
        ValidationException descriptionException = new ValidationException("RULE-8", "Description can contain " +
                "only numbers and LATIN letters only", "title");
        checkResults(exceptions.contains(titleException), "multiRuleTest_v1 - rule1");
        checkResults(exceptions.contains(priceException), "multiRuleTest_v1 - rule6");
        checkResults(exceptions.contains(descriptionException), "multiRuleTest_v1 - rule8");
    }

    public void multiRuleTest_v2() {
        String productDescription = fillTest(2000);
        Product product = new Product("", null, productDescription);
        List<ValidationException> exceptions = validator.validate(product);
        ValidationException titleException = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException priceException = new ValidationException("RULE-5", "Price can not be empty", "title");
        ValidationException descriptionException = new ValidationException("RULE-7", "Description can not be more than 2000 symbols", "title");
        checkResults(exceptions.contains(titleException), "multiRuleTest_v2 - rule1");
        checkResults(exceptions.contains(priceException), "multiRuleTest_v2 - rule5");
        checkResults(exceptions.contains(descriptionException), "multiRuleTest_v2 - rule7");
    }


    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    private String fillTest(int textLength) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i <= textLength; i++) {
            text.append("o");
        }
        return text.toString();
    }


}

//Task_38
/*
К названию продукта выдвигаются следующие требования:
- RULE-1: не должно быть пустым
- RULE-2: не должно быть короче 3 символов
- RULE-3: не должно быть длиннее 100 символов
- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- RULE-5: не должна быть пустой
- RULE-6: должна быть больше 0

К описанию продукта выдвигаются следующие требования:
- RULE-7: не должно быть длиннее 2000 символов
- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы


Класс ProductValidatorImplTest и примеры тестов на все требования:

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl();

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        // тесты на остальные правила допишите по аналогии
        // тестов будет много! напишите их все!
        // они пишутся легко, и если вы напишите их все то ваше решение будет полностью протестировано!
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }


    private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}
 */

//Task_46
/*
Убедитесь, что вы не забыли написать тесты, когда в данных есть много ошибок.

Например:
- не правильно указано название продукта и его цена
- не правильно указано название продукта и его описание
- и так далее
- не правильно указаны все три свойства!

Во всех этих случаях валидация будет возвращать список в котором будет
указана больше чем одна ошибка. Так как порядок, в котором должны лежать
ошибки в списке нигде не описан, это значит, что в тестах нельзя завязываться
на то в каком порядке ошибки будут указаны в списке. Нас должно интересовать
есть ли нужная нам ошибка в списке или ее нет, а под каким индексом в списке
она расположена нас не должно интересовать. Для этого мы можем воспользоваться
методом списка contains(), с помощью которого можно проверить есть ли
указанный объект в списке или нет. Для правильной работы метода contains()
необходимо переопределить метод equals() в классе Product. Если вы этого
еще не сделали то сделайте это.

Напишите автоматические тесты на выше указанные сценарии.
 */
