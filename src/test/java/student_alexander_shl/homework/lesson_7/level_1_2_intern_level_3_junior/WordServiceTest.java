package student_alexander_shl.homework.lesson_7.level_1_2_intern_level_3_junior;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class WordServiceTest {

    private WordService wordService;

    @Before
    public void init() {
        wordService = new WordService();
    }

    @Test
    public void checkWordService() {
        String[] text = wordService.splitText("house garden flowers house door window house");
        String[] arrayFromText = {"house","garden","flowers","house","door","window","house"};
        Assert.assertTrue(Arrays.deepEquals(text, arrayFromText));
        Assert.assertEquals("house",wordService.mostFrequentWord(arrayFromText));
        Assert.assertEquals(3,wordService.wordCount(arrayFromText,"house"));
        Assert.assertEquals("house",wordService.findMostFrequentWord("house garden flowers house door window house"));
    }
}