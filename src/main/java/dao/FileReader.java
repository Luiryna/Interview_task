package dao;

import beans.*;
import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;
import exception.InvalidDataException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Reader<Employee> {

    private final Logger logger = LogManager.getLogger(FileReader.class);

    public List<String> read(String string) throws InvalidDataException {
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(Paths.get(string));
            logger.log(Level.INFO, "file read");
        }
        catch (IOException e){
            throw new InvalidDataException("File doesn't exist");
        }
        if (lines == null){
            logger.log(Level.INFO, "NULL IN FILE");
        }
        return lines;
    }

    public List<Employee> load(List<String> strings) {
        if (strings == null) {
            logger.log(Level.INFO, "file = null");
        }
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Employee employee = createEmployeeFromString(strings.get(i));
            logger.log(Level.INFO, "employee" + employee);
            employees.add(employee);
        }
        return employees;
    }

    public static Employee createEmployeeFromString(String string) {
        Employee result = null;
        String[] parsed = parseEmployee(string);
        result = validateFromString(parsed);
        return result;
    }

    public static String[] parseEmployee(String string){
        String[] res = string.split(", ");
        return res;
    }

    public static Employee validateFromString(String[] strings) {
        Employee result;
        Job job = Job.setJob(strings[0]);
        String name = strings[3];
        Position jobFunction = Position.setPosition(strings[2]);
        ProgrammingLanguage mainSkill = ProgrammingLanguage.setProgLanguage(strings[1]);
        result = EmployeeFactory.getType(job, name, mainSkill, jobFunction);
        return result;
    }
}
