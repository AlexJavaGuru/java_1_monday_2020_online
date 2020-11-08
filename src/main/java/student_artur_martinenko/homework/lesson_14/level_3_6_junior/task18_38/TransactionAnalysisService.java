package student_artur_martinenko.homework.lesson_14.level_3_6_junior.task18_38;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    //Task_20-21
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactionList, int year) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    //Task_22
    public List<Transaction> sortTransactionsByValueAscending(List<Transaction> transactionList) {
        return transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    //Task_23
    public List<Transaction> sortTransactionsByValueDescending(List<Transaction> transactionList) {
        return transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    //Task_24
    public List<Transaction> sortTransactionsBy2011ValueAscending(List<Transaction> transactionList) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    //Task_25
    public List<Integer> yearsOfTransactionsMade(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    //Task_26
    public List<Integer> uniqueYearsOfTransactionsMade(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_27
    public List<String> uniqueTraderNamesOfTransactionsMade(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_28
    public List<String> uniqueCityNamesOfTransactionsMade(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_29
    public List<String> traderNamesFromCambridge(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_30-31
    public List<String> traderNamesFromCustomCity(List<Transaction> transactionList, String cityName) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(cityName))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    //Task_32
    public boolean tradersFromMilanIsPresent(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch(city -> city.equalsIgnoreCase("Milan"));
    }

    //Task_33-34
    public boolean tradersFromGivenCityIsPresent(List<Transaction> transactionList, String cityName) {
        return transactionList.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(cityName));
    }

    //Task_35
    public Optional<Integer> maxValueFormGivenTransactions(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);
    }

    //Task_36
    public Optional<Integer> minValueFormGivenTransactions(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getValue)
                .min(Integer::compareTo);
    }

    //Task_37
    public String getTraderNameListInNaturalOrder(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    //Task_38
    public String getTraderCityListInNaturalOrder(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

}

//Task_19
/*
Вам поручили задачу по анализу данных в домене трейдеров и транзакций.

Создайте класс TransactionAnalysisService:

class TransactionAnalysisService {


}

Напишите метод, который принимает на вход список транзакций
и находит все транзакции совершённые в 2011 году. Реализацию
этого метода напишите с использованием Stream API.

Создайте класс TransactionAnalysisServiceTest и напишите юнит тест
для созданного вами метода. Для тестирования используйте следующие тестовые данные:

class TransactionTestData {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
    }

}
 */

//Task_20
/*
При реализации задачи из предыдущего задания у вас получился такой метод:

public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
    return transactions.stream()
                       .filter(t -> t.getYear() == 2011)
                       .collect(toList());
}

Как сделать этот метод более универсальным?

Подсказка: на данный момент этот метод умеет находить только транзакции
совершённые в 2011 году. Представьте себе, что вас попросили найти все
транзакции совершённые в 2010, 2012, 2013, и т.д. Для каждого года вы
будете писать свой метод? Или есть более простой способ это сделать?
 */

//Task_21
/*
Конечно создавать для каждого года новый метод это не вариант.
Слишком много годов, слишком много похожих методов.

public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
    return transactions.stream()
                       .filter(t -> t.getYear() == 2011)
                       .collect(toList());
}

public List<Transaction> findTransactionsIn2012(List<Transaction> transactions) {
    return transactions.stream()
                       .filter(t -> t.getYear() == 2012)
                       .collect(toList());
}

public List<Transaction> findTransactionsIn2013(List<Transaction> transactions) {
    return transactions.stream()
                       .filter(t -> t.getYear() == 2013)
                       .collect(toList());
}

Что бы сделать этот метод более универсальным можно вынести в параметр метода
год по которому надо искать и поменять немного название метода:

public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
    return transactions.stream()
                       .filter(t -> t.getYear() == year)
                       .collect(toList());
}

Теперь этот метод можно вызывать следующими способами:

List<Transaction> transactions = TransactionTestData.getTransactions();
List<Transaction> transactions2011 = findTransactionsByYear(transactions, 2011);
List<Transaction> transactions2012 = findTransactionsByYear(transactions, 2012);
List<Transaction> transactions2013 = findTransactionsByYear(transactions, 2013);

С помощью юнит тестов докажите, что наш новый метод работает правильно.
 */

//Task_22
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и сортирует их по параметру value от меньшего к большему.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_23
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и сортирует их по параметру value от большего к меньшему.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_24
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит все транзакции совершённые в 2011 году
и сортирует найденные транзакции по параметру value от меньшего к большему.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_25
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит все года в которых были совершены транзакции (года могут повторяться).

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_26
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит все уникальные года в которых были совершены транзакции,
(года не должны повторяться).

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_27
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит имена всех трейтеры (имена не должны повторяться).

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_28
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит все уникальные города в которых работают трейтеры.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_29
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и находит имена всех трейдеров из города Cambridge.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_30
/*
При реализации задачи из предыдущего задания у вас получился такой метод:

public List<String> findTraderNamesFromCambridge(List<Transaction> transactions) {
    return transactions.stream()
                       .map(transaction -> transaction.getTrader())
                       .map(trader -> trader.getCity())
                       .filter(city -> city.equals("Cambridge"))
                       .unique()
                       .collect(toList());
}

Представьте себе, что вас попросили найти имена трейдеров
из других городов: Milan, London, и т.д. Для каждого города вы
будете писать свой метод? Или есть более простой способ это сделать?

Как сделать метод findTraderNamesFromCambridge() более универсальным?
 */

//Task_31
/*
Конечно создавать для каждого города новый метод это не вариант.
Слишком много городов, слишком много похожих методов.

public List<String> findTraderNamesFromCambridge(List<Transaction> transactions) {
    return transactions.stream()
                       .map(transaction -> transaction.getTrader())
                       .map(trader -> trader.getCity())
                       .filter(city -> city.equals("Cambridge"))
                       .unique()
                       .collect(toList());
}

public List<String> findTraderNamesFromLondon(List<Transaction> transactions) {
    return transactions.stream()
                       .map(transaction -> transaction.getTrader())
                       .map(trader -> trader.getCity())
                       .filter(city -> city.equals("London"))
                       .unique()
                       .collect(toList());
}

public List<String> findTraderNamesFromMilan(List<Transaction> transactions) {
    return transactions.stream()
                       .map(transaction -> transaction.getTrader())
                       .map(trader -> trader.getCity())
                       .filter(city -> city.equals("Milan"))
                       .unique()
                       .collect(toList());
}

Что бы сделать этот метод более универсальным можно вынести в параметр метода
название города по которому надо искать и поменять немного название самого метода:

public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
    return transactions.stream()
                       .map(transaction -> transaction.getTrader())
                       .map(trader -> trader.getCity())
                       .filter(city -> city.equals(cityToFind))
                       .unique()
                       .collect(toList());
}

Теперь этот метод можно вызывать следующими способами:

List<Transaction> transactions = TransactionTestData.getTransactions();
List<String> traderNamesFromCambridge = findTraderNamesFromCity(transactions, "Cambridge");
List<String> traderNamesFromLondon = findTraderNamesFromCity(transactions, "London");
List<String> traderNamesFromMilan = findTraderNamesFromCity(transactions, "Milan");

С помощью юнит тестов докажите, что наш новый метод работает правильно.?
 */

//Task_32
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и возвращает:
- true если в городе Milan работает хотя бы один трейдер,
- false иначе.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_33
/*
При реализации задачи из предыдущего задания у вас получился такой метод:

public boolean isAnyTraderBasedOnMilan(List<Transaction> transactions) {
    return transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
}

Представьте себе, что вас попросили найти ответит
на вопрос: работоют ли трейдеры в других городах:
Cambridge, London, и т.д. Для каждого города вы
будете писать свой метод? Или есть более простой способ это сделать?

Как сделать метод isAnyTraderBasedOnMilan() более универсальным?
 */

//Task_34
/*
Конечно создавать для каждого города новый метод это не вариант.
Слишком много городов, слишком много похожих методов.

public boolean isAnyTraderBasedOnMilan(List<Transaction> transactions) {
    return transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
}

public boolean isAnyTraderBasedOnLondon(List<Transaction> transactions) {
    return transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader().getCity().equals("London"));
}

public boolean isAnyTraderBasedOnCambridge(List<Transaction> transactions) {
    return transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader().getCity().equals("Cambridge"));
}

Что бы сделать этот метод более универсальным можно вынести в параметр метода
название города по которому надо искать и поменять немного название самого метода:

public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
    return transactions.stream()
                       .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
}

Теперь этот метод можно вызывать следующими способами:

List<Transaction> transactions = TransactionTestData.getTransactions();
boolean cambridgeBased = isAnyTraderBasedOnCity(transactions, "Cambridge");
boolean londonBased = isAnyTraderBasedOnCity(transactions, "London");
boolean milanBased = isAnyTraderBasedOnCity(transactions, "Milan");

С помощью юнит тестов докажите, что наш новый метод работает правильно.
 */

//Task_35
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и возвращает наибольшее value из всех транзакций.

При реализации этого метода задайте себе вопрос, что
должен вернуть этот метод если ему на вход подадут
пустой список транзакций? Попробуйте сделать так,
что бы метод возвращал Optional<Integer>.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_36
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и возвращает наименьшее value из всех транзакций.

При реализации этого метода задайте себе вопрос, что
должен вернуть этот метод если ему на вход подадут
пустой список транзакций? Попробуйте сделать так,
что бы метод возвращал Optional<Integer>.

Реализацию этого метода напишите с использованием Stream API.

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_37
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и возвращает строку с именами трейдеров
отсортированных в алфавитном порядке
и разделённых запятой (пример: Alan,Brian,Mario,Raoul).

Реализацию этого метода напишите с использованием Stream API.
Для объединения имён трейдеров в строку воспользуйтесь
Collectors.joining(",").

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */

//Task_38
/*
В классе TransactionAnalysisService
напишите метод, который принимает на вход список транзакций
и возвращает строку с уникальными названиями городов
из которых работают трейдеры
отсортированных в алфавитном порядке
и разделённых запятой (пример: Cambridge,Milan).

Реализацию этого метода напишите с использованием Stream API.
Для объединения названий городов в строку воспользуйтесь
Collectors.joining(",").

В классе TransactionAnalysisServiceTest напишите юнит тест для созданного вами метода.

Для тестирования используйте тестовые данные из класса TransactionTestData.
 */