package service;

import beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class FinderBySalary implements Finder<Employee>{
    private List<Employee> employees;

    public FinderBySalary (List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getEmployees(List<Employee> list, int lowerBoud, int upperBound) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee: list) {
            if (employee.getSalary() >= lowerBoud && employee.getSalary() <= upperBound){
                result.add(employee);
            }
        }
        return result;
    }

    @Override
    public void printResult(List<Employee> list) {
        for (Employee employee: list) {
            System.out.println(employee.toString());
        }
    }
}
