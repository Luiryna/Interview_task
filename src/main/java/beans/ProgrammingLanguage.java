package beans;

public enum ProgrammingLanguage {
    JAVA,
    KOTLIN,
    JAVASCRIPT;

    public static ProgrammingLanguage setProgLanguage(String string) {
        ProgrammingLanguage programmingLanguage = null;
        switch (string) {
            case "JAVA": {
                programmingLanguage = JAVA;
                break;
            }
            case "KOTLIN": {
                programmingLanguage = KOTLIN;
                break;
            }
            case "JAVASCRIPT": {
                programmingLanguage = JAVASCRIPT;
                break;
            }
            default: {
                throw new NoSuchFieldError("invalid information");
            }
        }
        return programmingLanguage;
    }
}
