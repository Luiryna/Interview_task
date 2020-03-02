package dao;

import beans.Employee;
import dao.Grouper;

import java.util.List;

public class TeamGrouper implements Grouper<Employee> {
    private List<Employee> employees;
    private static final int WORKING_HOURS_IN_A_DAY = 8;

    public TeamGrouper(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printEmployees() {
        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }

    public int getManHours(int days) {
        return employees.size() * WORKING_HOURS_IN_A_DAY * days;
    }
}
