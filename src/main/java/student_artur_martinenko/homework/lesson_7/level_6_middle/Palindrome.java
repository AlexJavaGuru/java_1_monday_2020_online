package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Palindrome {

    boolean isPalindrome(String text) {
        String noSpacesAndComas = removeSpacesAndComas(text);
        char[] arrayChar = stringToCharArray(noSpacesAndComas);
        return checkingPalindrome(arrayChar);
    }

    public boolean checkingPalindrome(char[] arrayChar) {
        for (int i = 0; i < arrayChar.length / 2; i++) {
            if (arrayChar[i] != arrayChar[arrayChar.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public String removeSpacesAndComas(String text) {
        String noComas = text.replace(",", "");
        String noSpacesAndComas = noComas.replace(" ", "");
        return noSpacesAndComas.toLowerCase();
    }

    public char[] stringToCharArray(String text) {
        return text.toCharArray();
    }


}
