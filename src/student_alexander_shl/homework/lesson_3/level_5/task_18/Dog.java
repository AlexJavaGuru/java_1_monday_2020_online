package student_alexander_shl.homework.lesson_3.level_5.task_18;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }
    void voice() {
        System.out.println(dogName + " "+ dogName + " "+ dogName);
    }

}
