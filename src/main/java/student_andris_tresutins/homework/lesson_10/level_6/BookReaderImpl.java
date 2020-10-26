package student_andris_tresutins.homework.lesson_10.level_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BookReaderImpl implements BookReader {

    public HashSet<Book> list = new HashSet<>();
    public boolean contains(Book book){
        return list.contains(book);
    }
    //task_14
    @Override
    public int count(){
        return list.size();
    }
    public void save(Book book) {
    // loops through list and check if book exists
        for (Book element : list) {
            if(book.equals(element)){
               return;
            }

        }
    // adds book to list if the above check passes
            list.add(book);

    }
    //task_16
    @Override
    public void delete(Book book) {

        if (list.contains(book)) {
            list.remove(book);
        }
    }
    //task_17
    @Override
    public void showBookList() {

        ;

    }

}
