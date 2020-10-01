package student_dmitry_vasiliev.lesson_7;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Смотреть коммент WordService")
class WordServiceDemo {

    public static void main(String[] args) {
        WordService words = new WordService();

        String sentence = "Operators with higher precedence are, evaluated before " +
                "operators with relatively lower precedence.";
        words.findEntryMaxNumber(words.wordMaxEntry(words.arrayOfWord(words.changeDotCommToEmpty(sentence))));
        words.printWord(sentence,words.arrayOfWord(words.changeDotCommToEmpty(sentence)),
                words.findEntryMaxNumber(words.wordMaxEntry
                        (words.arrayOfWord(words.changeDotCommToEmpty(sentence)))));
    }
}
