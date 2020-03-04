package view;

import controller.Controller;

public class Injector {
    private Controller controller;

    public Injector() {
        Menu mainMenu = new Menu();
        this.controller = new Controller();

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
                controller.executeTask("show_all");
            }
        });
    }

    public void addSecondMenu(Menu menu) {
        menu.add(new MenuEntry("2", "Show Man-Hours number") {
            @Override
            public void doAction() {
                controller.executeTask("man_hours");
            }
        });
    }

    public void addThirdMenu(Menu menu) {
        menu.add(new MenuEntry("3", "Select by salary") {
            @Override
            public void doAction() {
                controller.executeTask("select");
            }
        });
    }

    public void addFourthMenu(Menu menu) {
        menu.add(new MenuEntry("4", "Compare by salary") {
            @Override
            public void doAction() {
                controller.executeTask("compare");
            }
        });
    }

}
