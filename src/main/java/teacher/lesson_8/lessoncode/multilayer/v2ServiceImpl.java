package teacher.lesson_8.lessoncode.multilayer;

public class v2ServiceImpl implements Service{


    @Override
    public void putIntoDB(String myString) {
        System.out.println("v2 service string saved: " + myString);
    }

    @Override
    public String readFromDB(int id) {
        return "id " + id;
    }
}
