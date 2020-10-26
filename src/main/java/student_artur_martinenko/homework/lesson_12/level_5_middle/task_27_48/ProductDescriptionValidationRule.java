package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProductDescriptionValidationRule implements FieldValidationRule{

    public static final int DESCRIPTION_MAX_LENGTH = 2000;

    @Override
    public void validate(Product product) throws ValidationException {
        String description = product.getDescription();
        if (!rule7(description)) throw new ValidationException("RULE-7", "Description can not be more than 2000 symbols",
                "title");
        if (!rule8(description)) throw new ValidationException("RULE-8", "Description can contain " +
                "only numbers and LATIN letters only", "title");
    }

    //descriptionFieldIsNotLong
    public boolean rule7(String description){
        return description.length() <= DESCRIPTION_MAX_LENGTH;
    }

    //titleFieldHasValidCharacters
    public boolean rule8(String description){
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(description);
        return !matcher.find();
    }



}

//Task_44
/*
Создайте класс ProductDescriptionValidationRule:

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации описания продукта:
        К описанию продукта выдвигаются следующие требования:
            - RULE-8: не должно быть длиннее 2000 символов
            - RULE-9: должно содержать только английские буквы и цифры, другие символы не допустимы
    }

}

Если срабатывает одно из правил, то создавайте объект ValidationException,
заполняйте его правильными данными и кидайте его.
 */
