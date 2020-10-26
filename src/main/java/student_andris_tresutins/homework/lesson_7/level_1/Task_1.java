package student_andris_tresutins.homework.lesson_7.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;


@CodeReview(approved = false)
@CodeReviewComment(comment = "Please read the task carefully. The authors want you to split the task into good named, understandable methods." +
        "It's very hard to read your code here. Please try refactoring")
class Task_1 {


    public String findMostFrequentWord(String text) {
        //text = "a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.";
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

        //find the highest occurrence of a word
        String highestOccurrence = "";
        int max = 0;
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
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
