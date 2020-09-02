package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "А где вы взяли это задание?")
class PlaneDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Plane estonianAir = new Plane();
        estonianAir.setCompany("EstonianAir");
        estonianAir.setSeat(200);
        estonianAir.setFlightRange(3000);
        estonianAir.setTakeOff(false);

        System.out.println("Plane " + estonianAir.getCompany() + ", " + estonianAir.getSeat() + " seats, " + "flight range - " + estonianAir.getFlightRange() + "km - ready to fly. Take off - " + estonianAir.getTakeOff()+ ".");
        System.out.println("Give permission to take off: YES - 1 / NO - 2");
        int takeOff = in.nextInt();
        boolean stat = 1 == takeOff;
        if (stat) {
            System.out.println("Plane " + estonianAir.getCompany() + " is take off.");
            System.out.println("Enter please destination...");
            String place = in.next();
            System.out.println("Plane " + estonianAir.getCompany() + " fly to " + place + ".");
            }
        else {
            System.out.println("Plane " + estonianAir.getCompany() + " waits on the ground.");

    }
    }
}

