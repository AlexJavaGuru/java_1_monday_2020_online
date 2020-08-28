package student_andris_tresutins.homework.lesson_4.level_4;

class Calctest {


    //Это не то, как мы должны писать Unit тесты. Посмотрите мои примеры. Каждый текст должен находиться в своем методе. Необходимо сделать Refactoring кода,
    //чтобы не дублировать строки, где вы сравниваете результат. Сейчас у вас огромное количество лишнего кода и совсем не понятно, какой именно тест упал (если упадет). Надо переделать.
    //Done
    public void sumtest() {
    int firstInt = 20;
    int secondInt = 20;

    Calc victim = new Calc();

    int result = victim.sum(firstInt, secondInt);

    int expectedres = 40;

    check(expectedres, result, "Sum test");

}
    public void subtest() {
        int firstInt = 20;
        int secondInt = 5;

        Calc victim = new Calc();
        int result2 = victim.sub(firstInt, secondInt);
        int expectedres = 15;
        check(expectedres, result2, "Subtraction test");
    }


    public void divtest() {
        double firstInt = 20;
        double secondInt = 5;

        Calc victim = new Calc();
        double result3 = victim.div(firstInt, secondInt);
        double expectedres = 4;
        check(expectedres, result3, "Division test");
    }


    public void multtest() {
        int firstInt = 20;
        int secondInt = 2;

        Calc victim = new Calc();
        int result4 = victim.mult(firstInt, secondInt);
        int expectedres = 40;

        check(expectedres, result4, "Multiplication test");
    }


    public void eventest() {
        int firstInt = 20;

        Calc victim = new Calc();
        int result5 = victim.iseven(firstInt);
        int expectedres = 0;
        check(expectedres, result5, "Even test");
    }


    public void maxoftwotestfirstint() {
        int firstInt = 21;
        int secondInt = 20;

        Calc victim = new Calc();
        int result6 = victim.isbiggerTwoInt(firstInt, secondInt);
        int expectedres = firstInt;

        check(expectedres, result6, "Max of two test (first integer is bigger)");
    }

    public void maxoftwotestsecondint() {
        int firstInt = 21;
        int secondInt = 22;

        Calc victim = new Calc();
        int result6 = victim.isbiggerTwoInt(firstInt, secondInt);
        int expectedres = secondInt;

        check(expectedres, result6, "Max of two test (second integer is bigger)");
    }

    public void maxoftwotestequals() {
        int firstInt = 22;
        int secondInt = 22;

        Calc victim = new Calc();
        int result6 = victim.isbiggerTwoInt(firstInt, secondInt);
        int expectedres = 0;

        check(expectedres, result6, "Max of two test (both integers are the same)");
    }


    public void maxofthreetestfirstint() {
        int firstInt = 23;
        int secondInt = 21;
        int thirdInt = 22;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = firstInt  ;

        check(expectedres, result7, "Max of three test (First integer is bigger)");
 }

    public void maxofthreetestsecondint() {
        int firstInt = 23;
        int secondInt = 24;
        int thirdInt = 22;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = secondInt  ;

        check(expectedres, result7, "Max of three test (Second integer is bigger)");
    }


    public void maxofthreetestthirdint() {
        int firstInt = 23;
        int secondInt = 24;
        int thirdInt = 26;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = thirdInt  ;

        check(expectedres, result7, "Max of three test (Third integer is bigger)");
    }

    public void maxofthreetest12() {
        int firstInt = 25;
        int secondInt = 25;
        int thirdInt = 22;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = 12  ;

        check(expectedres, result7, "Max of three test (First and Second int are equal and bigger than the third int)");
    }


    public void maxofthreetest3() {
        int firstInt = 25;
        int secondInt = 25;
        int thirdInt = 28;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = 3  ;

        check(expectedres, result7, "Max of three test (First and Second int are equal and smaller than the third int)");
    }

    public void maxofthreetest123() {
        int firstInt = 25;
        int secondInt = 25;
        int thirdInt = 25;

        Calc victim = new Calc();

        int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt);

        int expectedres = 123  ;

        check(expectedres, result7, "Max of three test (All integers are equal)");
    }



    public void check(int expectedRes, int result, String testName) {
        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedRes + " but actual result " + result);
        }
    }

    public void check(double expectedRes, double result, String testName) {
        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedRes + " but actual result " + result);
        }
    }
}



