package student_andris_tresutins.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
 class LightColorDetector {

    public String detect(int color){

        String result = "";
        if(color >= 380 && color <= 449 ){
            result = "Violet";
        }
        else if(color >= 450 && color <= 494 ){
            result = "Blue";
        }
        else if(color >= 495 && color <= 569 ){
            result = "Green";
        }
        else if(color >= 570 && color <= 589 ){
            result = "Yellow";
        }
        else if(color >= 590 && color <= 619 ){
            result = "Orange";
        }
        else if(color >= 620 && color <= 750 ){
            result = "Red";
        }
        else{
            result = "Invisible Light";
        }
        return result;
    }
}
