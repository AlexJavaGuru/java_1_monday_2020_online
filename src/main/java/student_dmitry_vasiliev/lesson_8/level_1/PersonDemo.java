package student_dmitry_vasiliev.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.fullName);
        System.out.println(person.age);
    }
}
