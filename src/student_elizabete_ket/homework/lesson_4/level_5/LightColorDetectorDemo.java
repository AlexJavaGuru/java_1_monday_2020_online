package student_elizabete_ket.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class LightColorDetectorDemo {

    public static void main(String[] args) {

        LightColorDetector detector = new LightColorDetector();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert length of the wave");
        int waveLength = sc.nextInt();

        String waveColour = detector.detect(waveLength);
        System.out.println("Wave colour is " + waveColour);


    }
}


