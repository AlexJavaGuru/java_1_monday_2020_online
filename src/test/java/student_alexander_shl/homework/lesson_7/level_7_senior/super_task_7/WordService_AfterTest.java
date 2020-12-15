package student_alexander_shl.homework.lesson_7.level_7_senior.super_task_7;

import org.junit.Assert;
import org.junit.Test;

public class WordService_AfterTest {

    public WordService_After wordService;

    @Test
    public void checkWordService() {
        wordService = new WordService_After();
        Assert.assertEquals("house", wordService.findMostFrequentWord("house garden flowers house door window house"));
    }

}