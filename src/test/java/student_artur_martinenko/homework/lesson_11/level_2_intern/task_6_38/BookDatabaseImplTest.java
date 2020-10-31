package student_artur_martinenko.homework.lesson_11.level_2_intern.task_6_38;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnit44Runner.class)
public class BookDatabaseImplTest {

    @Mock
    private BookDatabaseImpl bookDatabase;

    @Test
    public void findById() {
        System.out.println(bookDatabase.findById(1L));
    }
}