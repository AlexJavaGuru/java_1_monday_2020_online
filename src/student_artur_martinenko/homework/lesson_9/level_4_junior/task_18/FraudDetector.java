package student_artur_martinenko.homework.lesson_9.level_4_junior.task_18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Добавьте в систему обработки транзакций из предыдущего задания второе правило
для автоматического обнаружения мошеничества.

Второе правило для автоматического обнаружения мошенничества:
- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.

Внесите в код любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

class FraudDetector {
    private static ArrayList<Trader> fraudTraders = new ArrayList<>();

    static {
        String fraudTraderName;
        File blockedUsers = new File("src\\student_artur_martinenko\\homework\\" +
                "lesson_9\\level_4_junior\\task_18\\blockedUsers.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(blockedUsers))) {
            while ((fraudTraderName = br.readLine()) != null) {
                fraudTraders.add(new Trader(fraudTraderName, ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isFraud(Transaction t) {
        Trader scumTrader = t.getTrader();
        return fraudTraders.contains(scumTrader);
    }

    private boolean transactionIsNotTooHuge(int amount) {
        return amount < 1000000;
    }

    public boolean fraudNotDetected(Transaction transaction, int amount) {
        boolean notAFraud = !isFraud(transaction);
        boolean amountIsNotTooHuge = transactionIsNotTooHuge(amount);

        return notAFraud && amountIsNotTooHuge;
    }

    public static ArrayList<Trader> getFraudTraders() {
        return new ArrayList<>(fraudTraders);
    }

}
