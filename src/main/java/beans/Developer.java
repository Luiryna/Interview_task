package beans;

public class Developer extends Employee{
    public Developer(String name, ProgrammingLanguage programmingLanguage, Position position){
        super(name, programmingLanguage, position);
        setJob(Job.DEVELOPER);
    }
}
