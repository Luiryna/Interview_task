package service;

import beans.Employee;

public interface Grouper<T> {
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
