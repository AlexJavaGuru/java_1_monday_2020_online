package student_andris_tresutins.homework.lesson_9.level_4;

public class FraudDetectorConditionCountry_T20 {

    boolean deniedCountry(Trader t){

        String country = t.getCountry();
        return "Jamaica".equals(country);

    }
}
