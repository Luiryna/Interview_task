package service.finder;

import java.util.List;

public interface Selector<T> {
    List<T> getEmployees(List<T> list, int lowerBound, int upperBound);
    void printResult(List<T> list);
}
