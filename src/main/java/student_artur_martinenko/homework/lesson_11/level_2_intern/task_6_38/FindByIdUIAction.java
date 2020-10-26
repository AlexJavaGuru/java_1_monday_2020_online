package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;
//Task_31

import java.util.Optional;
import java.util.Scanner;

/*
Разработка UI (User Interface) для интерфейса BookDatabase.

Создайте и реализуйте класс FindByIdUIAction:

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
    }

}
 */
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = (Optional<Book>) bookDatabase.findById(id);
        System.out.println(bookOpt.get());
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
    }

}
