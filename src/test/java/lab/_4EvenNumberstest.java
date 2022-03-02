package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4EvenNumberstest {

    @Test
    public void getCoontOfEvenNumbers(){
        assertEquals(6, Main.getEvenNumbers());
    }
}
