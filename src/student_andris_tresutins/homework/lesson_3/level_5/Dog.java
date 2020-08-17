package student_andris_tresutins.homework.lesson_3.level_5;

public class Dog {
    Dog(){}
    private String name="K-9 the dog";
    private int age;
    public String getDogName(){
        return this.name;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;

    }


    public String Voice(){
        return getDogName()+" ";

    }
//incomplete
}
