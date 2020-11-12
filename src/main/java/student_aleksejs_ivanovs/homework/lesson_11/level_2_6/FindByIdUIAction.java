package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction{    //   Task_32

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        Long id = scanner.nextLong();
        Optional<Book> books = (Optional<Book>) bookDatabase.findById(id);
        System.out.println(books.get());
    }

}
