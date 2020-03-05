package dao;

import beans.*;
import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;
import exception.InvalidDataException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Reader<Employee> {
    public List<String> read(String string) throws IOException {
        List<String> lines;
            lines = Files.readAllLines(Paths.get(string), StandardCharsets.UTF_8);
        return lines;
    }

    public List<Employee> load(List<String> strings) throws InvalidDataException {

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Employee employee = null;
                employee = createEmployeeFromString(strings.get(i));
            employees.add(employee);
        }
        return employees;
    }

    public static Employee createEmployeeFromString(String string) throws InvalidDataException {
        Employee result = null;
        String[] parsed = parseEmployee(string);
        result = validateFromString(parsed);
        return result;
    }

    public static String[] parseEmployee(String string){
        String[] res = string.split(", ");
        return res;
    }

    public static Employee validateFromString(String[] strings) throws InvalidDataException {
        Employee result;
        Job job = Job.setJob(strings[0]);
        String name = strings[3];
        Position jobFunction = Position.setPosition(strings[2]);
        ProgrammingLanguage mainSkill = ProgrammingLanguage.setProgLanguage(strings[1]);
        result = EmployeeFactory.getType(job, name, mainSkill, jobFunction);
        return result;
    }
}
