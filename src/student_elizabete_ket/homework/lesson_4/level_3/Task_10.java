package student_elizabete_ket.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        // если A > B, A > C, то наиболшее число А
        // если A < B, A > C, то наиболшее число B
        // если C > B, C > A, то ниаболшее число С

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int numberOneA = sc.nextInt();
        System.out.println("Please enter second number: ");
        int numberTwoB = sc.nextInt();
        System.out.println("Please enter third number");
        int numberThreeC = sc.nextInt();

        if ((numberOneA > numberTwoB) && (numberOneA > numberThreeC)) {
            System.out.println("Largest number = " + numberOneA);
        } else if ((numberOneA < numberTwoB) && (numberOneA > numberThreeC)) {
            System.out.println("Largest number = " + numberTwoB);
        } else  { //if ((numberOneA < numberThreeC) && (numberTwoB < numberThreeC))
            System.out.println("Largest number = " + numberThreeC);
        }
    }
}
