package student_artur_martinenko.homework.lesson_14.level_1_2_intern.task_1_17;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    //Task_1
    public List<Apple> findGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
//    public List<Apple> getAllGreenApples(List<Apple> appleList){
//        return appleList.stream()
//                .filter(apple -> "green".equals(apple.getColor()))
//                .collect(Collectors.toList());
//    }

    //Task_2
    public List<Apple> findRedApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
//    public List<Apple> getAllRedApples(List<Apple> appleList){
//        return appleList.stream()
//                .filter(apple -> "red".equals(apple.getColor()))
//                .collect(Collectors.toList());
//    }

    //Task_4
    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    //Task_6
    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}


//Task_1
/*
Хорошо известная проблема в разработке программного обеспечения
состоит в том, что независимо от того, что вы делаете,
требования пользователя меняются.

Например, представьте приложение, которое поможет фермеру
исследовать его запасы.

class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

}

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }


}

Первое требование фермера:
найти все зеленые яблоки в своем складе.

В классе FruitStorage создайте метод для реализации этого требования.

Создайте класс FruitStorageTest и напишите юнит тест
опираясь на данные из FruitStorage.getAllApples().
 */

//Task_2
/*
Первая попытка реализации требование фермера:
найти все зеленые яблоки в своем складе.

class FruitStorage {

    public List<Apple> findGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

}

Метод findGreenApples() очень понравился фермеру.
Его следующее требование:
найти все красные яблоки в своем складе.

Что вы будете делать?.
 */

//Task_3
/*
Метод findGreenApples() очень понравился фермеру.
Его следующее требование:
найти все красные яблоки в своем складе.

Наивный подход - это создание копии метода findGreenApples()
только для поиска красных яблок findRedApples():

class FruitStorage {

    public List<Apple> findGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findRedApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

}

А что если фермер захочет найти яблоки других цветов:
желтый, оранжевый, тёмно красный и так далее?

Каждый раз копировать один и тот же код - это очень плохой
стиль разработки программного обеспечения.

Есть ли более лучшее решение?

Да есть! Параметризация цвета. Вместо копирования методов,
вынесите в параметр цвет яблок, который нужно найти.
 */

//Task_4
/*
А что если фермер захочет найти яблоки других цветов:
желтый, оранжевый, тёмно красный и так далее?

Каждый раз копировать один и тот же код - это очень плохой
стиль разработки программного обеспечения.

Есть ли более лучшее решение?

Да есть! Параметризация цвета яблока. Вместо копирования методов,
вынесите в параметр цвет яблок, который нужно найти.

class FruitStorage {

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

}

Теперь с помощью этого метода вы можете искать яблоки разных цветов:
List<Apple> greenApples = filterApplesByColor(inventory, "green");
List<Apple> redApples = filterApplesByColor(inventory, "red");

С помощью юнит тестов убедитесь, что метод filterApplesByColor()
работает правильно.
 */

//Task_5
/*
Фермер возвращается к вам и говорит:
было бы действительно здорово различать легкие яблоки и тяжелые яблоки.
Тяжелые яблоки как правило, имеют вес более 150 г.

Ваше чутьё подсказывает вам, что вес тяжёлых яблок может меняться.
И вообще фермер может в будущем захотеть отбирать яблоки задавая
разный вес.

Используя эту догадку напишите решение для этой задачи и протестируйте его.
 */

//Task_6
/*
Требование фермера:
было бы действительно здорово различать легкие яблоки и тяжелые яблоки.
Тяжелые яблоки как правило, имеют вес более 150 г.

Проанализировав требования фермера вы решили создать метод
findApplesByWeight(), который будет отбирать яблоки, которые
весят тяжелее указанного в параметре веса.

class FruitStorage {

    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

}

Это хорошее решение, но обратите внимание, как вы должны были
дублировать большую часть реализации для обход списка яблок
и применение критериев фильтрации для каждого яблока.
Это несколько разочаровывает, потому что нарушает принцип
программного обеспечения DRY (Do not Repeat Yourself - не повторяйся).
 */

//Task_10
/*
Но как мы можем использовать различные реализации ApplePredicate?
Нам нужен метод filterApples() с параметром ApplePredicate
для проверки условий. Это и есть параметризация поведения:
способность сказать методу, чтобы он принимал несколько поведений
(или стратегий) в качестве параметров и использовал их
внутри для достижения различного поведения.

class FruitStorage {

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}

Напишите юнит тесты на метод findApples() в которых
протестируйте работу метода с разными предикатами:
- findApples(...., new AppleGreenColorPredicate());
- findApples(...., new AppleRedColorPredicate());
- findApples(...., new AppleHeavyWeightPredicate());
- findApples(...., new AppleLightWeightPredicate());
 */