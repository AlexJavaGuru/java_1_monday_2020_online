package student_andris_tresutins.homework.Lesson_12.level_2;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws student_andris_tresutins.homework.Lesson_12.level_2.AccessDeniedException;
}
