package controller;

import beans.Employee;
import dao.FileReader;
import dao.Reader;
import exception.InvalidDataException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import service.TeamGrouper;
import service.comparator.CompareBySalary;
import service.finder.Selector;
import service.finder.SelectorBySalary;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Controller {
    private final Logger logger = LogManager.getLogger(Controller.class);
    private Reader reader = new FileReader();
    private List actual;

    {
        try {
            actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
        } catch (InvalidDataException | IOException e) {
            logger.log(Level.INFO, "Exception is here now");
            e.getMessage();
        }
    }

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
                logger.log(Level.INFO, "Man-hours counted");
                break;
            case  "SELECT":
                try {
                    bordersValidator(LOWER_BOUND, UPPER_BOUND);
                    Selector finder = new SelectorBySalary(actual);
                    finder.printResult(finder.getEmployees(actual, LOWER_BOUND, UPPER_BOUND));
                    logger.log(Level.INFO, "Employees found");
                } catch (InvalidDataException e) {
                    e.getMessage();
                }
                break;
            case "COMPARE":
                try {
                    workingDaysValidator(WORKING_DAYS);
                    Comparator<Employee> compareBySalary = new CompareBySalary();
                    TreeSet<Employee> people = new TreeSet(compareBySalary);
                    people.addAll(actual);

                    teamGrouper.printEmployees(people);
                    logger.log(Level.INFO, "Employees compared");
                } catch (InvalidDataException e) {
                    e.getMessage();
                }
                break;
            default:
                response = "We can't execute this command";
        }
        return response;
    }

    public void workingDaysValidator(int days) throws InvalidDataException{
        if (days < 1) {
            throw new InvalidDataException("Incorrect input days");
        }
    }

    public void bordersValidator(int lowerBorder, int upperBorder) throws InvalidDataException{
        if (lowerBorder < 0 ||lowerBorder >= upperBorder) {
            throw  new InvalidDataException("Incorrect input borders");
        }
    }
}
