package student_artur_martinenko.homework.lesson_9.level_5_middle.task_29;

import java.util.ArrayList;

/*
Изучаем Single Responsibility Principle.

Пришло время воспользоваться отдельными классами правил обнаружения мошенничества.

Создайте в классе FraudDetector конструктор, который принимает
массив или список объектов типа FraudRule. Через этот конструктор
в класс FraudDetector будут подаваться все автоматические правила
определения мошенничества, которые реализованы отдельными классами.

Исправьте код метода FraudDetector.isFraud(Transaction t).
Логика этого метода будет очень проста: проити по всем FraudRule,
применить его для транзакции и если хоть одно правило обнаружить
мошенничество то вернуть true (да эта транзакция является мошенничеством),
иначе вернуть false (транзакция чистая, ни одно правило не сработало).

Теперь у класса FraudDetector новая ответственность - это последовательное
применение каждого правила для проверяемой транзакции. Код класса FraudDetector
стал небольшим, от не будет меняться с ростом числа правил обнаружения мошеннисества!

Исправьте тесты согласно новой реализации класса FraudDetector!
 */

//Александр, это пищет будующий Артур, выполнивший это задание до конца ))
//Прошу не судить строго за нестандартность выбранного мною решений. Код эволюционирует с каждым новым заданием.

class FraudDetector {

    public ArrayList<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1());
        fraudRules.add(new FraudRule2());
        fraudRules.add(new FraudRule3());
        fraudRules.add(new FraudRule4());
    }

    public boolean isFraud(Transaction transaction) {
        for (FraudRule fraudrule : fraudRules) {
            if (fraudrule.isFraud(transaction)) {
                return true;
            }
        }
        return false;
    }


}

