package student_artur_martinenko.homework.lesson_7.level_2_intern;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] split = splitText(text);
        return mostFrequentWord(split);
    }

    private String mostFrequentWord(String[] textArray) {
        String wordToReturn = textArray[0];
        int repeatedWordCount = 1;
        for (String iterate : textArray) {
            int tempCount = wordRepeatsInArray(textArray, iterate);
            if (repeatedWordCount < tempCount) {
                repeatedWordCount = tempCount;
                wordToReturn = iterate;
            }
        }
        return wordToReturn;
    }

    public int wordRepeatsInArray(String[] arr, String wordToFind) {    //private
        int countTemp = 0;
        for (String word : arr) {
            if (word.equals(wordToFind)) {
                countTemp++;
            }
        }
        return countTemp;
    }

    private String[] splitText(String text) {
        return text.split(" ");
    }

}
