package student_andris_tresutins.homework.lesson_14.level_1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {


    @Test
    public void findGreenApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> result = victim.findGreenApples();
        assertEquals(3,result.size());
    }

    @Test
    public void findRedApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> result = victim.findRedApples();
        assertEquals(3,result.size());

    }

    @Test
    public void findColorApples(){
        FruitStorage victim = new FruitStorage();
        List<Apple> result = victim.filterApplesByColor("yellow");
        assertEquals(2,result.size());

    }

    @Test
    public void filterApplesLightApples(){
        FruitStorage victim = new FruitStorage();
        List<Apple> result = victim.filterLightApples();
        assertEquals(4,result.size());

    }

    @Test
    public void filterHeavyApplesByWeight(){
        FruitStorage victim = new FruitStorage();
        List<Apple> result = victim.filterHeavyApplesByWeight(160);
        assertEquals(3,result.size());

    }
}