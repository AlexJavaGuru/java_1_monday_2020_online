package student_andris_tresutins.homework.lesson_8.level_1;


class PersonTask_4 extends Object {

    public static void main(String[] args) {
        PersonTask_4 victim = new PersonTask_4("Jeff");
        System.out.println(victim.getName());
    }

    String name;

    PersonTask_4(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}







