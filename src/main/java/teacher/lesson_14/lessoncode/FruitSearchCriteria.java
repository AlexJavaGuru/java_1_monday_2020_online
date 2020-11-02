package teacher.lesson_14.lessoncode;

@FunctionalInterface
public interface FruitSearchCriteria {

    boolean test(Fruit fruit);

}

class AppleSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}

class PearSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "pear".equals(fruit.getTitle());
    }
}

class TomatoSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle());
    }
}

class RedTomatoWithWeightSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle()) &&
                "red".equals(fruit.getColor()) &&
                fruit.getWeight() > 100;
    }
}