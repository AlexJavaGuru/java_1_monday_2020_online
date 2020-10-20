package student_dmitry_vasiliev.lesson_9.level_1;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();

        System.out.println("Actualy pincode: " + safe.getPincode());
        safe.setPincode(1234);
        System.out.println("New pincode: " + safe.getPincode());

        System.out.println("Actualy amount of the money: " + safe.getMoneyAmount());
        safe.setMoneyAmount(1.0);
        System.out.println("New amount of the money: " + safe.getMoneyAmount());

        Safe_V2 safe_v2 = new Safe_V2();
        safe_v2.getMoney(100, 1111);
        safe_v2.putMoney(100,1111);
    }
}
