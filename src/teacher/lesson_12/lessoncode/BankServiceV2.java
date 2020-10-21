package teacher.lesson_12.lessoncode;

import javax.swing.text.html.Option;
import java.rmi.server.ExportException;
import java.util.Optional;

public class BankServiceV2 {

    private Optional<String> getClient(String clientName, Integer securityToken) throws SecurityTokenIsInvalidException {
        if (securityToken != 123) {
            SecurityTokenIsInvalidException exception =
                    new SecurityTokenIsInvalidException("Invalid Security Token", securityToken);
            throw exception;
        } else if (clientName.equals("Alex")){
            return Optional.of("Alex");
        } else{
            return Optional.empty();
        }
    }

    public Optional<String> publicGetClient(String clientName, Integer securityToken) throws SecurityTokenIsInvalidException{
        BankServiceV2 service = new BankServiceV2();

        return service.getClient(clientName, securityToken);
    }

    public static void main(String[] args) {
        BankServiceV2 service = new BankServiceV2();
        Optional<String> result = null;
        try {
            result = service.publicGetClient("Alex", 321);
        } catch (SecurityTokenIsInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println("Incoming token: " + e.invalidSecurityToken);
        }

        if (result != null) {
            System.out.println(result.get().toString());
        }
//        result.ifPresent(String::toString);

//        System.out.println(result.result);
//        System.out.println(result.errorMessage);

    }
}
