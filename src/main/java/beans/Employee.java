package beans;

import beans.entity.Job;
import beans.entity.Position;
import beans.entity.ProgrammingLanguage;

public class Employee {
    private String name;
    private ProgrammingLanguage programmingLanguage;
    private Position position;
    private Job job;
    private int salary;

    public Employee(String name, ProgrammingLanguage programmingLanguage, Position position) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.position = position;
        this.salary = position.getSalary(position);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name
                + ", job=" + job
                + ", position=" + position
                + ", salary=" + salary + "]";
    }
}
