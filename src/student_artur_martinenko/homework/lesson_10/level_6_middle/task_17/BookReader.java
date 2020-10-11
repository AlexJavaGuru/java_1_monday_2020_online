package student_artur_martinenko.homework.lesson_10.level_6_middle.task_17;

interface BookReader {

    boolean addBookToLibrary(Book book);

    boolean authorOrTitleIsEmpty(Book book);

    boolean removeBookFromLibrary(Book book);

    void listOfBooksInLibrary();


}
