package student_andris_tresutins.homework.lesson_11.level_2_To_6;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {

        if(book.getYearOfIssue().equals(this.yearOfIssueToSearch)){
            return true;
        }
        return false;

    }

}
