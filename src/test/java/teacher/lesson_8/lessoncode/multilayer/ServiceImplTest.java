package teacher.lesson_8.lessoncode.multilayer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnit44Runner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnit44Runner.class)
public class ServiceImplTest {

    @Mock
    public Database database;

    @InjectMocks
    public ServiceImpl serviceSpy;

    @Test
    public void putIntoDB() {
        serviceSpy.putIntoDB(1);
    }

    @Test
    public void readFromDB() {
        doReturn(10).when(database).read(anyInt());
        Integer result = serviceSpy.readFromDB(1);
        assertEquals(Integer.valueOf(10), result);
    }
}