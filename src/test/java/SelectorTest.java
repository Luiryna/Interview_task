import dao.FileReader;
import dao.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.finder.Selector;
import service.finder.SelectorBySalary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SelectorTest {

    Reader reader;
    List actual;
    Selector selector;
    int LOWER_BOUND = 100;
    int UPPER_BOUND = 1000;


    @BeforeEach
    void begin() throws IOException {
        reader = new FileReader();
        actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
    }

    @Test
    void findBySalary() {
        selector = new SelectorBySalary(actual);
        List result = new ArrayList(selector.getEmployees(actual, LOWER_BOUND, UPPER_BOUND));
        assertEquals(2, result.size(), "Wrong data");
    }
}
