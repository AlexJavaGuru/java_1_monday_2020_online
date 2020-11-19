package student_andris_tresutins.homework.lesson_7.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;


@CodeReview(approved = false)
@CodeReviewComment(comment = "Please read the task carefully. The authors want you to split the task into good named, understandable methods." +
        "It's very hard to read your code here. Please try refactoring" +
        "" +
        "Андрис, нужно разбить эту логику на два метода. Вы уже близко =)")
class Task_1 {


    public HashMap<String, Integer> createHashMapOfWords(String text) {

        String[] splitText = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < splitText.length; i++) {

            if (!wordCount.containsKey(splitText[i])) {
                wordCount.put(splitText[i], 1);
            } else {
                int newCount;
                newCount = wordCount.get(splitText[i]);
                newCount++;
                wordCount.put(splitText[i], newCount);
            }
        }
        return wordCount ;
    }

    public String findMostFrequentWord(String text) {

        String highestOccurrence = "";

        int max = 0;

        for (HashMap.Entry<String, Integer> entry : createHashMapOfWords(text).entrySet()) {

            if(max == entry.getValue()) {
                highestOccurrence += " " + entry.getKey();
            }
            else if(max < entry.getValue()) {
                max = entry.getValue();
                highestOccurrence = entry.getKey();
            }

        }
        return highestOccurrence;
    }

}
