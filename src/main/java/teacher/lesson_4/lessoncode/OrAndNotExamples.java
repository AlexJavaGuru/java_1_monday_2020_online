package teacher.lesson_4.lessoncode;

public class OrAndNotExamples {

    public static void main(String[] args) {

        boolean rain = true;
        boolean strongWind = true;

        // result = ! + strongWind
        if (rain && !strongWind) {
            System.out.println("It's rainy, I need my umbrella!!");
            if (strongWind) {
                System.out.println("Hello from the other side...");
            }
        } else {
            System.out.println("I will wait inside, do my Java homework");
        }

//        boolean flag = 10 < 5;
//
//        if (!flag) {
//            System.out.println("Hello from here!");
//        }

        boolean sunnyDay = false;
        boolean tornado = true;
        boolean night = true;

        if (sunnyDay || tornado || night) {
            System.out.println("I'll complete my Java homework!!!");
        }


    }

}
