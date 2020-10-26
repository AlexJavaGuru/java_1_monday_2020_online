package student_lilija_g.homework.lesson_9.level_7_senior.super_task_2;

class BeforeBuilderClassTwo {
    private int obligatoryFieldOne = 10;
    private int obligatoryFieldTwo = 20;
    private int optionalFieldThree = 0;
    private int optionalFieldFour = 0;

    public BeforeBuilderClassTwo() {
    }

    public void setObligatoryFieldOne(int obligatoryFieldOne) {
        this.obligatoryFieldOne = obligatoryFieldOne;
    }

    public void setObligatoryFieldTwo(int obligatoryFieldTwo) {
        this.obligatoryFieldTwo = obligatoryFieldTwo;
    }

    public void setOptionalFieldThree(int optionalFieldThree) {
        this.optionalFieldThree = optionalFieldThree;
    }

    public void setOptionalFieldFour(int optionalFieldFour) {
        this.optionalFieldFour = optionalFieldFour;
    }

    @Override
    public String toString() {
        return "BeforeBuilderClassTwo {" +
                "obligatoryFieldOne=" + obligatoryFieldOne +
                ", obligatoryFieldTwo=" + obligatoryFieldTwo +
                ", optionalFieldThree=" + optionalFieldThree +
                ", optionalFieldFour=" + optionalFieldFour +
                '}';
    }
}
