package student_andris_tresutins.homework.lesson_11.level_1.Task_5;

import teacher.annotations.CodeReview;

import java.util.HashSet;

@CodeReview(approved = true)
public class BookListContainsDemo {
    public static void main(String[] args) {

        HashSet<Book> list = new HashSet<>();

        Book book = new Book("James", "Programming");

        list.add(book);

        if(list.contains(book)) {
            System.out.println("Book is in the book list");
        } else {
            System.out.println("Book is not in the book list");
        }



    }
}
