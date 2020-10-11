package student_artur_martinenko.homework.lesson_10.level_6_middle.task_15;
/*
Продолжаем создавать интерфейс BookReader.

Для устройства чтения электронных книг требуется разработать прототип.

Бизнес хочет добавить следующую функциональность в программу:
- удаление книги из электронной библиотеки. Пользователь указав
  книгу может её удалить из электронной библиотеки устройства.

К этой функциональности выдвигается следующее требование:
- при попытке удаления не существующей в библиотеке книги
  ваша программа должна возвращать false - это будет означает
  что указанная пользователем книга не была удалена из
  электронной библиотеки, а при удалении книги из
  электронной библиотеки программа должна возвращать true.

Внесите в интерфейс BookReader и его реализацию BookReaderImpl
(Impl - сокращение от Implementation) требуемые изменения.
Если вам нужно, то вы можете создавать дополнительные
классы.

То, что ваше решение реализует все требования бизнеса докажите
автоматическими юнит тестами.
 */

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> electronicLibrary;

    public BookReaderImpl() {
        this.electronicLibrary = new ArrayList<>();
    }

    @Override
    public boolean addBookToLibrary(Book book) {
        if (electronicLibrary.contains(book)) return false;
        if (authorOrTitleIsEmpty(book)) return false;
        electronicLibrary.add(book);
        return true;
    }

    @Override
    public boolean authorOrTitleIsEmpty(Book book) {
        return book.getAuthor().isEmpty() || book.getTitle().isEmpty();
    }
}
