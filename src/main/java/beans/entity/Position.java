package beans.entity;

public enum Position {
    JUNIOR,
    MIDDLE,
    SENIOR;

    private int salary;

    public int getSalary(Position position) {
        switch (position) {
            case JUNIOR: {
                salary = 500;
                break;
            }
            case MIDDLE: {
                salary = 1000;
                break;
            }
            case SENIOR: {
                salary = 2000;
                break;
            }
        }
        return salary;
    }

    public static Position setPosition(String string) {
        Position position = null;
        switch (string) {
            case "JUNIOR": {
                position = JUNIOR;
                break;
            }
            case "MIDDLE": {
                position = MIDDLE;
                break;
            }
            case "SENIOR": {
                position = SENIOR;
                break;
            }
            default: {
                throw new NoSuchFieldError("invalid information");
            }
        }
        return position;
    }
}
