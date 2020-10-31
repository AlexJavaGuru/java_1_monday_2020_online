package teacher.lesson_8.lessoncode.multilayer;

public class ServiceImpl implements Service {

    private Database db;

    public ServiceImpl(Database db) {
        this.db = db;
    }

    public ServiceImpl() {
    }

    @Override
    public void putIntoDB(Integer input) {
        db.save(input);
    }

    @Override
    public Integer readFromDB(Integer id) {
        return db.read(id);
    }
}
