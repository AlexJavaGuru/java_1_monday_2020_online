package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import java.util.*;

class BookDatabaseImpl implements BookDatabase{

    private List<Book> bookDatabase = new ArrayList<>();
    Long bookId = 1L;

    @Override   //  Task_6
    public Long save(Book book) {
        book.setId(bookId);
        bookDatabase.add(book);
        bookId++;
        return bookId;
    }

    @Override   //  Task_7
    public boolean delete(Long bookId) {
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) {
                return bookDatabase.remove(book);
            }
        }
        return false;
    }

    @Override   //  Task_8
    public boolean delete(Book book) {
        return bookDatabase.remove(book);
    }

    @Override   //  Task_9
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override   //  Task_10
    public List<Book> findByAuthor(String author) {
        List<Book> bookListByAuthor = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (book.getAuthor().equals(author)) {
                bookListByAuthor.add(book);
            }
        }
        return bookListByAuthor;
    }

    @Override   //  Task_11
    public List<Book> findByTitle(String title) {
        List<Book> bookListByTitle = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (book.getTitle().equals(title)) {
                bookListByTitle.add(book);
            }
        }
        return bookListByTitle;
    }

    @Override   //  Task_12
    public int countAllBooks() {
        return bookDatabase.size();
    }

    @Override   //  Task_13
    public void deleteByAuthor(String author) {
        bookDatabase.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override   //  Task_14
    public void deleteByTitle(String title) {
        bookDatabase.removeIf(book -> book.getTitle().equals(title));
    }

    @Override   //  Task_22
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchBooks = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (searchCriteria.match(book)) {
                searchBooks.add(book);
            }
        }
        return searchBooks;
    }

    @Override   //  Task_23
    public Set<String> findUniqueAuthors() {
        Set<String> allUniqueAuthors = new HashSet<>();
        for (Book book : bookDatabase) {
            allUniqueAuthors.add(book.getAuthor());
        }
        return allUniqueAuthors;
    }

    @Override   //  Task_24
    public Set<String> findUniqueTitles() {
        Set<String> allUniqueTitles = new HashSet<>();
        for (Book book : bookDatabase) {
            allUniqueTitles.add(book.getTitle());
        }
        return allUniqueTitles;
    }

    @Override   //  Task_25
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookDatabase);
    }

    @Override   //  Task_26
    public boolean contains(Book book) {
        return bookDatabase.contains(book);
    }

    @Override   //  Task_28
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorBooksMap = new HashMap<>();
        Set<String> allAuthors = findUniqueAuthors();
        List<Book> booksByAuthor;
        for (String author : allAuthors) {
            booksByAuthor = new ArrayList<>(findByAuthor(author));
            authorBooksMap.put(author, booksByAuthor);
        }
        return authorBooksMap;
    }

    @Override   //  Task_29
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, List<Book>> authorBooksMap = new HashMap<>(getAuthorToBooksMap());
        Map<String, Integer> authorQuantityOfBooksMap = new HashMap<>();
        for (Map.Entry<String, List<Book>> author : authorBooksMap.entrySet()) {
            authorQuantityOfBooksMap.put(author.getKey(), author.getValue().size());
        }
        return authorQuantityOfBooksMap;
    }

}