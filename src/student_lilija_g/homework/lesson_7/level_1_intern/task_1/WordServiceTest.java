package student_lilija_g.homework.lesson_7.level_1_intern.task_1;

public class WordServiceTest {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String myText = "“Every person had a star, every star had a friend, and for every person carrying a star there was someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart.”";
        wordService.findMostFrequentWord(myText);
    }
}
