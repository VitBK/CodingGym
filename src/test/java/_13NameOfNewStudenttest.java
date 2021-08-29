import data.Student;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _13NameOfNewStudenttest {

    @Test
    public void getNameNewStudenttest(){
        String expected = "Ilia";

        assertEquals(expected, Main.getNameNewStudent());
    }
}
