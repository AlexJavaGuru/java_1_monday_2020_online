package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class BookDatabaseImplDemo {

    public static void main(String[] args) {
        BookDatabaseImplDemo victim = new BookDatabaseImplDemo();
        victim.deleteBookByIdTest();
        victim.deleteBookByObjectTest();
        victim.findByIdOptionalTest();
        victim.findByAuthorTest();
        victim.findByTitleTest();
        victim.countAllBooksTest();
        victim.deleteByAuthorTest();
        victim.deleteByTitleTest();
        victim.matchAuthorTest();
        victim.matchTitleTest();
        victim.matchYearOfIssueTest();
        victim.AndSearchCriteriaTest();
        victim.OrSearchCriteriaTest();
        victim.findSearchCriteriaTest();
        victim.findUniqueAuthorsTest();
        victim.findUniqueTitlesTest();
        victim.findUniqueBooksTest();
        victim.containsBooksTest();
        victim.findUniqueWordsTest();
        victim.getAuthorToBooksMapTest();
        victim.getEachAuthorBookCountTest();


    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void check(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }


    //Task_7
    public void deleteBookByIdTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        database.save(new Book("Sasha Pushkin", "title1"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        boolean flag = database.delete(3L);
        check(true, flag, "deleteBookByIdTest");
    }

    //Task_8
    public void deleteBookByObjectTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book = new Book("Sasha Pushkin", "title");
        database.save(book);
        boolean flag = database.delete(book);
        check(true, flag, "deleteBookByObjectTest");
    }

    //Task_9
    public void findByIdOptionalTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        Book bookOptional = database.findById(1L).get();
        boolean flag = bookOptional.getId() == 1L;
        check(true, flag, "findByIdOptionalTest");
    }

    //Task_10
    public void findByAuthorTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        List<Book> bookListByAuthor = new ArrayList<>(database.findByAuthor("Sasha Pushkin"));
        boolean flag = !bookListByAuthor.isEmpty();
        check(true, flag, "findByAuthorTest");
    }

    //Task_11
    public void findByTitleTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        List<Book> bookListByTitle = new ArrayList<>(database.findByTitle("title"));
        boolean flag = !bookListByTitle.isEmpty();
        check(true, flag, "findByTitleTest");
    }

    //Task_12
    public void countAllBooksTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        database.save(new Book("Sasha Pushkin", "title1"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        boolean flag = database.countAllBooks() == 3;
        check(true, flag, "countAllBooksTest");
    }

    //Task_13
    public void deleteByAuthorTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        database.save(new Book("Sasha Pushkin", "title1"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        database.deleteByAuthor("Sasha Pushkin");
        boolean flag = database.countAllBooks() == 1;
        check(true, flag, "deleteByAuthorTest");
    }

    //Task_14
    public void deleteByTitleTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title"));
        database.save(new Book("Sasha Pushkin1", "title"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        database.deleteByTitle("title");
        boolean flag = database.countAllBooks() == 1;
        check(true, flag, "deleteByTitleTest");
    }

    //Task_16
    public void matchAuthorTest() {
        Book book = new Book("Sasha Pushkin", "title");
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Sasha Pushkin");
        boolean flag = searchCriteria.match(book);
        check(true, flag, "matchAuthorTest");
    }

    //Task_17
    public void matchTitleTest() {
        Book book = new Book("Sasha Pushkin", "title");
        SearchCriteria searchCriteria = new TitleSearchCriteria("title");
        boolean flag = searchCriteria.match(book);
        check(true, flag, "matchTitleTest");
    }

    //Task_18
    public void matchYearOfIssueTest() {
        Book book = new Book("Sasha Pushkin", "title", "1990");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("1990");
        boolean flag = searchCriteria.match(book);
        check(true, flag, "matchYearOfIssueTest");
    }

    //Task_19
    public void AndSearchCriteriaTest() {
        Book book = new Book("Sasha Pushkin", "title", "1990");
        SearchCriteria searchYearCriteria = new YearOfIssueSearchCriteria("1990");
        SearchCriteria searchAuthorCriteria = new AuthorSearchCriteria("Sasha Pushkin");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(searchAuthorCriteria, searchYearCriteria);
        boolean flag = andSearchCriteria.match(book);
        check(true, flag, "AndSearchCriteriaTest");
    }

    //Task_20
    public void OrSearchCriteriaTest() {
        Book book = new Book("Sasha Pushkin", "title", "1990");
        SearchCriteria searchYearCriteria = new YearOfIssueSearchCriteria("1990");
        SearchCriteria searchAuthorCriteria = new AuthorSearchCriteria("Sasha Pushkin");
        SearchCriteria andSearchCriteria = new OrSearchCriteria(searchAuthorCriteria, searchYearCriteria);
        boolean flag = andSearchCriteria.match(book);
        check(true, flag, "OrSearchCriteriaTest");
    }

    //Task_22
    public void findSearchCriteriaTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1990"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        SearchCriteria searchYearCriteria = new YearOfIssueSearchCriteria("1812");
        SearchCriteria searchAuthorCriteria = new AuthorSearchCriteria("Sasha Pushkin");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(searchAuthorCriteria, searchYearCriteria);
        List<Book> matchBooks = new ArrayList<>(database.find(andSearchCriteria));
        SearchCriteria searchTitleCriteria = new TitleSearchCriteria("NotATitle");
        SearchCriteria searchAuthorCriteria1 = new AuthorSearchCriteria("Lev Tolstoy");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(searchTitleCriteria, searchAuthorCriteria1);
        matchBooks.addAll(database.find(orSearchCriteria));
        boolean flag = matchBooks.size() == 2;
        check(true, flag, "findSearchCriteriaTest");
    }

    //Task_23
    public void findUniqueAuthorsTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1990"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        boolean flag = database.findUniqueAuthors().size() == 2;
        check(true, flag, "findUniqueAuthorsTest");
    }

    //Task_24
    public void findUniqueTitlesTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1990"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        boolean flag = database.findUniqueTitles().size() == 2;
        check(true, flag, "findUniqueTitlesTest");
    }

    //Task_25
    public void findUniqueBooksTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        boolean flag = database.findUniqueBooks().size() == 2;
        check(true, flag, "findUniqueBooksTest");
    }

    //Task_26
    public void containsBooksTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        Book book = new Book("Sasha Pushkin", "title", "1812");
        database.save(book);
        boolean flag = database.contains(book);
        check(true, flag, "containsBooksTest");
    }

    //Task_27
    public void findUniqueWordsTest(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "I'm going home home from work eating home a sandwich. " +
                "It is raining is, umbrella is needed, needed.";
        Set<String> uniqueWordSet = uniqueWordFinder.find(text);
        check(13, uniqueWordSet.size(), "findUniqueWordsTest");
    }

    //Task_28
    public void getAuthorToBooksMapTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1990"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        Map<String, List<Book>> mapOfAuthorsWithItsBooks = database.getAuthorToBooksMap();
        boolean sizeSasha = mapOfAuthorsWithItsBooks.get("Sasha Pushkin").size() == 2;
        boolean sizeNot = mapOfAuthorsWithItsBooks.get("NotAnAuthor").size() == 1;
        boolean flag = sizeSasha && sizeNot;
        check(true, flag, "getAuthorToBooksMapTest");
    }

    //Task_29
    public void getEachAuthorBookCountTest() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("Sasha Pushkin", "title", "1990"));
        database.save(new Book("Sasha Pushkin", "title", "1812"));
        database.save(new Book("NotAnAuthor", "NotATitle"));
        Map<String, Integer> mapOfAuthorsWithItsBookCount = database.getEachAuthorBookCount();
        boolean sizeSasha = mapOfAuthorsWithItsBookCount.get("Sasha Pushkin") == 2;
        boolean sizeNot = mapOfAuthorsWithItsBookCount.get("NotAnAuthor") == 1;
        boolean flag = sizeSasha && sizeNot;
        check(true, flag, "getEachAuthorBookCountTest");
    }




}
