package student_andris_tresutins.homework.lesson_11.level_2_To_6;

public class AuthorSearchCriteria implements SearchCriteria{
    //Task_16

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if(book.getAuthor().equals(this.authorToSearch)){
            return true;
        }
        return false;
    }
}
