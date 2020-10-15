package student_alexander_shl.homework.lesson_3.level_5.task_22;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dogTest = new Dog("Lisa", 5, "brown");
        dogTest.voice();
        dogTest.changeColor("black");
        dogTest.voice();
    }
}
