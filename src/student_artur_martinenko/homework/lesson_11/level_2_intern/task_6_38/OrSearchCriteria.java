package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

}
