package student_andris_tresutins.homework.lesson_9.level_2;

class ConstructorChaining_T10 {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining_T10(String constructorName) {
        this.constructorName = constructorName;
    }

     public ConstructorChaining_T10(int parameterCount){
        this("constructor");
        this.parameterCount = parameterCount;

    }

}
