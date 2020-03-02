package view;

import controller.FileReader;
import controller.Reader;
import dao.TeamGrouper;

import java.util.List;

public class Injector {
    private Reader reader;
    private List actual;
    private TeamGrouper teamGrouper;

    public Injector() {
        Menu mainMenu = new Menu();
        this.reader = new FileReader();
        this.actual = reader.load(reader.read("src\\main\\resources\\file.txt"));
        this.teamGrouper = new TeamGrouper(actual);

        addFirstMenu(mainMenu);
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
        menu.add(new MenuEntry("2", "Show all employees") {
            @Override
            public void doAction() {
                teamGrouper.printEmployees();
            }
        });
    }

}
