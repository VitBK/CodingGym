package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _6ProjectMaxStudentstest {

    @Test
    public void getProjectMaxStudentstest(){
        assertEquals("edp", Main.getProjectMaxStudents());
    }
}
