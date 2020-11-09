package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction{    //   Task_34

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Title: ");
        String bookTitle = scanner.nextLine();
        List<Book> books = bookDatabase.findByTitle(bookTitle);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
