package service;

import java.util.List;

public interface Finder<T> {
    List<T> getEmployees(List<T> list, int lowerBound, int upperBound);
    void printResult(List<T> list);
}
