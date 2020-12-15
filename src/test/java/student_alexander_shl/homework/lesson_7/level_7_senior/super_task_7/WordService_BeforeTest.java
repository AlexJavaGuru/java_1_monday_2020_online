package student_alexander_shl.homework.lesson_7.level_7_senior.super_task_7;

import org.junit.Assert;
import org.junit.Test;

public class WordService_BeforeTest {

    public WordService_Before wordService;

    @Test
    public void checkWordService() {
        wordService = new WordService_Before();
        Assert.assertEquals("house", wordService.findMostFrequentWord("house garden flowers house door window house"));
    }
}