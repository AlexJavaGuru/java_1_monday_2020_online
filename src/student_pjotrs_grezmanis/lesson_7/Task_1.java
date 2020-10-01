package student_pjotrs_grezmanis.lesson_7;

class Task_1 {
    public static void main(String[] args) {
        Task_1 task = new Task_1();

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
