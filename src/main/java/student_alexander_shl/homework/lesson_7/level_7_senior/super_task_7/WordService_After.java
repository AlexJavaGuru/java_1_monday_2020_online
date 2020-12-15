package student_alexander_shl.homework.lesson_7.level_7_senior.super_task_7;

class WordService_After {
    public String findMostFrequentWord(String text) {
        String[] arrayFromText = convertStringToWordArray(text);
        return mostFrequentWord(arrayFromText);
    }

    public String[] convertStringToWordArray(String text) {
        return text.split(" ");
    }

    public String mostFrequentWord(String[] arrayFromText) {
        String maxWord = arrayFromText[0];
        int maxCount = 1;

        for (String currentWord : arrayFromText) {
            int currentCount = wordCount(arrayFromText, currentWord);
            if (maxCount < currentCount) {
                maxCount = currentCount;
                maxWord = currentWord;
            }
        }
        return maxWord;
    }

    public int wordCount(String[] text, String word) {
        int countWord = 0;
        for (String currentWord : text) {
            if (currentWord.equalsIgnoreCase(word)) {
                countWord++;
            }
        }
        return countWord;
    }
}
