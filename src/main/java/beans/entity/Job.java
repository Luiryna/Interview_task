package beans.entity;

import exception.InvalidDataException;

public enum  Job
{
    DEVELOPER,
    TEAMLEAD,
    TESTER;

    public static Job setJob(String string) throws InvalidDataException{
        Job job = null;
        switch (string) {
            case "DEVELOPER": {
                job = DEVELOPER;
                break;
            }
            case "TEAMLEAD": {
                job = TEAMLEAD;
                break;
            }
            case "TESTER": {
                job = TESTER;
                break;
            }
            default: {
                throw new InvalidDataException("invalid information");
            }
        }
        return job;
    }
}
