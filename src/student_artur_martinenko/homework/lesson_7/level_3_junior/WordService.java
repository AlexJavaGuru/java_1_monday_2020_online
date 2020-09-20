package student_artur_martinenko.homework.lesson_7.level_3_junior;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] arrayOfStrings = splitText(text);
        return mostFrequentWord(arrayOfStrings);
    }

    private String mostFrequentWord(String[] textArray) {
        String wordToReturn = textArray[0];
        int repeatedWordCount = 1;
        for (String word : textArray) {
            int tempWordCount = wordRepeatsInArray(textArray, word);
            if (repeatedWordCount < tempWordCount) {
                repeatedWordCount = tempWordCount;
                wordToReturn = word;
            }
        }
        return wordToReturn;
    }

    public int wordRepeatsInArray(String[] array, String wordToFind) {    //private
        int countTemp = 0;
        for (String word : array) {
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
