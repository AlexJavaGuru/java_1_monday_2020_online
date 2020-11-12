package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override   //  Task_17
    public boolean match(Book book) {
        return book.getTitle().equalsIgnoreCase(this.titleToSearch);
    }

}
