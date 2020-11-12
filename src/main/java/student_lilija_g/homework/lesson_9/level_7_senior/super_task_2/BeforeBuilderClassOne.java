package student_lilija_g.homework.lesson_9.level_7_senior.super_task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BeforeBuilderClassOne {

    private final int obligatoryFieldOne;
    private final int obligatoryFieldTwo;
    private final int optionalFieldThree;
    private final int optionalFieldFour;

    public BeforeBuilderClassOne(int obligatoryFieldOne, int obligatoryFieldTwo) {
        this.obligatoryFieldOne = obligatoryFieldOne;
        this.obligatoryFieldTwo = obligatoryFieldTwo;
        this.optionalFieldThree = 0;
        this.optionalFieldFour = 0;
    }

    public BeforeBuilderClassOne(int obligatoryFieldOne, int obligatoryFieldTwo, int optionalFieldThree) {
        this.obligatoryFieldOne = obligatoryFieldOne;
        this.obligatoryFieldTwo = obligatoryFieldTwo;
        this.optionalFieldThree = optionalFieldThree;
        this.optionalFieldFour = 0;
    }

    public BeforeBuilderClassOne(int obligatoryFieldOne, int obligatoryFieldTwo, int optionalFieldThree, int optionalFieldFour) {
        this.obligatoryFieldOne = obligatoryFieldOne;
        this.obligatoryFieldTwo = obligatoryFieldTwo;
        this.optionalFieldThree = optionalFieldThree;
        this.optionalFieldFour = optionalFieldFour;
    }

    @Override
    public String toString() {
        return "BeforeBuilderClassOne {" +
                "obligatoryFieldOne=" + obligatoryFieldOne +
                ", obligatoryFieldTwo=" + obligatoryFieldTwo +
                ", optionalFieldThree=" + optionalFieldThree +
                ", optionalFieldFour=" + optionalFieldFour +
                '}';
    }
}
