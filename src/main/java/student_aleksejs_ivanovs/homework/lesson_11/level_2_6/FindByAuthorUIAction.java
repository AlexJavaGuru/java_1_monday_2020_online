package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction{    //   Task_33

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Author: ");
        String bookAuthor = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(bookAuthor);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
