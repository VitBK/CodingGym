package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3Surnametest {

    @Test
    public void getSurnames(){
        String expected = "Aleksandrov, Averin, Arnautov";
        assertEquals(expected, Main.getSurnames());
    }
}
