package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

import java.util.Scanner;

//Task_37
/*
Разработка UI (User Interface) для интерфейса BookDatabase.

Создайте класс BookLibraryApplication.

class BookLibraryApplication {

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.run();
    }

}

Запустите приложение и потестируйте работу его методов.

Поздравляем вас, мы создали и реализовали интерфейс для базы данных,
а так же UI к этому интерфейсу.
 */
@CodeReview(approved = true)
class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID to delete: ");
        Long bookID = scanner.nextLong();
        System.out.println("Book deleted ->\n\t" + bookDatabase.findById(bookID));
        bookDatabase.delete(bookID);
    }

}
