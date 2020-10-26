package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    //Task_16
    @Override
    public boolean match(Book book) {
        return book.getAuthor().equalsIgnoreCase(authorToSearch);
    }

}
