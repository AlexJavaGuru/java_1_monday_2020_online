package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14;
/*
Создаём и реализуем интерфейс BookReader.

Для устройства чтения электронных книг требуется разработать прототип.

Первую функциональность, которую бизнес хочет реализовать:
- добавление книг в электронную библиотеку для дальнейшего чтения.

К этой функциональности выдвигается следующее требование:
- в электронную библиотеку уствойства нельзя добавлять
  одинаковые книги (книги у которых автор и название совпадают).
- при попытке добавления уже существующей в библиотеке книги
  ваша программа должна возвращать false - это будет означать
  что книга не добавлена в электронную библиотеку, а при
  успешном добавлении книги в электронную библиотеку программа
  должна возвращать true.

Создайте интерфейс BookReader и его реализацию BookReaderImpl
(Impl - сокращение от Implementation) и реализуйте выше указанные
требования. Если вам нужно, то вы можете создавать дополнительные
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
        electronicLibrary.add(book);
        return true;
    }

}
