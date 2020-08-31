package teacher.lesson_6.lessoncode;

import javax.sound.midi.Soundbank;

public class ConverterDemo {

    public static void main(String[] args) {
        Converter converter = new Converter();
        //ASCII
        int resultCharToInt = converter.charToInt('А');
        System.out.println(resultCharToInt);

        char resultIntToChar = converter.intToChar(65);
        System.out.println(resultIntToChar);

    }
}
