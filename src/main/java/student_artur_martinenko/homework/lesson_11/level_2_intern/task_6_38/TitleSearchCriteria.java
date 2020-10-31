package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    //Task_17
    @Override
    public boolean match(Book book) {
        return book.getTitle().equalsIgnoreCase(titleToSearch);
    }

}
