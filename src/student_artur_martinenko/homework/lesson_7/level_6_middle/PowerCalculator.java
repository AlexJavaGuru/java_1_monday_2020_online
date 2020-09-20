package student_artur_martinenko.homework.lesson_7.level_6_middle;

class PowerCalculator {

    public double numberToPower(double number, int power) {
        if (power > 0) {
            return positivePower(number, power);
        } else if (power < 0) {
            return negativePower(number, power);
        }
        return 1;
    }

    public double positivePower(double number, int power) {
        double powered = 1;
        for (int i = 0; i < power; i++) {
            powered = powered * number;
        }
        return powered;
    }

    public double negativePower(double number, int power) {
        return 1 / positivePower(number, Math.abs(power));
    }

}
