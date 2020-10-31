package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;
//Task_32
/*
Разработка UI (User Interface) для интерфейса BookDatabase.

Создайте и реализуйте класс SaveBookUIAction:

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }

}
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Enter book Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter book publishing year: ");
        String bookYear = scanner.nextLine();
        Book book = new Book(bookAuthor, bookTitle, bookYear);
        bookDatabase.save(book);
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }

}
