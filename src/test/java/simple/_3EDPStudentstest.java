package simple;

import middle.Lab;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3EDPStudentstest {
    @Test
    public void EDPStudentstest(){
        Lab lab = new Lab();

        assertEquals(lab.getEdpStudents(), _3EDPStudents.getEDPStudents());
    }
}
