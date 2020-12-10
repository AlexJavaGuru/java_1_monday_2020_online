package student_alexander_shl.homework.lesson_6.level_4;

/*
Как досрочно закончить текущую итерацию цикла?
Найдите ответ в интернете и напишите пример кода
для циклов while и for.
 */
class Task_17 {

    public static void main(String[] args) {

//            for (int i = 0; i < 100; i++) {
//                if (i == 4) {
//                    break; // Task_17_for
//                }
//                System.out.println("i: " + i);
//            }
//            System.out.println("For: End");
//        }

        int i = 0;
        while (i < 100) {
            System.out.println("i: " + i);
            i++;
            if (i == 4) {
                break; // Task_17_while
            }
        }
        System.out.println("While: End.");
    }
}


