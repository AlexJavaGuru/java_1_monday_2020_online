package student_andris_tresutins.homework.lesson_10.level_6;


public interface BookReader {

    int count();
    boolean contains(Book book);
    void save(Book book);
    void delete(Book book);
    void showBookList();


}
