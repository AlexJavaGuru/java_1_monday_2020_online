package student_artur_martinenko.homework.lesson_12.level_2_intern.task_7_17;


import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) throw new AccessDeniedException();
        for (BankClient bankClient : clients) {
            if (bankClient.getUid().equals(uid)) {
                return Optional.of(bankClient);
            }
        }
        return Optional.empty();
    }

}

//Task_12
/*
Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
    }

}

Реализуйте класс BankApiImpl и метод findByUid().
 */

//Task_13
/*
Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}

Создайте класс BankApiImplTest и напишите тесты для метода findByUid().
 */

//Task_16
/*
Маленькое улучшение кода (рефакторинг).

Как можно упростить это условие?

credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)

Данные для этой проверки - это список ролей, который находится
в классе UserCredentials:

class UserCredentials {

    private List<Role> roles;  // вот этот список

    // поэтому можно создать в этом классе простой метод
    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

}

После этого код

credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)

можно заменить на

credentials.hasRole(Role.CAN_SEARCH_CLIENTS)

Маленькое улучшение, но согласитесь, что читать такой код намного приятнее и проще.
 */
