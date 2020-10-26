package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

import java.io.File;
import java.util.ArrayList;

class FraudRule3 extends FraudRule {
    private static ArrayList<String> bannedCities = new ArrayList<>();

    public FraudRule3() {
        super("Banned Cities");
    }

    static {
        File blockedCities = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_6_middle\\task_30_33\\blockedCities.txt");
        FraudRule.readFromFileAndWriteToArray(blockedCities, bannedCities);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return bannedCities.contains(transaction.getTrader().getCity().toLowerCase());
    }
}
