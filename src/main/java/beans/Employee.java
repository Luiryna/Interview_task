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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (!name.equals(employee.name)) return false;
        if (programmingLanguage != employee.programmingLanguage) return false;
        if (position != employee.position) return false;
        return job == employee.job;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + programmingLanguage.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + job.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
