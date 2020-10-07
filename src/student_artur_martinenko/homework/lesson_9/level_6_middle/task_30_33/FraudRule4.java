package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

import java.io.File;
import java.util.ArrayList;

class FraudRule4 extends FraudRule {
    public static ArrayList<String> bannedCountries = new ArrayList<>();

    public FraudRule4() {
        super("Banned Countries");
    }

    static {
        File blockedCountries = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_6_middle\\task_30_33\\blockedCountries.txt");
        FraudRule.readFromFileAndWriteToArray(blockedCountries, bannedCountries);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        String transactionCountry = transaction.getTrader().getCountry();

        String[] fraudCountryAndLimitArray;
        for (String country : bannedCountries) {
            fraudCountryAndLimitArray = country.split(",");
            String fraudCountry = fraudCountryAndLimitArray[0];
            if ((fraudCountryAndLimitArray.length == 1) && (transactionCountry.equalsIgnoreCase(fraudCountry))) {
                return true;
            }
        }
        return false;
    }
}
