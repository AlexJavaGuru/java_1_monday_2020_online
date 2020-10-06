package student_artur_martinenko.homework.lesson_9.level_4_junior.task_20;

import teacher.annotations.CodeReview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Добавьте в систему обработки транзакций из предыдущего задания четвёртое правило
для автоматического обнаружения мошеничества.

Четвёртое правило для автоматического обнаружения мошенничества:
- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.

Внесите в код любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

@CodeReview(approved = true)
class FraudDetector {
    private static ArrayList<String> bannedNames = new ArrayList<>();
    private static ArrayList<String> bannedCities = new ArrayList<>();
    private static ArrayList<String> bannedCountries = new ArrayList<>();

    static {
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_20\\blockedUsers.txt");
        File blockedCities = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_20\\blockedCities.txt");
        File blockedCountries = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_20\\blockedCountries.txt");
        readFromFileAndWriteToArray(blockedUsers, bannedNames);
        readFromFileAndWriteToArray(blockedCities, bannedCities);
        readFromFileAndWriteToArray(blockedCountries, bannedCountries);

    }

    private boolean transactionIsNotTooHuge(int amount) {
        return amount < 1000000;
    }

    public boolean fraudNotDetected(Transaction transaction, int amount) {
        boolean notAFraudName = !bannedNames.contains(transaction.getTrader().getFullName().toLowerCase());
        boolean notABannedCity = !bannedCities.contains(transaction.getTrader().getCity().toLowerCase());
        boolean notABannedCountry = !bannedCountries.contains(transaction.getTrader().getCountry().toLowerCase());
        boolean amountIsNotTooHuge = transactionIsNotTooHuge(amount);

        return notAFraudName && notABannedCity && notABannedCountry && amountIsNotTooHuge;
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

    public static ArrayList<String> getBannedNames() {
        return new ArrayList<>(bannedNames);
    }

}
