package beans;

public enum  Job
{
    DEVELOPER,
    TEAMLEAD,
    TESTER;

    public static Job setJob(String string) {
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
                throw new NoSuchFieldError("invalid information");
            }
        }
        return job;
    }
}
