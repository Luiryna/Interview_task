import beans.Employee;
import controller.FileReader;
import controller.Reader;
import dao.TeamGrouper;
import service.comparator.CompareBySalary;
import service.finder.Selector;
import service.finder.SelectorBySalary;
import view.Injector;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
//        Reader reader = new FileReader();
//        List<String> file = reader.read("src\\main\\resources\\file.txt");
//        System.out.println(file);
//        List actual = reader.load(file);
//
//        Selector finder = new SelectorBySalary(actual);
//        finder.printResult(finder.getEmployees(actual, 100, 1000));
//
//        Comparator<Employee> compareBySalary = new CompareBySalary();
//        TreeSet<Employee> people = new TreeSet(compareBySalary);
//        people.addAll(actual);
//
//        for(Employee  p : people){
//            System.out.println(p.toString());
//        }
//
//        TeamGrouper teamGrouper = new TeamGrouper(actual);
//        System.out.println(teamGrouper.getManHours(2));
        Injector injector = new Injector();

    }
}
