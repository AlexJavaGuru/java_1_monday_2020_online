package student_dmitry_vasiliev.lesson_10.level_2;

/* - Task_4
Несколько имплементаций одного интерфейса.
        Одну и ту же задачу можно решить разными способами.

        Дан класс:
        - Создайте для этого класса интерфейс DayOfTheWeekDetector.
        - Сделайте так, чтобы класс DayOfTheWeekDetectorIfVersion реализовывал
        интерфейс DayOfTheWeekDetector.
        - Создайте вторую имплементацию данного интерфейса основанную на switch операторе.
        Если сможете, то создайте третью имплементацию основанную на массиве строк.
        Индекс массива = номеру дня недели, а значение в ячейке массива это название соответствующего
        дня недели.
        Протестируйте все имплементации.*/

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{

    // Try to use switch here!!
    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "from 1 to 7";
        }
    }
}


