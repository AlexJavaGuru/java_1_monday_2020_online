package student_dmitry_vasiliev.lesson_3.homework.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {

        private String title;

        Book(String bookTitle) {
            this.title = bookTitle;
        }

        public String getTitle() {
            return this.title;
        }

    }

