package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_10;

class PowerCalculator {

    public double exponentiation(int number, int degree) {
        double answer = 1;
        if (degree >= 0) {
            for (int i = 0; i < degree; i++) {
                answer *= number;
            }
        } else {
            for (int i = 0; i < Math.abs(degree); i++) {
                answer /= number;
            }
        }
        return answer;
    }
}
