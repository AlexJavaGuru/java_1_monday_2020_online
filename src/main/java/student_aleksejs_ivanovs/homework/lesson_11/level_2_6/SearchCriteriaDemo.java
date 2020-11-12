package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {
        Book book = new Book("Kuper","Zveroboi","1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(book));

        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearOfIssueSearchCriteria2 = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria2, yearOfIssueSearchCriteria2);
        System.out.println(searchCriteria2.match(book));

        SearchCriteria authorSearchCriteria3 = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria3 = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria3 = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria3, titleSearchCriteria3);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria3, yearOfIssueSearchCriteria3);
        System.out.println(searchCriteria3.match(book) + " , " + searchCriteria4.match(book));
    }

}
