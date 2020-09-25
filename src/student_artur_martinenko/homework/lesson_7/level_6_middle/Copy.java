package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        if (in == null) {
            return null;
        }
        String rangedStringArray = passRangeIntegersToString(in, numberFrom, numberTo);
        return stringToIntArray(rangedStringArray);
    }

    public int[] stringToIntArray(String text) {
        String[] stringArray = text.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public String passRangeIntegersToString(int[] in, int numberFrom, int numberTo) {
        String inRangeInt = "";
        for (int i : in) {
            if (numberFrom <= i && i <= numberTo) {
                inRangeInt += i + ",";
            }
        }
        return inRangeInt;
    }

}
