package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Name {
    private String firstName;
    private String secondName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;}

}
