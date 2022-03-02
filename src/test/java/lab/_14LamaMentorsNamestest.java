package lab;

import org.junit.jupiter.api.Test;
import workspace.Main;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _14LamaMentorsNamestest {

    @Test
    public void getLamaMentorsNamestest(){
        List<String> expected = new ArrayList<>();
        expected.add("Nikita");
        expected.add("Slava");
        expected.add("Anna");

        List<String> actual = Main.getLamaMentorsNames();

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }
}
