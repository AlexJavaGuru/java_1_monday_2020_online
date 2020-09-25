package student_andris_tresutins.homework.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Book {
    private String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}
