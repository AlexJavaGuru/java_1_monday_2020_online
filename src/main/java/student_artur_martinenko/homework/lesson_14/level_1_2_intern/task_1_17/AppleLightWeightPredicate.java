package student_artur_martinenko.homework.lesson_14.level_1_2_intern.task_1_17;

class AppleLightWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
