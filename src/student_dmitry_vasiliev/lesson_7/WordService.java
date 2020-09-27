package student_dmitry_vasiliev.lesson_7;
/*Дана строка с текстом.
        Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.*/
class WordService {

    public String changeDotCommToEmpty(String sentence) {
        String sentence1 = sentence.replace(".", "");
        String sentence2 = sentence1.replace(",", "");
        return sentence2;
    }

    public String[] arrayOfWord(String sentence) {
        //String[] words = new String[];
        String[] words = sentence.split("\\s");
        return words;
    }

    public int[] wordMaxEntry(String[] array) {
        int[] entryCounter = new int[array.length];
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i].equals(array[j])) {
                    entryCounter[i] += 1;
                }
            }
            //int j = i;
        }
        return entryCounter;
    }

    public int findEntryMaxNumber(int[] array) {
        int maxNumber = 0;
        int indexNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                indexNumber = i;
            }
        }
        return indexNumber;
    }

    public void printWord(String sentence, String[] wordArray, int indexNumber) {
        System.out.println("In sentence //" + sentence + "//, word /" + wordArray[indexNumber] +
                "/ has most entries.");
    }
}


