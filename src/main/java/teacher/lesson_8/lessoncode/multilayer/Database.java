package teacher.lesson_8.lessoncode.multilayer;

import java.util.List;

public class Database {

    private List<Integer> database;

    public void save(Integer data) {
        database.add(data);
    }

    public Integer read(Integer data) {
        for (Integer integer : database) {
            if (data.equals(integer)) {
                return integer;
            }
        }

        return null;
    }
}
