package student_artur_martinenko.homework.lesson_10.level_6_middle.task_18;
/*
Продолжаем создавать интерфейс BookReader.

Для устройства чтения электронных книг требуется разработать прототип.

Бизнес хочет добавить следующую функциональность в программу:
- поиск книг по автору.

К этой функциональности выдвигается следующее требование:
- программа должна находить и возвращать только те книги, у которых
  автор полностью совпадает с указанным пользователем.

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

    @Override
    public boolean removeBookFromLibrary(Book book) {
        return electronicLibrary.remove(book);
    }

    @Override
    public void listOfBooksInLibrary() {
        for (Book book : electronicLibrary) {
            System.out.println(book.toString());
        }
    }

    @Override
    public ArrayList<Book> findBooksByAuthor(String authorName) {
        ArrayList<Book> authorsBooks = new ArrayList<>();
        for (Book book : electronicLibrary) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

}
