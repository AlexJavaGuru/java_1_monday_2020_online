package student_andris_tresutins.homework.Lesson_12.level_2;

import teacher.annotations.CodeReview;

import java.nio.file.AccessDeniedException;
import java.util.Optional;
@CodeReview(approved = true)
public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws student_andris_tresutins.homework.Lesson_12.level_2.AccessDeniedException;
}
