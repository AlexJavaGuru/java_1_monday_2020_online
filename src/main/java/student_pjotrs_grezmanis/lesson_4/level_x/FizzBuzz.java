package student_pjotrs_grezmanis.lesson_4.level_x;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Этот метод конечно можнобыло на много красивее упростить )")
class FizzBuzz {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Input number");
        int number = myInput.nextInt();
        FizzBuzz fz = new FizzBuzz();
        String result = fz.detect(number);
        System.out.println(result);
    }

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;


    }
}
