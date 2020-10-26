package student_dmitry_vasiliev.lesson_4.level_5;
/*Разработать программу,
        которая работает в соответствии с требованиями, описанными ниже.

        Функциональные требования:
        Программа должна определять цвет в зависимости
        от длины волны в соответствии со следующими правилами:

        380 ... 449 - Фиолетовый ("Violet")
        450 ... 494 - Синий ("Blue")
        495 ... 569 - Зеленый ("Green")
        570 ... 589 - Желтый ("Yellow")
        590 ... 619 - Оранжевый ("Orange")
        620 ... 750 - Красный ("Red")
        Вне диапазонов - невидимый спектр ("Invisible Light")

        Логика с определением цвета должна быть реализована
        в отдельном классе LightColorDetector:

class LightColorDetector {
​
    public String detect(int wavelength) {
        //TODO
    }

}

    Написать тестовые сценарии для класса LightColorDetector
    в классе LightColorDetectorTest. Тестовые сценарии должны
        покрывать все возможные варианты.

 */
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
            return "Orange";
        else if (waveSize >= 620 && waveSize <=750)
            return "Red";
        else return "Invisible light";
    }
}


