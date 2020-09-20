package student_artur_martinenko.homework.lesson_7.level_1_intern;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] split = text.split(" ");
        String wordToReturn = split[0];
        int repeatedWordCount = 1;
        for (String iterate : split) {
            int tempCount = wordRepeatsInArray(split, iterate);
            if (repeatedWordCount < tempCount) {
                repeatedWordCount = tempCount;
                wordToReturn = iterate;
            }
        }
        return wordToReturn;
    }

    public int wordRepeatsInArray(String[] arr, String wordToFind) {
        int countTemp = 0;
        for (String word : arr) {
            if (word.equals(wordToFind)) {
                countTemp++;
            }
        }
        return countTemp;
    }

}
