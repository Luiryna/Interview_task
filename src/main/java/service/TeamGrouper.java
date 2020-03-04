package service;

import beans.Employee;

import java.util.List;
import java.util.TreeSet;

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

    public void printEmployees(TreeSet<Employee> employees) {
        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }

    public void printInformation(String string) {
        System.out.println(string);
    }

    public int getManHours(int days) {
        return employees.size() * WORKING_HOURS_IN_A_DAY * days;
    }
}
