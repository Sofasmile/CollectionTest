package com.collection;

public interface List<T> {
    void add(T t);

    void remove(int i);

    void clear();

    int size();

    T get(int i);
}
