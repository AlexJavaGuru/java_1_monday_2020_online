package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

//Task_21
/*
Продолжаем разработку интерфейса BookDatabase.

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
@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {

        //Task_21
        Book book = new Book("Kuper", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(book));

        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria1, yearSearchCriteria);
        System.out.println(searchCriteria1.match(book));


        SearchCriteria authorOrSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleOrSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOrSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchOrCriteriaAuthorYear = new OrSearchCriteria(authorOrSearchCriteria, yearOrSearchCriteria);
        SearchCriteria searchOrCriteriaAuthorTitle = new OrSearchCriteria(authorOrSearchCriteria, titleOrSearchCriteria);
        System.out.println(searchOrCriteriaAuthorYear.match(book));
        System.out.println(searchOrCriteriaAuthorTitle.match(book));

    }
}
