package student_artur_martinenko.homework.lesson_7.level_7_senior;

class WordService {

    // Такие методы надо разбивать на более мелкие методы!
    public String findMostFrequentWord(String text) {
        String[] textArray = convertStringToWordArray(text);
        int[] wordCountArray = wordCounter(textArray);
        return whichIsTheLongest(textArray, wordCountArray);
    }

    private String[] convertStringToWordArray(String text) {
        return text.split(" ");
    }

    private int[] wordCounter(String[] textArray) {
        int[] wordCountArray = new int[textArray.length];
        int wordCounter = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (String s : textArray) {
                if (textArray[i].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
            wordCounter = 0;
        }
        return wordCountArray;
    }

    private String whichIsTheLongest(String[] textArray, int[] wordCountArray) {
        int max = 0;
        for (int i = 0; i < wordCountArray.length; i++) {
            if (wordCountArray[i] > max) {
                max = i;
            }
        }
        return textArray[max];
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
        System.out.println(result);
    }
}
