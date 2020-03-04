package dao;

import java.util.List;

public interface Reader<T> {
    List<String> read(String string);
    List<T> load(List<String> strings);

}