package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _13NameOfNewStudenttest {

    @Test
    public void getNameNewStudenttest(){
        String expected = "Ilia";

        assertEquals(expected, Main.getNameNewStudent());
    }
}
