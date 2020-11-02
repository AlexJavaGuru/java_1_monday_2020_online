package teacher.lesson_14.lessoncode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStoreTest {

    @Test
    public void getAllApples() {
        FruitStore fruitStore = new FruitStore();
        List<Fruit> result = fruitStore.findFruits(new AppleSearchCriteria());
        assertEquals(2, result.size());
    }

    @Test
    public void getAllPears() {

        FruitStore fruitStore = new FruitStore();
        List<Fruit> result = fruitStore.findFruits(new PearSearchCriteria());
        assertEquals(2, result.size());
    }

    @Test
    public void getAllTomatos() {
        FruitStore fruitStore = new FruitStore();
        List<Fruit> result = fruitStore.findFruits(new TomatoSearchCriteria());
        assertEquals(1, result.size());
    }
}