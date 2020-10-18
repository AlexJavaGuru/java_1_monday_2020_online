package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private Long bookIdGenerator;
    private List<Book> bookDatabase;


    public BookDatabaseImpl() {
        this.bookDatabase = new ArrayList<>();
        this.bookIdGenerator = 1L;
    }

    public List<Book> getBookDatabase() {
        return new ArrayList<>(bookDatabase);
    }

    //Task_6
    @Override
    public Long save(Book book) {
        Long bookId = bookIdGenerator;
        book.setId(bookId);
        incrementIdGenerator();
        bookDatabase.add(book);
        return bookId;
    }

    //Task_6
    private void incrementIdGenerator() {
        bookIdGenerator++;
    }

    //Task_7
    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) {
                return bookDatabase.remove(book);
            }
        }
        return false;
    }

    //Task_8
    @Override
    public boolean delete(Book book) {
        return bookDatabase.remove(book);
    }

    //Task_9
    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> bookOptional = Optional.empty();
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) {
                bookOptional = Optional.of(book);
                return bookOptional;
            }
        }
        return bookOptional;
    }

    //Task_10
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookListByAuthor = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                bookListByAuthor.add(book);
            }
        }
        return bookListByAuthor;
    }

    //Task_11
    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListByTitle = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookListByTitle.add(book);
            }
        }
        return bookListByTitle;
    }

    //Task_12
    @Override
    public int countAllBooks() {
        return bookDatabase.size();
    }

    //Task_13
    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksOfAuthorToDelete = new ArrayList<>(findByAuthor(author));
        bookDatabase.removeAll(booksOfAuthorToDelete);
    }

    //Task_14
    @Override
    public void deleteByTitle(String title) {
        List<Book> booksWithCertainTitleToDelete = new ArrayList<>(findByTitle(title));
        bookDatabase.removeAll(booksWithCertainTitleToDelete);
    }

    //Task_22
    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> matchBooks = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (searchCriteria.match(book)) {
                matchBooks.add(book);
            }
        }
        return matchBooks;
    }

    //Task_23
    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> allAuthors = new HashSet<>();
        for (Book book : bookDatabase) {
            allAuthors.add(book.getAuthor());
        }
        return allAuthors;
    }

    //Task_24
    @Override
    public Set<String> findUniqueTitles() {
        Set<String> allUniqueTitles = new HashSet<>();
        for (Book book : bookDatabase) {
            allUniqueTitles.add(book.getTitle());
        }
        return allUniqueTitles;
    }

    //Task_25
    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookDatabase);
    }

    //Task_26
    @Override
    public boolean contains(Book book) {
        return bookDatabase.contains(book);
    }

    //Task_28
    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorListOfBooksMap = new HashMap<>();
        Set<String> allAuthors = findUniqueAuthors();
        List<Book> booksByAuthor;
        for (String author : allAuthors) {
            booksByAuthor = new ArrayList<>(findByAuthor(author));
            authorListOfBooksMap.put(author, booksByAuthor);
        }
        return authorListOfBooksMap;
    }

    //Task_29
    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, List<Book>> authorListOfBooksMap = new HashMap<>(getAuthorToBooksMap());
        Map<String, Integer> authorQuantityOfBooksMap = new HashMap<>();
        for (Map.Entry<String, List<Book>> author : authorListOfBooksMap.entrySet()) {
            authorQuantityOfBooksMap.put(author.getKey(), author.getValue().size());
        }
        return authorQuantityOfBooksMap;
    }
}
