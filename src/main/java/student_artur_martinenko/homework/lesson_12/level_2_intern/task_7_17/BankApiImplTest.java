package student_artur_martinenko.homework.lesson_12.level_2_intern.task_7_17;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@CodeReview(approved = true)
class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest victim = new BankApiImplTest();
        victim.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void check(String expected, String actual, String testName) {
        if (expected.equalsIgnoreCase(actual)) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    private List<BankClient> fillBankClients() {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("1", "Ivan Ivanov"));
        clients.add(new BankClient("2", "Pert Petrov"));
        clients.add(new BankClient("3", "Aleksandr Aleksandrov"));
        clients.add(new BankClient("4", "Daniil Danilov"));
        clients.add(new BankClient("5", "Ruslan Ruslanov"));
        return clients;
    }

    private List<Role> fillUserCredentials() {
        List<Role> credentials = new ArrayList<>();
        credentials.add(Role.CAN_SEARCH_CLIENTS);
        return credentials;
    }


    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        BankApiImpl bankApi = new BankApiImpl(fillBankClients());
        List<Role> credentials = new ArrayList<>();

        try {
            UserCredentials userCredentials = new UserCredentials(credentials);
            Optional<BankClient> client = bankApi.findByUid(userCredentials, "5");
        } catch (AccessDeniedException e) {
            System.out.println("Test " + testName + " - Passed.");
        } catch (NoSuchElementException e) {
            System.out.println("Test " + testName + " - FAILED. NoSuchElementException");
        }
    }
}
