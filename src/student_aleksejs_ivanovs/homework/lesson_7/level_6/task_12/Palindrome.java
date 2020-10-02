package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_12;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Пишите фигурные скобки у конструкций if else")
class Palindrome {

    public boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z\\\\s]", "").toLowerCase();
        char[] array = cleanText.toCharArray();

        for (int i = array.length - 1; i >= array.length / 2; i--) {
            char invertedArray = array[array.length - 1 - i];
            char normalArray = array[i];
            if (invertedArray != normalArray) {
                return false;
            }
        }
        return true;
    }
}
