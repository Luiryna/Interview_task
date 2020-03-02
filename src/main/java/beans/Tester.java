package beans;

import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;

public class Tester extends Employee{
    public Tester(String name, ProgrammingLanguage programmingLanguage, Position position){
        super(name, programmingLanguage, position);
        setJob(Job.TESTER);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public Position getPosition() {
        return super.getPosition();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public Job getJob() {
        return super.getJob();
    }

    @Override
    public void setJob(Job job) {
        super.setJob(job);
    }

    @Override
    public void setPosition(Position position) {
        super.setPosition(position);
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return super.getProgrammingLanguage();
    }

    @Override
    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        super.setProgrammingLanguage(programmingLanguage);
    }
}
