package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CatDemo {

    public static void main(String[] args) {
        Cat nyasha = new Cat("Nyasha", "Red", "very hungry");
        nyasha.moew();
        nyasha.setName();
        nyasha.setColor();
        nyasha.sleep();
        nyasha.moew();
        nyasha.eat("fish");
        nyasha.moew();
    }

}
