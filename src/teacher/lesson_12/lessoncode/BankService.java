package teacher.lesson_12.lessoncode;

public class BankService {

    public ResultObject getClient(String clientName, Integer securityToken) {
        if (securityToken == 123) {
            return new ResultObject("", "Security number is invalid");
        } else if (clientName.equals("Alex")){
            return new ResultObject("Alex");
        } else{
            return new ResultObject("","No such customer");
        }
    }

    public static void main(String[] args) {
        BankService service = new BankService();

        ResultObject result = service.getClient("Alex", 321);

        System.out.println(result.result);
        System.out.println(result.errorMessage);

    }
}
