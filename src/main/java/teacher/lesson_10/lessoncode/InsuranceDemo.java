package teacher.lesson_10.lessoncode;

public class InsuranceDemo {

    public static void main(String[] args) {
        InsurancePremiumCalculatorImpl calculator = new InsurancePremiumCalculatorImpl();
        Broker broker = new Broker(calculator);
        broker.callToTheCustomerAndCalculatePremiumForHim();
    }
}
