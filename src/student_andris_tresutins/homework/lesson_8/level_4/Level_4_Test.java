package student_andris_tresutins.homework.lesson_8.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Level_4_Test {
    public static void main(String[] args) {
        Level_4_Test test = new Level_4_Test();
        test.circleTestArea();
        test.circleTestPerimeter();
        test.squareTestArea();
        test.squareTestPerimeter();
        test.rectangleTestArea();
        test.rectangleTestPerimeter();
        test.triangleTestArea();
        test.triangleTestPerimeter();

    }

     public void triangleTestArea(){
         Triangle_T19 victim = new Triangle_T19("Triangle",3);
         double result =  victim.calculateArea();
         double expectedResult = 3.8971143170299736;

         check(expectedResult, result, "Triangle test area");
     }

     public void triangleTestPerimeter(){
         Triangle_T19 victim = new Triangle_T19("Triangle",7);
         double result =  victim.calculatePerimeter();
         double expectedResult = 21;

         check(expectedResult, result, "Triangle test Perimeter");
     }

    public void rectangleTestArea(){
        Rectangle_T18 victim = new Rectangle_T18("Rectangle",7,4);
        double result =  victim.calculateArea();
        double expectedResult = 28;

        check(expectedResult, result, "Rectangle test area");
    }

     public void rectangleTestPerimeter(){
         Rectangle_T18 victim = new Rectangle_T18("Rectangle",7,4);
         double result =  victim.calculatePerimeter();
         double expectedResult = 22;

         check(expectedResult, result, "Rectangle test Perimeter");
     }

     public void squareTestArea(){
         Square_T17 victim = new Square_T17("Square", 5);
         double result =  victim.calculateArea();
         double expectedResult = 25;

         check(expectedResult, result, "Square test area");
     }

     public void squareTestPerimeter(){
         Square_T17 victim = new Square_T17("Square", 5);
         double result =  victim.calculatePerimeter();
         double expectedResult = 20;

         check(expectedResult, result, "Square test Perimeter");
     }

    public void circleTestArea(){
        Circle_T16 victim = new Circle_T16("Circle", 6.4);
        double result =  victim.calculateArea();
        double expectedResult = 128.67963509103794;

        check(expectedResult, result, "Circle test area");
    }

     public void circleTestPerimeter(){
         Circle_T16 victim = new Circle_T16("Circle", 7);
         double result =  victim.calculatePerimeter();
         double expectedResult = 43.982297150257104;

         check(expectedResult, result, "Circle test Perimeter");
     }

    public void check(double expectedRes, double result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}
