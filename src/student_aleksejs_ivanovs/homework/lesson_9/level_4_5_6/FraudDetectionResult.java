package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

/*  Task_30
Продолжаем работу над системой автоматического обнаружения мошенничества.

Бизнес хочет, что бы наша система не только определяла является ли транзакция
мошенничеством согласно правилам, но и определяло согласно какому правилу
транзакция признана мошенничеством. Это нужно для упрощения работы отдела
расследования мошеннических транзакций.

Так как от нас требуют, что бы наш код возвращал два результата:
- является транзакция мошенничеством или нет (boolean)
- название правила согласно которому транзакция признана мошенничеством (String),
  заполняется только в том случае если транзакция является мошенничеством, иначе null.

Вернуть два результата из метода FraudDetector.isFraud(Transaction t) мы не можем.

Поэтому, создайте отдельный класс FraudDetectionResult для объединения двух
возвращаемых значений:

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    // реализуйте конструктор класса
    // реализуйте get() и set() методы для каждого совйства

}*/

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}
