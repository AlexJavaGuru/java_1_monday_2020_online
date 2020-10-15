package student_andris_tresutins.homework.lesson_9.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }


    public String getCity() {
        return city;
    }
    public String getFullName() {
        return fullName;
    }
    public String getCountry() {
        return country;
    }
}
