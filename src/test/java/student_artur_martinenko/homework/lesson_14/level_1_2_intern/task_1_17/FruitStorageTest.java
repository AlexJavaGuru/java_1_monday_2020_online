package student_artur_martinenko.homework.lesson_14.level_1_2_intern.task_1_17;

import org.junit.Before;
import org.junit.Test;
import teacher.annotations.CodeReview;

import java.util.List;

import static org.junit.Assert.*;

@CodeReview(approved = true)
public class FruitStorageTest {
    FruitStorage fruitStorage;

    @Before
    public void setUp() {
        fruitStorage = new FruitStorage();
    }

    @Test
    public void ShouldReturnAllGreenApples() {
        List<Apple> allGreenApples = fruitStorage.findGreenApples(fruitStorage.getAllApples());
        assertEquals(3, allGreenApples.size());
    }

    @Test
    public void ShouldReturnAllRedApples() {
        List<Apple> allRedApples = fruitStorage.findRedApples(fruitStorage.getAllApples());
        assertEquals(3, allRedApples.size());
    }

    @Test
    public void ShouldReturnAllGreenApplesParameterized() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApplesParameterized = fruitStorage.findApplesByColor(allApples, "green");
        assertEquals(3, allGreenApplesParameterized.size());
    }

    @Test
    public void ShouldReturnAllRedApplesParameterized() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApplesParameterized = fruitStorage.findApplesByColor(allApples, "red");
        assertEquals(3, allGreenApplesParameterized.size());
    }

    @Test
    public void ShouldReturnApplesMoreThan100Grams() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> hundredAndMoreApples = fruitStorage.findApplesByWeight(allApples, 100);
        assertEquals(4, hundredAndMoreApples.size());

    }

    @Test
    public void ShouldReturnAllGreenApplesPredicate() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApples = fruitStorage.findApples(allApples, new AppleGreenColorPredicate());
        assertEquals(3, allGreenApples.size());
    }

    @Test
    public void ShouldReturnAllRedApplesPredicate() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allRedApples = fruitStorage.findApples(allApples, new AppleRedColorPredicate());
        assertEquals(3, allRedApples.size());
    }

    @Test
    public void ShouldReturnAllHeavyWeightApplesPredicate() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allHeavyApples = fruitStorage.findApples(allApples, new AppleHeavyWeightPredicate());
        assertEquals(4, allHeavyApples.size());
    }

    @Test
    public void ShouldReturnAllLightWeightApplesPredicate() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allHeavyApples = fruitStorage.findApples(allApples, new AppleLightWeightPredicate());
        assertEquals(4, allHeavyApples.size());
    }

    @Test
    public void ShouldReturnAllGreenAndHeavyWeightApplesPredicate() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allHeavyApples = fruitStorage.findApples(allApples, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(1, allHeavyApples.size());
    }

    @Test
    public void ShouldReturnAllGreenApplesAnonymousClass() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(3, allGreenApples.size());
    }

    @Test
    public void ShouldReturnAllRedApplesAnonymousClass() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allRedApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(3, allRedApples.size());
    }

    @Test
    public void ShouldReturnAllHeavyWeightApplesAnonymousClass() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allHeavyApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, allHeavyApples.size());
    }

    @Test
    public void ShouldReturnAllLightWeightApplesAnonymousClass() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allLightApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(4, allLightApples.size());
    }

    @Test
    public void ShouldReturnAllGreenApplesLambda() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApples = fruitStorage.findApples(allApples, apple -> "green".equals(apple.getColor()));
        assertEquals(3, allGreenApples.size());
    }

    @Test
    public void ShouldReturnAllRedApplesLambda() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allRedApples = fruitStorage.findApples(allApples, apple -> "red".equals(apple.getColor()));
        assertEquals(3, allRedApples.size());
    }

    @Test
    public void ShouldReturnAllHeavyWeightApplesLambda() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allHeavyApples = fruitStorage.findApples(allApples, apple -> apple.getWeight() > 150);
        assertEquals(4, allHeavyApples.size());
    }

    @Test
    public void ShouldReturnAllLightWeightApplesLambda() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allLightApples = fruitStorage.findApples(allApples, apple -> apple.getWeight() < 150);
        assertEquals(4, allLightApples.size());
    }

    @Test
    public void ShouldReturnAllGreenApplesAndHeavyWeightLambda() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> allGreenApples = fruitStorage.findApples(allApples, apple -> "green".equals(apple.getColor()));
        List<Apple> allGreenAndHeavyApples = fruitStorage.findApples(allGreenApples, apple -> apple.getWeight() > 150);
        assertEquals(1, allGreenAndHeavyApples.size());
    }


}

//Task_14
/*
Анонимные классы похожи на нормальные классы, о которых вы уже знаете в Java.
Но у анонимных классов нет имени. Они позволяют вам объявить и
создать экземпляр класса в одно и то же время. Другими словами,
они позволяют вам создавать специальные реализации.

List<Apple> redApples = filterApples(..., new ApplePredicate() {
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
});

При создании анонимного класса вы создаёте новый объект
(new ApplePredicate()) и объявляете его реализацию

{
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

в одно и то же время. Так как вы предоставили полную реализацию
(реализацию всех методов объявленных в этом интерфейсе, в нашем
случае это один метод test())
интерфейса ApplePredicate, то Java позволяет вам создать
экземпляр реального класса, который реализует иетерфейс ApplePredicate.
Этот класс будет анонимным (Java сама даст ему название) так как
вы сами этого не сделали (но это и не было нужно в вашем случае).

В юнит тестах попробуйте написать тесты в которых вы создадите
анонимные классы для поиска:
- зелёных яблок,
- красных яблок,
- тяжелых яблок ( > 150 г.),
- лёгких яблок ( < 150 г.).
 */

//Task_17
/*
Напишите тесты для всех предикатов с использованием лямда выражений
на подобии этого:

List<Apple> redApples = filterApples(...,
    (Apple apple) -> "red".equals(apple.getColor()));
 */