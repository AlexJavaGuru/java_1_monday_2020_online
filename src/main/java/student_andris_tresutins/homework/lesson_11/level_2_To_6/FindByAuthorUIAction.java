package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

        private BookDatabase bookDatabase;

        public FindByAuthorUIAction(BookDatabase bookDatabase) {
            this.bookDatabase = bookDatabase;
        }

        @Override
        public void execute() {

            Scanner input = new Scanner(System.in);

            System.out.println( "enter book author to find: ");
            String author = input.nextLine();

            List<Book> bookOpt = bookDatabase.findByAuthor(author);

            for (Book book : bookOpt) {
                System.out.println(book);
            }
        }
}

