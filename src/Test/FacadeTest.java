package Test;

import Lab.Pattern.Facade;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by User on 09.05.2018.
 */

public class FacadeTest {
    private Facade facade;

    @org.junit.Before
    public void Init() {
        this.facade = new Facade();
        this.facade.Create();
    }

    @Test
    public void CreateTest() {
        List<Integer> result = this.facade.Create();

        int filesCount = result.get(1);
        int directoriesCoiunt = result.get(0);

        assertEquals(filesCount, 3);
        assertEquals(directoriesCoiunt, 2);
    }

    @Test
    public void DestroyTest() {
        List<Integer> result = this.facade.Destroy();

        int filesCount = result.get(1);
        int directoriesCoiunt = result.get(0);

        assertEquals(filesCount, 0);
        assertEquals(directoriesCoiunt, 0);
    }

    @Test
    public void CreateFile() {
        boolean isCreated = facade.AddFile("C:/myfile.txt");
        assertTrue(isCreated);
    }

    @Test
    public void CreateDirectory() {
        boolean isCreated = facade.AddDirectory("root/home");
        assertFalse(isCreated);
    }
}
