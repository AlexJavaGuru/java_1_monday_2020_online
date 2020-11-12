package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaTest {
    public static void main(String[] args) {
        /*
        Создайте класс SearchCriteriaDemo и с помощью
    классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
    - автор книги "Kuper" и название "Zveroboi"
    - автор книги "Kuper" и год выпуска 1890
    - автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"


Пример:
    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
         */
        BookDatabase victimTwo = new BookDatabaseImpl();
        Book book = new Book("Kuper", "Zveroboi","1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");


        System.out.println("1 " + authorSearchCriteria.match(book));
        System.out.println("2 " + titleSearchCriteria.match(book));
        System.out.println("3 " + yearOfIssueSearchCriteria.match(book));

        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println("4 " + andSearchCriteria.match(book));

        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println("5 " + orSearchCriteria.match(book));




    }
}
