package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner input = new Scanner(System.in);

        System.out.println( "enter book id to delete: ");
        Long idOfBook = input.nextLong();

        bookDatabase.delete(idOfBook);
    }
}
