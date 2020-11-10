package student_artur_martinenko.homework.lesson_14.level_1_2_intern.task_1_17;

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green") && apple.getWeight() > 150;
    }
}

//Task_11
/*
Создайте реализацию ApplePredicate для поиска тяжёлых зелёный яблок.

Протестируйте работу метода findApples() с вашим новым предикатом.
 */

//Task_12
/*
Создайте реализацию ApplePredicate для поиска тяжёлых зелёный яблок.

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}

Параметризация поведения великолепна, потому что она позволяет
вам отделить логику итерации (цикл for) коллекции для фильтрации и поведение,
применяемое к каждому элементу этой коллекции. Как следствие,
вы можете повторно использовать один и тот же метод (findApples())
и подавая в качестве параметра разные реализации интерфейса
ApplePredicate добиться разного поведения.
 */
