package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

class SearchCriteriaTest {

    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.authorSearchCriteriaTest();
        test.titleSearchCriteriaTest();
        test.yearOfIssueSearchCriteriaTest();
        test.andSearchCriteriaTest();
        test.orSearchCriteriaTest();
    }

    public void authorSearchCriteriaTest() {   //   Task_16
        Book book = new Book("Alien", "Moon");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Alien");
        boolean actualResult = authorSearchCriteria.match(book);
        check(actualResult, "authorSearchCriteriaTest");
    }

    public void titleSearchCriteriaTest() {   //   Task_17
        Book book = new Book("Alien", "Moon");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Moon");
        boolean actualResult = titleSearchCriteria.match(book);
        check(actualResult, "titleSearchCriteriaTest");
    }

    public void yearOfIssueSearchCriteriaTest() {   //   Task_18
        Book book = new Book("Alien", "Moon", "2020");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2020");
        boolean actualResult = searchCriteria.match(book);
        check(actualResult, "yearOfIssueSearchCriteriaTest");
    }

    public void andSearchCriteriaTest() {   //   Task_19
        Book book = new Book("Alien", "Moon", "2020");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Alien");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        boolean actualResult = andSearchCriteria.match(book);
        check(actualResult, "andSearchCriteriaTest");
    }

    public void orSearchCriteriaTest() {   //   Task_20
        Book book = new Book("Alien", "Moon", "2020");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Moon");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        boolean actualResult = orSearchCriteria.match(book);
        check(actualResult, "orSearchCriteriaTest");
    }

    private void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + true + " but actual result was : " + actualResult);
        }
    }

}
