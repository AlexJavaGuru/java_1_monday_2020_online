package student_andris_tresutins.homework.lesson_10.level_6;

import java.util.*;

public class BookReaderImpl implements BookReader {



    // the key is the book and boolean indicates if
    // the book has been read
    public HashMap<Book, Boolean> readBooks = new HashMap<>();

    public boolean contains(Book book){
        return readBooks.containsKey(book);
    }

    //task_14
    @Override
    public int count(){
        return readBooks.size();
    }
    public void save(Book book) {

        if (!readBooks.containsKey(book)) {
            readBooks.put(book, false);
        }

    }

    //task_16
    @Override
    public void delete(Book book) {
        readBooks.remove(book);
    }

    //task_17
    @Override
    public void showBookList() {

        for (Book element : readBooks.keySet()) {
            System.out.println(element.toString());
        }
    }

    //task_18
    @Override
    public HashSet<Book> findBookAuthor(String author) {
        HashSet<Book> books = new HashSet<>();
        for (Book book : readBooks.keySet()) {
            if (findByFirstCharactersAuthor(book, author)) {
                books.add(book);
            }
        }
        return books;
    }

    //Task_19
    @Override
    public boolean findByFirstCharactersAuthor(Book book, String chars){
        String firstChars = book.getAuthor().substring(0, chars.length());
        return firstChars.equalsIgnoreCase(chars);
    }

    //Task_20
    @Override
    public HashSet<Book> findBookTitle(String title) {
        HashSet<Book> books = new HashSet<>();
        for (Book book : readBooks.keySet()) {
            if (findByFirstCharactersTitle(book, title)) {
                books.add(book);
            }
        }
        return books;
    }

    //Task_21
    @Override
    public boolean findByFirstCharactersTitle(Book book, String chars) {
        String firstChars = book.getTitle().substring(0, chars.length());
        return firstChars.equalsIgnoreCase(chars);
    }

    //Task_22
    @Override
    public boolean setBookRead(Book book) {
        if (!readBooks.containsKey(book)) {
            return false;
        }
        readBooks.put(book, true);
        return true;


    }

    //Task_23
    @Override
    public boolean setBookUnRead(Book book) {
        if (!readBooks.containsKey(book)) {
            return false;
        }
        readBooks.put(book, false);
        return true;

    }

    //Task_24
    @Override
    public void showReadBooks() {

        for (Map.Entry<Book, Boolean> element : readBooks.entrySet()) {
            //checks if book is read
            if(element.getValue()){
                System.out.println(element.toString());
            }
        }

    }

    //Task_25
    @Override
    public void showUnReadBooks(){
        for (Map.Entry<Book, Boolean> element : readBooks.entrySet()) {
            //checks if book is not read
            if(!element.getValue()){
                System.out.println(element.toString());
            }
        }

    }
}
