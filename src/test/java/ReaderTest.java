import beans.Developer;
import beans.Employee;
import beans.TeamLead;
import beans.Tester;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;
import dao.FileReader;
import dao.Reader;
import exception.InvalidDataException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReaderTest {
    Reader reader;
    List actual;

    @BeforeEach
    void begin() {
        reader = new FileReader();
    }

    @Test
    void readEmployees() throws IOException {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Developer("name1", ProgrammingLanguage.JAVA, Position.JUNIOR);
        Employee employee2 = new TeamLead("name2", ProgrammingLanguage.KOTLIN, Position.SENIOR);
        Employee employee3 = new Tester("name3", ProgrammingLanguage.JAVASCRIPT, Position.MIDDLE);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
        assertEquals(employees, actual);
    }

    @Test
    void throwsInvalidDataException() {
        assertThrows(InvalidDataException.class,
                () -> actual = reader.load(reader.read("src\\main\\resources\\file2.txt")));
    }
}
