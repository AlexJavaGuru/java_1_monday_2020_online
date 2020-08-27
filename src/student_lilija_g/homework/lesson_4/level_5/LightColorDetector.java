package student_lilija_g.homework.lesson_4.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {

    public String detect(int wavelength){
        if (wavelength < 380)
            return "Invisible Light";
        else if (wavelength < 450)
            return "Violet";
        else if (wavelength < 495)
            return "Blue";
        else if (wavelength < 570)
            return "Green";
        else if (wavelength < 590)
            return "Yellow";
        else if (wavelength < 620)
            return "Orange";
        else if (wavelength < 751)
            return "Red";
        else
            return "Invisible Light";

    }
}