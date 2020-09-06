package student_dmitry_vasiliev.lesson_4.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    public static String wave(int waveSize) {
        if (waveSize >= 380 && waveSize <=449)
            return "Violet";
        else if (waveSize >= 450 && waveSize <=494)
          return "Blue";
        else if (waveSize >= 495 && waveSize <=569)
            return "Green";
        else if (waveSize >= 570 && waveSize <=589)
            return "Yellow";
        else if (waveSize >= 590 && waveSize <=619)
            return "Yellow";
        else if (waveSize >= 620 && waveSize <=750)
            return "Yellow";
        else return "Invisible light";
    }
}


