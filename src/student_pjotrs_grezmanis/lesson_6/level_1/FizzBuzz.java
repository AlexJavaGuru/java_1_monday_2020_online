package student_pjotrs_grezmanis.lesson_6.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class FizzBuzz {
public static void main(String[] args){
    Scanner myInput = new Scanner(System.in);
    System.out.print("Input number");
    int number = myInput.nextInt();
    FizzBuzz fb = new FizzBuzz();
    String result = fb.detect(number);
    System.out.println(result);
}
    public String detect(int number){

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;

    }
}
