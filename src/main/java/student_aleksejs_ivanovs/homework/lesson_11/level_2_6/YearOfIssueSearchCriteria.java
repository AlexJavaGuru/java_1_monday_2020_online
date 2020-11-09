package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

class YearOfIssueSearchCriteria implements SearchCriteria{

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override   //  Task_18
    public boolean match(Book book) {
        return book.getYearOfIssue().equalsIgnoreCase(this.yearOfIssueToSearch);
    }

}
