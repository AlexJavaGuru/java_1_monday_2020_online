package student_artur_martinenko.homework.lesson_9.level_4_junior.task_19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Добавьте в систему обработки транзакций из предыдущего задания третье правило
для автоматического обнаружения мошеничества.

Третье правило для автоматического обнаружения мошенничества:
- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.

Внесите в код любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

class FraudDetector {
    private static ArrayList<String> fraudTraders = new ArrayList<>();
    private static ArrayList<String> bannedCities = new ArrayList<>();

    static {
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_19\\blockedUsers.txt");
        File blockedCities = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_19\\blockedCities.txt");
        readFromFileAndWriteToArray(blockedUsers, fraudTraders);
        readFromFileAndWriteToArray(blockedCities, bannedCities);
    }

    private boolean transactionIsNotTooHuge(int amount) {
        return amount < 1000000;
    }

    public boolean fraudNotDetected(Transaction transaction, int amount) {
        boolean notAFraudName = !fraudTraders.contains(transaction.getTrader().getFullName());
        boolean notABannedCity = !bannedCities.contains(transaction.getTrader().getCity());
        boolean amountIsNotTooHuge = transactionIsNotTooHuge(amount);

        return notAFraudName && notABannedCity && amountIsNotTooHuge;
    }

    private static void readFromFileAndWriteToArray(File file, ArrayList<String> array) {
        String stringToWrite;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((stringToWrite = br.readLine()) != null) {
                array.add(stringToWrite);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getFraudTraders() {
        return new ArrayList<>(fraudTraders);
    }

}
