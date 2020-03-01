package beans;

public class Tester extends Employee{
    public Tester(String name, ProgrammingLanguage programmingLanguage, Position position){
        super(name, programmingLanguage, position);
        setJob(Job.TESTER);
    }
}
