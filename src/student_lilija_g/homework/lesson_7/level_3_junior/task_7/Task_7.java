package student_lilija_g.homework.lesson_7.level_3_junior.task_7;

import java.util.Random;
import java.util.Scanner;

/*
Попробовать применить на практике знания
полученные из второй главы ("Содержательные имена") книги Роберта Мартина "Чистый код" (Clean code).
Попробуйте оценить свой код написанный для решения задачи
нахождения наиболее часто встречаемого в тексте слова.
Следует ли ваш код всем правилам, которые описыны в книге "Чистый код".
Критически оцените написанный вами код и если увидите те места,
которые следует улучшить то сделайте это! Выполните рефакторинг!

=====================================================================
Попробую произвести рефакторинг задания:
//package student_lilija_g.homework.lesson_5.level_4;

//
//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.
//

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Конечно можно было разделить два действия =). Заполнение массива и поиск числа ))) А то у вас выходит, что поиск происходит на лету. Это экономит ресурсы однозначно," +
        "но в реальности такое супер редко бывает )")
class Task_27 {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();
        return createArray(arraysLength);
    }

    void solutionTask_27(int[] myArray) {

        Random random = new Random();
        StringBuilder myString = new StringBuilder("Array: {");
        int maxNumber = 0;

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(100);
            myString.append(myArray[i]);

            if (maxNumber < myArray[i]) {
                maxNumber = myArray[i];
            }

            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
        System.out.println("\nMax array's number: " + maxNumber);
    }

    public static void main(String[] args) {
        Task_27 task_27 = new Task_27();
        int[] arrayDemo = task_27.arrayLengthFromUser();
        task_27.solutionTask_27(arrayDemo);
    }
}

 */
class Task_7 {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        return createArray(scanner.nextInt());
    }

    public int[] fillArrayWithRandomNumbers(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }

    public void printArray(int[] myArray) {

        StringBuilder myString = new StringBuilder("Array: {");

        for (int i = 0; i < myArray.length; i++) {
            myString.append(myArray[i]);
            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
    }

    public int findMaxNumberInArray(int[] myArray) {
        int maxNumber = 0;
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (maxNumber < myArray[i]) {
                maxNumber = myArray[i];
            }
        }
        return maxNumber;
    }

    public void printMaxNumber(int maxNumber) {
        System.out.println("\nMax array's number: " + maxNumber);
    }

    public static void main(String[] args) {

        Task_7 myTask_7 = new Task_7();
        int[] myArray = myTask_7.fillArrayWithRandomNumbers(myTask_7.arrayLengthFromUser());
        myTask_7.printArray(myArray);
        myTask_7.printMaxNumber(myTask_7.findMaxNumberInArray(myArray));

    }
}
