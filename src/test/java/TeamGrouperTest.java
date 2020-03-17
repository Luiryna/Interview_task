import dao.FileReader;
import dao.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.TeamGrouper;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TeamGrouperTest {
    Reader reader;
    List actual;
    int WORKING_DAYS = 8;
    TeamGrouper teamGrouper;


    @BeforeEach
    void begin() throws IOException {
        reader = new FileReader();
        actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
        teamGrouper = new TeamGrouper(actual);
    }

    @Test
    void testManHours() {
        assertEquals(192, teamGrouper.getManHours(WORKING_DAYS));
    }
}
