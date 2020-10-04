package student_artur_martinenko.homework.lesson_9.level_4_junior.task_17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Ниже приведён неполный код системы обработки транзакций.
Вам будет необходимо внести в него изменения и доработать его
согласно бизнес требованиям.
Каждая транзакция в системе должна быть проверена на мошенничество (fraud).
Для автоматического обнаружения мошенничества при проверке транзакций
в систему нужно добавить правила, которые будут приведены ниже.

class Trader {

    private String fullName;
    private String city;

}


class Transaction {

    private Trader trader;
    private int amount;

}


class FraudDetector {

    boolean isFraud(Transaction t) {

    }

}

Реализуйте первое правило для автоматического обнаружения мошенничества:
- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.

Внесите в код указанный выше любые изменения, которые вы считаете нужными для того,
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
                "lesson_9\\level_4_junior\\task_17\\blockedUsers.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(blockedUsers))) {
            while ((fraudTraderName = br.readLine()) != null) {
                fraudTraders.add(new Trader(fraudTraderName, ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean isFraud(Transaction t) {
        Trader scumTrader = t.getTrader();
        return fraudTraders.contains(scumTrader);
    }

    public static ArrayList<Trader> getFraudTraders() {
        return new ArrayList<>(fraudTraders);
    }
}
