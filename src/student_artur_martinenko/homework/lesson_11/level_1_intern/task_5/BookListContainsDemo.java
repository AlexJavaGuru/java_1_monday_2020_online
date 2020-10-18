package student_artur_martinenko.homework.lesson_11.level_1_intern.task_5;

import java.util.ArrayList;

class BookListContainsDemo {
    public static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Book book1 = new Book("Sasha Pushkin", "title");
        Book book2 = new Book("Ivan Ivanovich", "title1");
        Book book3 = new Book("Petro Petrovich", "title3");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        boolean isBookInList = bookList.contains(book1);

        System.out.println(book1.toString()+ " is in list: " +isBookInList);
    }

}
