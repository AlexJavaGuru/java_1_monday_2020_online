package student_aleksejs_ivanovs.homework.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] array = text.split(" ");
        int[] additionalArray = {-1, 0};

        for (int i = 0; i < array.length; i++) {
            if (!array[additionalArray[1]].equals(array[i]) || additionalArray[0] < 0) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                if (additionalArray[0] < count) {
                    additionalArray[0] = count;
                    additionalArray[1] = i;
                }
            }
        }
        return array[additionalArray[1]];
    }

}
