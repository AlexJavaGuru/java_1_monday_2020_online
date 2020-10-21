package teacher.lesson_12.lessoncode;

import java.util.Optional;
import java.util.function.Consumer;

public class BankServiceV3 {

    private Optional<String> getClient(String clientName, Integer securityToken) {
        if (securityToken != 123) {
            SecurityTokenIsInvalidException exception = new SecurityTokenIsInvalidException("Invalid Security Token", securityToken);
            throw exception;
        } else if (clientName.equals("Alex")) {
            return Optional.of("Alex");
        } else {
            return Optional.empty();
        }
    }

    public Optional<String> publicGetClient(String clientName, Integer securityToken) {
        BankServiceV3 service = new BankServiceV3();

        return service.getClient(clientName, securityToken);
    }

    public static void main(String[] args) {
        BankServiceV3 service = new BankServiceV3();
        Optional<String> result = null;
        try {
            result = service.publicGetClient("Alex", 321);
        } catch (SecurityTokenIsInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println(e.invalidSecurityToken);
        } catch (RuntimeException e) {
            System.out.println("Something went wrong");
        } catch (Throwable e) {
            System.out.println("wow! I got Throwable here");
        } finally {
            System.out.println("Hello from finally block");
        }

        if (result != null) {
            System.out.println(result.get().toString());
        }

//        result.ifPresent(String::toString);


//        System.out.println(result.result);
//        System.out.println(result.errorMessage);

    }
}
