package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_13;

class Copy {

    public int[] copyInRange(int[] fromArray, int numberFrom, int numberTo) {
        int[] newArray = new int[Math.abs(numberFrom - numberTo) + 1];

        for (int i = numberFrom, j = 0; i <= numberTo; i++, j++) {
            newArray[j] = fromArray[i];
        }

        return newArray;
    }

}
