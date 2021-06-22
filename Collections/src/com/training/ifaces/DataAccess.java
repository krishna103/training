package com.training.ifaces;
import java.util.*;
public interface DataAccess<T> {
    public boolean add(T t);
    public List<T> findAll();
    public boolean remove(T t);
    public List<T> getSortedListBy(String field);
}
