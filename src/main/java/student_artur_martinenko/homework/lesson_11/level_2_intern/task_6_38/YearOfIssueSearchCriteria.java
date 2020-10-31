package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    //Task_18
    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equalsIgnoreCase(yearOfIssueToSearch);
    }

}
