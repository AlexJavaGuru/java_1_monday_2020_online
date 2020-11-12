package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria{
    //Task_16

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch); //Можно было упростить вот до такого
    }
}
