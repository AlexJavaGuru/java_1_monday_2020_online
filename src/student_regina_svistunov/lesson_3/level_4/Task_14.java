package student_regina_svistunov.lesson_3.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Лучше в одном классе не делать два класса на данном этапе ))")
class Book {

    private String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

