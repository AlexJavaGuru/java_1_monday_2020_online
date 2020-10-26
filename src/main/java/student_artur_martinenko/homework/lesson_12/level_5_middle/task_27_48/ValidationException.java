package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import java.util.Objects;

class ValidationException extends Exception {
    private String ruleName;
    private String description;
    private String fieldName;
    // (Product: title, price, description),


    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }
}

//Task_30
/*
Какое место в общей картине занимает разрабатываемое нами решение?

Очевидно, что разрабатываемый нами процесс валидации вводимых данных
не может существовать в системе сам по себе. Как тогда в него будут попадать
вводимые пользователями данные? Кому будет нужен результат нашей проверки?
Очевидно, что в системе помимо нашего решения будут и другие компоненты.
Например UI (User Interface) через который работники интернет магазина будут
вводить данные о новых продуктах. Конечно будут и другие части приложения,
такие как база данных и бизнес логика.

Кто будет пользоваться нашим решением?
Скорее всего нашим решением будет пользоваться UI. Как? Например:
- сотрудник магазина ввёл данные о новом продукте в форму на UI
- UI будет обращаться к нашей валидации за проверкой введённых данных
- если данные удовлетворяют всем критериям, то их можно сохранить в системе
- если в введённых данных есть ошибки о них UI должен будет сообщить сотруднику
  (показать эти ошибки на экране) и попросить сотрудника магазина исправить
  вводимые им данные, сотрудник магазина исправляет данные, система их снова
  проверяет и если всё хорошо то отправляет эти данные на сохранение например
  в базу данных и на обработку бизнес логикой.

Что хотят получить от нашего решения те кто будет им пользоваться?
Что хочет получить от нашего решения UI?

Тут очевидно возможны два сценария:
1. Данные прошли валидацию, ошибок нет.
2. Данные не прошли валидацию, ошибоки есть. В этом случае UI должна показать
   эти ошибки пользователю таким образом, что бы он понял что не так с данными
   и смог их корректно исправить.

Разработайте класс ValidationException. Цель этого класса описать
одну ошибку валидации. Данный класс должен содержать всю необходимую
информацию об ошибке валидации, что бы UI смог корректно её показать на форме.
 */

//Task_31
/*
Возможное решение для класса ValidationException:

class ValidationException extends Exception {

    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;

    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fieldName;

    // создайте конструктор

    // создайте только get

}
 */