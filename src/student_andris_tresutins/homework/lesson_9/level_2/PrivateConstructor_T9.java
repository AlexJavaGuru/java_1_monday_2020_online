package student_andris_tresutins.homework.lesson_9.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PrivateConstructor_T9 {
    String test;

   private PrivateConstructor_T9(String test){
        this.test = test;
    }

     String returnTest(){
        return test;
    }
}
