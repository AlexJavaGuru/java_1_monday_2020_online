package student_artur_martinenko.homework.lesson_10.level_3_junior.task_6;

/*
Что такое функциональный интерфейс в Java?

Найдите в интернете информацию об этом.
Придумайте и реализуйте его в виде программного кода.
В коментарии в коде напишите ответ на вопрос.
 */
class PizzaImplementation implements CreatePizza {

    @Override
    public void createPizzaWithToppings() {
        System.out.println("Functional interface is such interface which contain only " +
                "one abstract and unimplemented method.");
        System.out.println("Making tasty pizza with toppings.");
    }
}
