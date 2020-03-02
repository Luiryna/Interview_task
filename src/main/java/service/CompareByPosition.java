package service;

import beans.Employee;

import java.util.Comparator;

public class CompareByPosition implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getPosition().compareTo(t1.getPosition());
    }
}
