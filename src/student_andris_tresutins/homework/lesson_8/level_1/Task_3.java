package student_andris_tresutins.homework.lesson_8.level_1;

public class Task_3 {

    private String fullName;
    private int age;
    private String address;

    Task_3(String fullName, int age, String address){

        this.fullName = fullName;
        this.age = age;
        this.address = address;

    }


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getInfo(){
        return fullName +", "+ age +", "+ address;

    }
}

