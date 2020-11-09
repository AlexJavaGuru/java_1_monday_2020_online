package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import java.util.Scanner;

class SaveBookUIAction implements UIAction{ //  Task_31

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
    }

}
