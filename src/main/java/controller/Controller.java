package controller;

import beans.Employee;
import dao.FileReader;
import dao.Reader;
import service.TeamGrouper;
import service.comparator.CompareBySalary;
import service.finder.Selector;
import service.finder.SelectorBySalary;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Controller {
    private Reader reader = new FileReader();
    private List actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
    private TeamGrouper teamGrouper = new TeamGrouper(actual);
    private static final int WORKING_DAYS = 8;
    private static final int LOWER_BOUND = 100;
    private static final int UPPER_BOUND = 1000;

    public String executeTask(String request){
        String command;
        command = request;
        command = command.toUpperCase();
        String response = null;
        switch(command){
            case "SHOW_ALL":
                teamGrouper.printEmployees();
                break;
            case "MAN_HOURS":
                teamGrouper.printInformation(String.valueOf(teamGrouper.getManHours(WORKING_DAYS)));
                break;
            case  "SELECT":
                Selector finder = new SelectorBySalary(actual);
                finder.printResult(finder.getEmployees(actual, LOWER_BOUND, UPPER_BOUND));
                break;
            case "COMPARE":
                Comparator<Employee> compareBySalary = new CompareBySalary();
                TreeSet<Employee> people = new TreeSet(compareBySalary);
                people.addAll(actual);

                teamGrouper.printEmployees(people);
                break;
            default:
                response = "We can't execute this command";
        }
        return response;
    }
}
