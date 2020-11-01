package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;

//Task_33
/*
Разработка UI (User Interface) для интерфейса BookDatabase.

По аналогии с предыдущими классами создайте и реализуйте класс FindByAuthorUIAction.

Так как UIAction кдассов будет много, советуем для них создать свой пакет.
 */
@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Author: ");
        String bookAuthor = scanner.nextLine();
        List<Book> bookOpt = bookDatabase.findByAuthor(bookAuthor);
        for (Book book : bookOpt) {
            System.out.println(book);
        }
    }

}
