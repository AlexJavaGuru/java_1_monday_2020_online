package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.*;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Плохо, что вы используете класс HashSet, а не интерфейс. Это делает вашу программу" +
        "менее гибкой. " +
        "Если вы используете Set, то можно не переживать, найдете ли вы такой объект в коллекции или нет" +
        "Для проверки можно было использовать метод add - он сам вернет boolean в зависимости от того, был добавлен элемент или нет" +
        "public boolean delete(Long bookId) - очень сложно. Вам не надо самому использовать итератор." +
        "Думаю, вы пытались решить проблему с модификацией коллекции в процессе итерации. Думаю, что у вас бы работало и просто с .delete")
public class BookDatabaseImpl implements BookDatabase {

    HashSet<Book> list = new HashSet<>();
    Long bookId = 1L;

    //Task_6
    @Override
    public Long save(Book book) {
        if (!list.contains(book)) {
            book.setId(bookId);
            list.add(book);
            ++bookId;
            return bookId;
        }
        return null;
    }

    //Task_7
    @Override
    public boolean delete(Long bookId) {
        Iterator<Book> itr = list.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.getId().equals(bookId)) {
                itr.remove();
                return true;
            }
        }
        return false;
    }


    //Task_8
    @Override
    public boolean delete(Book book){
        if (list.contains(book)){
            list.remove(book);
            return true;
        }
        return false;
    }

    //Task_9
    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: list){
            if(book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    //Task_10
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooksByAuthor = new ArrayList<>();
        for (Book book: list){
            if(book.getAuthor().equals(author)){
                foundBooksByAuthor.add(book);
            }
        }
        return foundBooksByAuthor;
    }

    //Task_11
    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooksByTitle = new ArrayList<>();
        for (Book book: list){
            if(book.getTitle().equals(title)){
                foundBooksByTitle.add(book);
            }
        }
        return foundBooksByTitle;
    }

    //Task_12
    @Override
    public int countAllBooks(){
        return list.size();
    }

    //Task_13
    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> itr = list.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if(book.getAuthor().equals(author)){
                itr.remove();
            }
        }
    }

    //Task_14
    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> itr = list.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if(book.getTitle().equals(title)){
                itr.remove();
            }
        }
    }

    //Task_22
    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundByCriteria = new ArrayList<>();
        for (Book book: list){
            if(searchCriteria.match(book)) {
                foundByCriteria.add(book);
            }
        }
        return foundByCriteria;

    }

    //Task_23
    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book: list) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    //Task_24
    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book: list) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    //Task_25
    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> books = new HashSet<>();
        for (Book book: list) {
            books.add(book);
        }
        return books;
    }

    //Task_26
    @Override
    public boolean contains(Book book) {
        return list.contains(book);
    }

    //Task_28
    @Override
    public Map<String, List<Book>> getAuthorToBooksMap(){
        Map<String, List<Book>> authorBookMap = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        List<Book> booksByAuthor;
        for(String author : authors) {
            booksByAuthor = new ArrayList<>(findByAuthor(author));
            authorBookMap.put(author, booksByAuthor);
        }
        return authorBookMap;
    }

    //Task_29
    @Override
    public Map<String, Integer> getEachAuthorBookCount(){
        Map<String, Integer> authorBookCountMap = new HashMap<>();
        Map<String, List<Book>> authorBooksMap = new HashMap<>(getAuthorToBooksMap());
        for(Map.Entry<String, List<Book>> author : authorBooksMap.entrySet()){
            authorBookCountMap.put(author.getKey(), author.getValue().size());
        }
        return authorBookCountMap;

    }

}


