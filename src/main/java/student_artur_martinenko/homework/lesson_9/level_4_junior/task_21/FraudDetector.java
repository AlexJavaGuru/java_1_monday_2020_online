package student_artur_martinenko.homework.lesson_9.level_4_junior.task_21;

import teacher.annotations.CodeReview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Добавьте в систему обработки транзакций из предыдущего задания пятое правило
для автоматического обнаружения мошеничества.

Пятое правило для автоматического обнаружения мошенничества:
- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.

Внесите в код любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

@CodeReview(approved = true)
class FraudDetector {
    private static final int MAX_FRAUD_LIMIT = 1000000;
    private static ArrayList<String> bannedNames = new ArrayList<>();
    private static ArrayList<String> bannedCities = new ArrayList<>();
    public static ArrayList<String> bannedCountries = new ArrayList<>();

    static {
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_21\\blockedUsers.txt");
        File blockedCities = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_21\\blockedCities.txt");
        File blockedCountries = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_21\\blockedCountries.txt");
        readFromFileAndWriteToArray(blockedUsers, bannedNames);
        readFromFileAndWriteToArray(blockedCities, bannedCities);
        readFromFileAndWriteToArray(blockedCountries, bannedCountries);

    }

    public static ArrayList<String> getBannedNames() {
        return new ArrayList<>(bannedNames);
    }

    public boolean fraudNotDetected(Transaction transaction, int amount) {
        boolean notABannedCountryNoLimit = countryBannedOrTransactionLimit(transaction, amount);
        boolean notABannedCity = !bannedCities.contains(transaction.getTrader().getCity().toLowerCase());
        boolean notAFraudName = !bannedNames.contains(transaction.getTrader().getFullName().toLowerCase());
        boolean amountIsNotTooHuge = transactionIsNotTooHuge(amount);

        return notAFraudName && notABannedCity && notABannedCountryNoLimit && amountIsNotTooHuge;
    }

    private boolean countryBannedOrTransactionLimit(Transaction transaction, int transactionAmount) {
        String transactionCountry = transaction.getTrader().getCountry();

        String[] fraudCountryAndLimit;
        for (String country : bannedCountries) {
            fraudCountryAndLimit = country.split(",");
            String fraudCountry = fraudCountryAndLimit[0];

            if (transactionCountry.equalsIgnoreCase(fraudCountry)) {
                int countryLimit;
                if ((fraudCountryAndLimit.length == 2)) {
                    countryLimit = Integer.parseInt(fraudCountryAndLimit[1]);
                    return !(transactionAmount >= countryLimit);
                }
                return false;
            }
        }
        return true;
    }

    private static void readFromFileAndWriteToArray(File file, ArrayList<String> array) {
        String stringToWrite;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((stringToWrite = br.readLine()) != null) {
                array.add(stringToWrite.toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean transactionIsNotTooHuge(int amount) {
        return amount < MAX_FRAUD_LIMIT;
    }


}
