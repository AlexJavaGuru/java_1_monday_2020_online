package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import teacher.annotations.CodeReview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@CodeReview(approved = true)
class ProductTitleValidationRule implements FieldValidationRule {

    public static final int TITLE_MIN_LENGTH = 3;
    public static final int TITLE_MAX_LENGTH = 100;

    @Override
    public void validate(Product product) throws ValidationException {
        String title = product.getTitle();
        if (!rule1(title)) throw new ValidationException("RULE-1", "Title can not be empty", "title");
        if (!rule2(title)) throw new ValidationException("RULE-2", "Title can not be less then 3 symbols", "title");
        if (!rule3(title)) throw new ValidationException("RULE-3", "Title can not be more than 100 symbols", "title");
        if (!rule4(title)) throw new ValidationException("RULE-4", "Title can contain only numbers and " +
                                                                    "LATIN letters only", "title");
    }

    //titleFieldIsNotEmpty
    private boolean rule1(String name) {
        return name != null && !name.isEmpty();
    }

    //titleFieldIsNotShort
    private boolean rule2(String name) {
        return name.length() >= TITLE_MIN_LENGTH;
    }

    //titleFieldIsNotLong
    private boolean rule3(String name) {
        return name.length() <= TITLE_MAX_LENGTH;
    }

    //titleFieldHasValidCharacters
    private boolean rule4(String name) {
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return !matcher.find();
    }

//    public static void main(String[] args) {
//        ProductTitleValidationRule victim = new ProductTitleValidationRule();
//        boolean flag = victim.rule4("asdfg987ф4");
//        System.out.println(flag);
//    }


}

//Task_40
/*
Создайте класс ProductTitleValidationRule:

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации названия продукта:
        К названию продукта выдвигаются следующие требования:
            - RULE-1: не должно быть пустым
            - RULE-2: не должно быть короче 3 символов
            - RULE-3: не должно быть длиннее 100 символов
            - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
    }

}

Если срабатывает одно из правил, то создавайте объект ValidationException,
заполняйте его правильными данными и кидайте его.
 */


