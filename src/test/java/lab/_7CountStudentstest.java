package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _7CountStudentstest {

    @Test
    public void getCountAllStudentstest(){
        assertEquals(15L, Main.getCountAllStudents());
    }
}
