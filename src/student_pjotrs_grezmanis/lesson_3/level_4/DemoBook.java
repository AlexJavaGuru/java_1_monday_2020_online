package student_pjotrs_grezmanis.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DemoBook {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

