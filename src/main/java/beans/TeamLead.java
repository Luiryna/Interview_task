package beans;

public class TeamLead extends Employee{
    public TeamLead(String name, ProgrammingLanguage programmingLanguage, Position position){
        super(name, programmingLanguage, position);
        setJob(Job.TEAMLEAD);
    }
}
