package beans;

import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;

public class Developer extends Employee{
    public Developer(String name, ProgrammingLanguage programmingLanguage, Position position){
        super(name, programmingLanguage, position);
        setJob(Job.DEVELOPER);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public Position getPosition() {
        return super.getPosition();
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
