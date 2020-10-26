package student_artur_martinenko.homework.lesson_4.level_5;

class LightColorDetector {

    public String detect(int wavelength){
        if( 380 <= wavelength && wavelength < 450){
            return "Violet";
        }else if( 450 <= wavelength && wavelength < 495){
            return "Blue";
        }else if( 495 <= wavelength && wavelength < 570){
            return "Green";
        }else if( 570 <= wavelength && wavelength < 590){
            return "Yellow";
        }else if( 590 <= wavelength && wavelength < 620){
            return "Orange";
        }else if( 620 <= wavelength && wavelength <= 750){
            return "Red";
        }else{
            return "Invisible Light";
        }
    }
    
}
