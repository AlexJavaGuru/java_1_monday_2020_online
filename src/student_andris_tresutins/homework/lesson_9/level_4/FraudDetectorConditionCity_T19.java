package student_andris_tresutins.homework.lesson_9.level_4;

public class FraudDetectorConditionCity_T19 {

    boolean deniedCity(Trader t){

        String city = t.getCity();
        return "Sydney".equals(city);

    }
}
