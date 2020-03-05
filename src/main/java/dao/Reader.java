package dao;

import exception.InvalidDataException;

import java.io.IOException;
import java.util.List;

public interface Reader<T> {
    List<String> read(String string) throws IOException;
    List<T> load(List<String> strings) throws InvalidDataException;

}