package view;

import beans.Employee;
import controller.FileReader;
import controller.Reader;
import dao.TeamGrouper;
import service.comparator.CompareBySalary;
import service.finder.Selector;
import service.finder.SelectorBySalary;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Injector {
    private Reader reader;
    private List actual;
    private TeamGrouper teamGrouper;
    private static final int WORKING_DAYS = 8;
    private static final int LOWER_BOUND = 100;
    private static final int UPPER_BOUND = 1000;

    public Injector() {
        Menu mainMenu = new Menu();
        this.reader = new FileReader();
        this.actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
        this.teamGrouper = new TeamGrouper(actual);

        addFirstMenu(mainMenu);
        addSecondMenu(mainMenu);
        addThirdMenu(mainMenu);
        addFourthMenu(mainMenu);

        mainMenu.loopUntilExit();

    }

    public void addFirstMenu(Menu menu) {
        menu.add(new MenuEntry("1", "Show all employees") {
            @Override
            public void doAction() {
                teamGrouper.printEmployees();
            }
        });
    }

    public void addSecondMenu(Menu menu) {
        menu.add(new MenuEntry("2", "Show Man-Hours number") {
            @Override
            public void doAction() {
                teamGrouper.printInformation(String.valueOf(teamGrouper.getManHours(WORKING_DAYS)));
            }
        });
    }

    public void addThirdMenu(Menu menu) {
        menu.add(new MenuEntry("3", "Select by salary") {
            @Override
            public void doAction() {
                Selector finder = new SelectorBySalary(actual);
                finder.printResult(finder.getEmployees(actual, LOWER_BOUND, UPPER_BOUND));
            }
        });
    }

    public void addFourthMenu(Menu menu) {
        menu.add(new MenuEntry("4", "Compare by salary") {
            @Override
            public void doAction() {
                Comparator<Employee> compareBySalary = new CompareBySalary();
                TreeSet<Employee> people = new TreeSet(compareBySalary);
                people.addAll(actual);

                teamGrouper.printEmployees(people);
            }
        });
    }

}
