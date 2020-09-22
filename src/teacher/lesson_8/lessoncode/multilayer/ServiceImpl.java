package teacher.lesson_8.lessoncode.multilayer;

public class ServiceImpl implements Service {

    @Override
    public void putIntoDB(String myString) {
        System.out.println("Saved string:" + myString);
    }

    @Override
    public String readFromDB(int id) {
        return "String by ID:" + id + " is " + "Hello";
    }
}
