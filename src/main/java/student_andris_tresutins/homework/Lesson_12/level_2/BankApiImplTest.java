package student_andris_tresutins.homework.Lesson_12.level_2;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);
        clients.add(new BankClient("1", "Jeremy Clarkson"));

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);
        roles.add(Role.CAN_SEARCH_CLIENTS);



        try {
            api.findByUid(credentials, "1");
            System.out.println("TEST FAIL");
            // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}