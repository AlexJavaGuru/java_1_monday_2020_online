package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface SearchCriteria {

    boolean match(Book book);
}

//Task_15
/*
Продолжаем разработку интерфейса BookDatabase.

Для представления сложных критериев поиска книг в базе данных создайте
интерфейс SearchCriteria со следующим методом:

    boolean match(Book book);
 */

//Task_16
/*
Продолжаем разработку интерфейса BookDatabase.

Создайте класс AuthorSearchCriteria:

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если автор книги совпадает с this.authorToSearch
        // иначе return false
    }

}

Протестируйте этот класс.
 */

//Task_17
/*
Продолжаем разработку интерфейса BookDatabase.

Создайте класс TitleSearchCriteria:

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если название книги совпадает с this.titleToSearch
        // иначе return false
    }

}

Протестируйте этот класс.
 */

//Task_18
/*
Продолжаем разработку интерфейса BookDatabase.

Создайте класс YearOfIssueSearchCriteria:

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если год выпуска книги совпадает с this.yearOfIssueToSearch
        // иначе return false
        // добавьте в класс Book новое свойство - yearOfIssue - год выпуска
    }

}

Протестируйте этот класс.
 */

//Task_19
/*
Продолжаем разработку интерфейса BookDatabase.

Создайте класс AndSearchCriteria:

class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
    }

}

Протестируйте этот класс.
 */

//Task_20
/*
Продолжаем разработку интерфейса BookDatabase.

Создайте класс OrSearchCriteria:

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет левому или правому условию
        // иначе return false
    }

}

Протестируйте этот класс.
 */