package student_alexander_shl.homework.lesson_3.level_6.task_24;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CatDemo {
    public static void main(String[] args) {
        Cat catTest = new Cat("Murzik", 3, "Black&White");
        catTest.voice();

        catTest.state(true, "hungry");
        catTest.state(true, "sleeping");
        catTest.state(false, "hungry");
        catTest.state(false, "sleeping");
        }

    }
