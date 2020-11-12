package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByTitleUiAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUiAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner input = new Scanner(System.in);

        System.out.println( "enter book title to find: ");
        String title = input.nextLine();

        List<Book> bookOpt = bookDatabase.findByTitle(title);

        for (Book book : bookOpt) {
            System.out.println(book);
        }
    }
}
