package beans.entity;

import exception.InvalidDataException;

public enum ProgrammingLanguage {
    JAVA,
    KOTLIN,
    JAVASCRIPT;

    public static ProgrammingLanguage setProgLanguage(String string) throws InvalidDataException{
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
                throw new InvalidDataException("invalid information");
            }
        }
        return programmingLanguage;
    }
}
