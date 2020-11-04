package student_regina_svistunov.lesson_6.level_4;

//Task_17
//Как досрочно закончить текущую итерацию цикла?
//        Найдите ответ в интернете и напишите пример кода
//        для циклов while и for.


public class Task_17 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 12 ) {
                break;
            }
        }

        int i = 0;
        while ( i < 100) {
            System.out.println(i);
            if (i == 12) {
                break;
            }
            i++;
        }
    }
}
