package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner input = new Scanner(System.in);

        System.out.println( "enter book id to find: ");
        Long idOfBook = input.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(idOfBook);

        System.out.println(bookOpt.get());
    }

}
