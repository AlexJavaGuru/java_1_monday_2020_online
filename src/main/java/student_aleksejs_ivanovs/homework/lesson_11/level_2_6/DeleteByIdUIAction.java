package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction{   //  Task_35

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book Id to delete: ");
        Long bookId = scanner.nextLong();
        bookDatabase.delete(bookId);
    }

}
