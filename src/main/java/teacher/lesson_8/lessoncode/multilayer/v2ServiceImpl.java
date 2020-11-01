package teacher.lesson_8.lessoncode.multilayer;

public class v2ServiceImpl implements Service{


    @Override
    public void putIntoDB(Integer myString) {
        System.out.println("v2 service string saved: " + myString);
    }

    @Override
    public Integer readFromDB(Integer id) {
        return id;
    }
}
