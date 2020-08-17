package student_andris_tresutins.homework.lesson_3.level_5;


public class DemoDog {
    public static void main(String[] args) {
        Dog newdog = new Dog();
        String klichka ="klichka : " + newdog.getDogName();
        String Voicedo ="voice : " + newdog.Voice();
        newdog.setAge(3);

        System.out.println(klichka);
        System.out.println("Dog age : " + newdog.getAge());
        System.out.println(Voicedo+newdog.getAge());
    }
//incomplete
}
