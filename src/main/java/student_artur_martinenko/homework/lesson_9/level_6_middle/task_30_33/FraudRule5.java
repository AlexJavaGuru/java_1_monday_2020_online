package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

import java.io.File;
import java.util.ArrayList;

class FraudRule5 extends FraudRule {
    public static ArrayList<String> bannedCountries = new ArrayList<>();

    public FraudRule5() {
        super("Countries with Limit");
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

            if (transactionCountry.equalsIgnoreCase(fraudCountry)) {
                int countryLimit;
                if ((fraudCountryAndLimitArray.length == 2)) {
                    countryLimit = Integer.parseInt(fraudCountryAndLimitArray[1]);
                    return transaction.getAmount() >= countryLimit;
                }
                return true;
            }
        }
        return false;
    }
}
