package student_aleksejs_ivanovs.homework.lesson_8.level_3.task_14;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нет =D Сделать все классы абстрактными, чтобы не реализовывать методы - это не правильное решение. Надо написать имлементацию")
class PetrolCar extends Car{

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }

}
//