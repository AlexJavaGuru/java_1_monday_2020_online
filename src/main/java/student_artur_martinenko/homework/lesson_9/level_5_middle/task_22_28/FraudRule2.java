package student_artur_martinenko.homework.lesson_9.level_5_middle.task_22_28;

import teacher.annotations.CodeReview;

import java.io.File;
import java.util.ArrayList;

@CodeReview(approved = true)
class FraudRule2 extends FraudRule {
    private static ArrayList<String> bannedNames = new ArrayList<>();

    public FraudRule2() {
        super("Banned names");
    }

    static {
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_5_middle\\task_22_28\\blockedUsers.txt");
        FraudRule.readFromFileAndWriteToArray(blockedUsers, bannedNames);
    }

    public static ArrayList<String> getBannedNames() {
        return new ArrayList<>(bannedNames);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return bannedNames.contains(transaction.getTrader().getFullName().toLowerCase());
    }
}
