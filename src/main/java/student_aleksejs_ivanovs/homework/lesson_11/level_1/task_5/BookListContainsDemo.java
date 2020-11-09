package student_aleksejs_ivanovs.homework.lesson_11.level_1.task_5;

/*Дан класс Book:

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}

Создайте класс BookListContainsDemo в котором продемонстрируйте как
проверяют есть ли в списке данная книга или её нет. Если для правильной
работы выбранной вами функциональности требуется внести изменения в
класс Book, сделайте это!

PS: подсказка по функциональности в названии класса :).*/

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Alien", "Moon");
        bookList.add(book);
        boolean isBookInList = bookList.contains(book);
        System.out.println(isBookInList);
    }

}
