package student_alexander_shl.homework.lesson_8.level_6_middle.task_30;

class MyClassVarAfter {

    public int addAll(int ... numbers)
    {
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length ; i++)
        {
            sumNumbers += numbers[i];
        }
        return sumNumbers;
    }

}
