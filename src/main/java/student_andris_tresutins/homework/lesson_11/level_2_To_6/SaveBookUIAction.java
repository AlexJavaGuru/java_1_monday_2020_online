package student_andris_tresutins.homework.lesson_11.level_2_To_6;


import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner input = new Scanner(System.in);

        System.out.println( "enter book author: ");
        String author = input.nextLine();

        System.out.println( "enter book title: ");
        String title = input.nextLine();

        System.out.println( "enter book year of issue: ");
        String yearOfIssue = input.nextLine();


        Book book = new Book(author, title, yearOfIssue);

        bookDatabase.save(book);
    }

}