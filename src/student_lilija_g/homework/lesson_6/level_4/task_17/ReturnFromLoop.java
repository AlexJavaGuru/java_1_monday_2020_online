package student_lilija_g.homework.lesson_6.level_4.task_17;

class ReturnFromLoop {
    public static void main(String[] args) {
        ReturnFromLoop returnFromLoop = new ReturnFromLoop();
        returnFromLoop.returnTest();
    }

    // Return in for:
    public boolean findNumberWithFor(int[] array, int numberForFind) {
        for (int i : array) {
            if (i == numberForFind) {
                return true;
            }
        }
        return false;
    }

    // Return in While:
    public boolean findNumberWithWhile(int[] array, int numberForFind) {
        int i = 0;
        while (i <= array.length-1) {
            if (array[i] == numberForFind) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void returnTest() {

        int[] myArray = {45, 26, 18, 34, 98, 5};
        ReturnFromLoop returnFromLoop = new ReturnFromLoop();

        totalBooleanTest(true, returnFromLoop.findNumberWithFor(myArray, 26),"Number 26 is find with For in array");
        totalBooleanTest(false, returnFromLoop.findNumberWithFor(myArray, 50),"Number 50 not find with For in array");
        totalBooleanTest(true, returnFromLoop.findNumberWithWhile(myArray, 26),"Number 26 is find with While in array");
        totalBooleanTest(false, returnFromLoop.findNumberWithWhile(myArray, 50),"Number 50 not find with While in array");
    }

     void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}

