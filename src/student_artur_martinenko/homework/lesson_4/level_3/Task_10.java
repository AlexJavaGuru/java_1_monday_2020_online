package student_artur_martinenko.homework.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int one = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second integer number: ");
        int two = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter third integer number: ");
        int three = scanner.nextInt();

        boolean oneIsBiggerTwo = one > two;
        boolean oneIsBiggerThree = one > three;
        boolean twoISBiggerThree = two > three;

        //Оригинал моего кода
//        if(!oneIsBiggerTwo && !oneIsBiggerThree && !twoISBiggerThree){
//            System.out.println("The biggest is " + three);
//        }else if (!oneIsBiggerTwo && !oneIsBiggerThree && twoISBiggerThree) {
//            System.out.println("The biggest is " + two);
//        } else if (!oneIsBiggerTwo && oneIsBiggerThree && twoISBiggerThree) {
//            System.out.println("The biggest is " + two);
//        }else {
//            System.out.println("The biggest is " + one);
//        }

        //Тут подсказала 'Идея' как скратить код, самому бы не вхатило мысли.

        //Все верно, у вас верхние условия исключают нижние. Простая алгоритмика )
        if(!oneIsBiggerTwo && !oneIsBiggerThree && !twoISBiggerThree){
            System.out.println("The biggest is " + three);
        }else if (!oneIsBiggerTwo && !oneIsBiggerThree) {
            System.out.println("The biggest is " + two);
        } else if (!oneIsBiggerTwo) {
            System.out.println("The biggest is " + two);
        }else {
            System.out.println("The biggest is " + one);
        }

    }

    /* Логика решения задачи.
    123		1	>	2	f
            1	>	3	f
            2	>	3	f

    132		1	>	3	f
            1	>	2	f
            3	>	2	t

    231		2	>	3	f
            2	>	1	t
            3	>	1	t

    321		3	>	2	t
            3	>	1	t
            2	>	1	f
     */

}
