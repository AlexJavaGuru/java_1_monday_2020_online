package student_alexander_shl.homework.lesson_8.level_6_middle.task_30;

class TestBeforeAndAfter {
    public static void main(String[] args) {

        MyClassVarBefore obj = new MyClassVarBefore();
        MyClassVarAfter objNew = new MyClassVarAfter();

        TestBeforeAndAfter test = new TestBeforeAndAfter();

        test.checkTest(3, obj.addAll(1, 2), "Before method - Two numbers");
        test.checkTest(6, obj.addAll(1, 2, 3), "Before method - Three numbers");
        test.checkTest(10, obj.addAll(1, 2, 3, 4), "Before method - Four numbers");

        test.checkTest(3,objNew.addAll(1,2),"After method - Two numbers");
        test.checkTest(6,objNew.addAll(1,2,3),"After method - Three numbers");
        test.checkTest(10,objNew.addAll(1,2,3,4),"After method - Four numbers");
        test.checkTest(55,objNew.addAll(1,2,3,4,5,6,7,8,9,10),"After method - Four numbers");
    }

    void checkTest(int calculatedValue, int realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
