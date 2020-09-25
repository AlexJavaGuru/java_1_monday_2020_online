package student_andris_tresutins.homework.lesson_3.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы создали default конструктор. Его можно было не писать. Он (если вы не написали другой конструктор) всегда существует не явно в любом классе. Но если вы решили его написать," +
        "расположите его в правильном месте. Конструкторы идут после переменных и перед методами. ФОРМАТ")
 class Dog {
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
