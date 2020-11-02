package student_lilija_g.homework.lesson_9.level_7_senior.super_task_2;


class WithBuilderClass {

    private final int obligatoryFieldOne;
    private final int obligatoryFieldTwo;
    private final int optionalFieldThree;
    private final int optionalFieldFour;

    public static class Builder {

        private final int obligatoryFieldOne;
        private final int obligatoryFieldTwo;
        private int optionalFieldThree = 0;
        private int optionalFieldFour = 0;

        public Builder(int obligatoryFieldOne, int obligatoryFieldTwo) {
            this.obligatoryFieldOne = obligatoryFieldOne;
            this.obligatoryFieldTwo = obligatoryFieldTwo;
        }

        public Builder optionalFieldThree(int optionalFieldThree) {
            this.optionalFieldThree = optionalFieldThree;
            return this;
        }

        public Builder optionalFieldFour(int optionalFieldFour) {
            this.optionalFieldFour = optionalFieldFour;
            return this;
        }

        public WithBuilderClass build() {
            return new WithBuilderClass(this);
        }
    }

    private WithBuilderClass(Builder builder) {
        obligatoryFieldOne = builder.obligatoryFieldOne;
        obligatoryFieldTwo = builder.obligatoryFieldTwo;
        optionalFieldThree = builder.optionalFieldThree;
        optionalFieldFour = builder.optionalFieldFour;
    }

    @Override
    public String toString() {
        return "WithBuilderClass {" +
                "obligatoryFieldOne=" + obligatoryFieldOne +
                ", obligatoryFieldTwo=" + obligatoryFieldTwo +
                ", optionalFieldThree=" + optionalFieldThree +
                ", optionalFieldFour=" + optionalFieldFour +
                '}';
    }
}
