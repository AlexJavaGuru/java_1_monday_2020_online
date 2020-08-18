package student_andris_tresutins.homework.lesson_4.level_4;

class Calctest {
    public static void main(String[] args) {
        Calctest thetest = new Calctest();
        thetest.calccalctest();
    }

public void calccalctest(){
    int firstInt = 20;
    int secondInt = 5;
    int thirdInt = 25;

    Calc victim = new Calc();

    int result = victim.sum(firstInt, secondInt);
    if (result == 25) {
        System.out.println("Sum test = OK");
    } else {
        System.out.println("Sum test = FAIL");
    }

    int result2 = victim.sub(firstInt, secondInt);
    if (result2 == 15) {
        System.out.println("Sub test = OK");
    } else {
        System.out.println("Sub test = FAIL");
    }

    int result3 = victim.div(firstInt, secondInt);
    if (result3 == 4) {
        System.out.println("div test = OK");
    } else {
        System.out.println("div test = FAIL");
    }

    int result4 = victim.mult(firstInt, secondInt);
    if (result4 == 100) {
        System.out.println("mult test = OK");
    } else {
        System.out.println("mult test = FAIL");
    }

    int result5 = victim.iseven(firstInt);
    if (result5 == 0) {
        System.out.println("even test = OK");
    } else {
        System.out.println("even test = FAIL");
    }

    int result6 = victim.isbiggerTwoInt(firstInt, secondInt, 0);
    if (result6 == firstInt) {
        System.out.println("First int is bigger");
    } else if (result6 == secondInt) {
        System.out.println("Second int is bigger");
    } else {
        System.out.println("Both integers are the same");
    }

    int result7 = victim.isbiggerThreeInt(firstInt, secondInt, thirdInt, 0,1,2,3);
    if (result7 == firstInt) {
        System.out.println("First int is bigger");
    }
    else if (result7 == secondInt) {
        System.out.println("Second int is bigger");
    }
    else if (result7 == thirdInt) {
        System.out.println("Third int is bigger");
    }
    else if (result7 == 0) {
        System.out.println("First and Second int are bigger than the third int");
    }
    else if (result7 == 1) {
        System.out.println("First and Second int are smaller than the third int");
    }
    else if (result7 == 2) {
        System.out.println("All integers are the same");
    }
    else if (result7 == 3) {
        System.out.println("Something went wrong :/");
    }

}


}
