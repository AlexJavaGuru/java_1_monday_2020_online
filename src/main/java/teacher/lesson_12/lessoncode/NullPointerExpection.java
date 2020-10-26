package teacher.lesson_12.lessoncode;

public class NullPointerExpection {

    public static void main(String[] args) {

        BankService bankService = null;

        bankService.getClient("", 123);
    }
}
