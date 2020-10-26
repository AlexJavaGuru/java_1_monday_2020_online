package teacher.lesson_12.lessoncode;

public class SecurityTokenIsInvalidException extends RuntimeException {

    public Integer invalidSecurityToken;

    public SecurityTokenIsInvalidException(String message, Integer invalidSecurityToken) {
        super(message);
        this.invalidSecurityToken = invalidSecurityToken;
    }
}
