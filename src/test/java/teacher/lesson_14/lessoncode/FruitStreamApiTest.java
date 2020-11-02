package teacher.lesson_14.lessoncode;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FruitStreamApiTest {

    @Test
    public void groupByWeight() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        Map<Integer, List<Fruit>> integerListMap = fruitStreamApi.groupByWeight();
        int a = 1;
    }

    @Test
    public void testTest() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();
        Set<String> test = fruitStreamApi.test();

        int a = 1;
    }
}