package teacher.lesson_8.lessoncode.multilayer;

public class UI {

    private Service service = new v2ServiceImpl();

    public void askUser(String userString) {
        service.putIntoDB(userString);
    }

    public String giveUserInfo(int userInt) {
        return service.readFromDB(userInt);
    }
}
