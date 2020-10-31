package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Set;

@CodeReview(approved = true)
interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Object findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();


}

//Task_6
/*
Дан класс:

class Book {
    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}

Создайте интерфейс BookDatabase и объявите в нём один метод:

    Long save(Book book);

Этот метод предназначен для сохранения книг в базу данных.
При сохранении каждой книге даётся уникальный номер (id).
Id это целое число. Первая в базе книга получает значение id = 1,
вторая id = 2 и так далее (автоинкремент - для каждой следующей книги
значение id просто увеличивается на единицу). Id присваивается в момент
сохранения книги в базу данных и больше никогда не меняется.

Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
храните в списке.
 */

//Task_7
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    boolean delete(Long bookId);

Данный метод предназначен для удаления книги с указанным id в качестве параметра метода
из базы данных. Медот возвращает true если книга с указанным id была найдена
в базе данных и успешна удалена, иначе false.

Реализуйте данный метод и протестируйте его.
 */

//Task_8
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    boolean delete(Book book);

Данный метод предназначен для удаления книги указанной в качестве параметра метода
из базы данных. Медот возвращает true если книга была найдена
в базе данных и успешна удалена, иначе false.

Реализуйте данный метод и протестируйте его.
 */

//Task_9
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    Optional<Book> findById(Long bookId);

Данный метод предназначен для поиска книги с указанным id в качестве параметра
метода в базе данных. Медот возвращает Optional.of(book) если книга была найдена
в базе данных, иначе Optional.empty().

Перед реализацией данного метода прочитайте про класс Optional и узнайте
для чего он был создан и как применяется.

Реализуйте данный метод и протестируйте его.
 */

//Task_10
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    List<Book> findByAuthor(String author);

Данный метод предназначен для поиска книг указанного автора в базе данных.

Реализуйте данный метод и протестируйте его.
 */

//Task_11
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    List<Book> findByTitle(String title);

Данный метод предназначен для поиска всех книг с указанным названием в базе данных.

Реализуйте данный метод и протестируйте его.
 */

//Task_12
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    int countAllBooks();

Данный метод предназначен для подсчёта количества книг в библиотеке.

Реализуйте данный метод и протестируйте его.
 */

//Task_13
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    void deleteByAuthor(String author);

Данный метод предназначен для удаления всех книг указанного автора из библиотеки.

Реализуйте данный метод и протестируйте его.
 */

//Task_14
/*
Продолжаем разработку интерфейса BookDatabase.

Добавьте в интерфейc BookDatabase следующий метод:

    void deleteByTitle(String title);

Данный метод предназначен для удаления всех книг c указанным названием из библиотеки.

Реализуйте данный метод и протестируйте его.
 */

//Task_22
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    List<Book> find(SearchCriteria searchCriteria);

Данный метод должен находить и возвращать все книги в библиотеке,
которые подходят под указанное в качестве параметра условие.

С помощью такого метода в базе данных можно будет искать книги используя
для поиска сложные условия.

Реализуйте и протестируйте данный метод.
 */

//Task_23
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    Set<String> findUniqueAuthors();

Данный метод должен находить и возвращать всех авторов книг в библиотеке.

Реализуйте и протестируйте данный метод.
 */

//Task_24
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    Set<String> findUniqueTitles();

Данный метод должен находить и возвращать все названия книг в библиотеке.

Реализуйте и протестируйте данный метод.
 */

//Task_25
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    Set<Book> findUniqueBooks();

Данный метод должен находить и возвращать все уникальные книги в библиотеке.

Реализуйте и протестируйте данный метод.
 */

//Task_26
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    boolean contains(Book book);

Данный метод должен возвращать true если такая книга уже есть в
базе данных библиотеки, иначе false.

Реализуйте и протестируйте данный метод.
 */

//Task_28
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    Map<String, List<Book>> getAuthorToBooksMap();

Данный метод должен возвращать мап в котором ключём является
автор, а значением список книг этого автора.

Реализуйте и протестируйте данный метод.
 */

//Task_29
/*
Продолжаем разработку интерфейса BookDatabase.

В интерфейсе BookDatabase создайте следующий метод:

    Map<String, Integer> getEachAuthorBookCount();

Данный метод должен возвращать мап в котором ключём является
автор, а значением количество уникальных книг этого автора в базе данных.

Реализуйте и протестируйте данный метод.
 */