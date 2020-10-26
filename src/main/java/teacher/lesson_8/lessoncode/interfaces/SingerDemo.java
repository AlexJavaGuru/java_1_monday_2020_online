package teacher.lesson_8.lessoncode.interfaces;

import teacher.lesson_8.lessoncode.interfaces.BritneySpears;
import teacher.lesson_8.lessoncode.interfaces.ElvisPresley;
import teacher.lesson_8.lessoncode.interfaces.MichaelJackson;

public class SingerDemo {

    public static void main(String[] args) {
        Singer elvisPresley = new ElvisPresley();
        Singer michaelJackson = new MichaelJackson();
        Singer britneySpears = new BritneySpears();

//        elvisPresley.sing();
//        michaelJackson.sing();
//        britneySpears.sing();

        Singer[] singers = new Singer[3];
        singers[0] = new ElvisPresley();
        singers[1] = new MichaelJackson();
        singers[2] = new BritneySpears();

        for (int i = 0; i < singers.length; i++) {
            singers[i].sing();
        }

    }
}
