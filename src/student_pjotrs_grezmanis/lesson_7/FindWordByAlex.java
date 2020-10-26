package student_pjotrs_grezmanis.lesson_7;

public class FindWordByAlex {
    public static void main(String[] args) {
    }
    public String findMostFrequentWord(String text) {
        String cleanedText = cleanText(text);
        String[] wordArray = splitTextIntoWordsArray(cleanedText);
        return getMostFrequentWord(wordArray);
    }
    private String getMostFrequentWord(String[] wordArray) {
        String mostFrequentWord = null;
        int maxOccurrenceWord = 0;
        for (String currentWord : wordArray) {
            int occurrenceTimes = sumWordOccurrenceInArray(currentWord, wordArray);
            if (occurrenceTimes > maxOccurrenceWord) {
                maxOccurrenceWord = occurrenceTimes;
                mostFrequentWord = currentWord;
            }
        }
        return mostFrequentWord;
    }
    private int sumWordOccurrenceInArray(String word, String[] wordArray) {
        int occurrence = 0;
        for (String wordInArray : wordArray) {
            if (word.equals(wordInArray)) {
                occurrence++;
            }
        }
        return occurrence;
    }


    private String cleanText(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        return text;
    }


    private String[] splitTextIntoWordsArray(String text) {
        String[] wordArray = text.split(" ");
        return wordArray;
    }
}
