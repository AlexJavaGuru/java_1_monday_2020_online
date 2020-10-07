package student_pjotrs_grezmanis.lesson_7.level_1;

class WordService {
    public static void main(String[] args) {
        WordService task = new WordService();

        String result = task.findMostFrequentWord(" Hey, Hey, java программист java intern ");
        System.out.println(result);
    }

    public String findMostFrequentWord(String text) {
        String[] wordArray = text.split(" ");
        String mostFrequentWord = null;
        int maxOccurrenceWord = 0;
        for (int i = 0; i < wordArray.length; i++) {
            String currentWord = wordArray[i];
            int occurrence = 0;
            for (int j = 0; j < wordArray.length; j++) {
                if (currentWord.equals(wordArray[j])) {
                    occurrence++;
                }
            }
            if (occurrence > maxOccurrenceWord) {
                maxOccurrenceWord = occurrence;
                mostFrequentWord = currentWord;
            }
        }
        return mostFrequentWord;


    }
}
