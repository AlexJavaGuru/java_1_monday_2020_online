package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override   //  Task_19
    public boolean match(Book book) {
        return this.leftCondition.match(book) && this.rightCondition.match(book);
    }

}
