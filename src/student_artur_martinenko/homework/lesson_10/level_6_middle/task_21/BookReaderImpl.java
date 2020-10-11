package student_artur_martinenko.homework.lesson_10.level_6_middle.task_21;
/*
Продолжаем создавать интерфейс BookReader.

Для устройства чтения электронных книг требуется разработать прототип.

Для облегчения пользователю поиска книг по названию
бизнес хочет внести следующие изменения:
- программа должна находить и возвращать книги у которых
  название полностью совпадает с указанным пользователем
  и те книги у которых название начинается с букв указанным пользователем.
  Тоесть, если пользователь указал "Таинственный" программа должна найти
  книгу с названием "Таинственный Остров".

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
            if (matchAuthorByFirstLetters(book, authorName)) {
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

    @Override
    public ArrayList<Book> findBooksByTitle(String title) {
        ArrayList<Book> bookTitles = new ArrayList<>();
        for (Book book : electronicLibrary) {
            if (matchTitleByFirstLetters(book, title)) {
                bookTitles.add(book);
            }
        }
        return bookTitles;
    }

    private boolean matchAuthorByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getAuthor().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }

    private boolean matchTitleByFirstLetters(Book book, String firstLetters) {
        String authorFirstLetters = book.getTitle().substring(0, firstLetters.length());
        return authorFirstLetters.equalsIgnoreCase(firstLetters);
    }

}
