package student_artur_martinenko.homework.lesson_9.level_5_middle.task_29;

import java.io.File;
import java.util.ArrayList;

class FraudRule2 extends FraudRule {
    private static ArrayList<String> bannedNames = new ArrayList<>();

    public FraudRule2() {
        super("Banned names");
    }

    static {
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_5_middle\\task_29\\blockedUsers.txt");
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
