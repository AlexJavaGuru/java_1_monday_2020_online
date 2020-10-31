package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;
//Task_34
/*
Разработка UI (User Interface) для интерфейса BookDatabase.

По аналогии с предыдущими классами создайте и реализуйте класс FindByTitleUIAction.
 */

import teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Title: ");
        String bookTitle = scanner.nextLine();
        List<Book> bookOpt = bookDatabase.findByTitle(bookTitle);
        for (Book book : bookOpt) {
            System.out.println(book);
        }
    }

}
