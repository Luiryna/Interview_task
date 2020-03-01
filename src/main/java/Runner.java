import beans.Employee;
import controller.FileReader;
import controller.Reader;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new FileReader();
        List<String> file = reader.read("src\\main\\resources\\file.txt");
        System.out.println(file);
        List<Employee> actual = reader.load(file);
        for (Employee emp: actual) {
            System.out.println(emp.getName());
        }
    }
}
