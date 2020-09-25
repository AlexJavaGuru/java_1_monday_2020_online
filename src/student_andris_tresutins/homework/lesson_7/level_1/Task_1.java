package student_andris_tresutins.homework.lesson_7.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;


@CodeReview(approved = false)
@CodeReviewComment(comment = "Fix the format. To be honest, returning a sentence is the bad idea in programming. It is very unreliable structure. Please, return only the word. And fix tests" +
        "+1 for using collections.")
class Task_1 {




    public String findMostFrequentWord(String text) {
       //text = "a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.";
        String[] splitText = text.split(" " );

        HashMap<String, Integer> wordCount = new HashMap<>();
        for ( int i = 0 ; i < splitText.length ; i++ ) {
           if (!wordCount.containsKey(splitText[i])) {
                wordCount.put(splitText[i], 1);
           }else{
               int newCount;
               newCount = wordCount.get(splitText[i]);
               newCount ++;
               wordCount.put(splitText[i], newCount);
               }
           }

        //find the highest occurence of a word
        String highestOcurrance = "";
        int max = 0;
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(max < entry.getValue()){
                max = entry.getValue();
                highestOcurrance ="word: " + entry.getKey() + " occurs: " + max + " times" ;}



        }
        return highestOcurrance;
    }

}
